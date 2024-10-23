import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    java
    `maven-publish`
    signing
    alias(libs.plugins.dokka)
//    alias(libs.plugins.kapt)
    alias(libs.plugins.kotlin)
}

val NAME="message-digest-kotlin"

group = "io.github.yin-jinlong"
version = "0.1.1"
description = "Message Digest Utils for kotlin"

Props.init(rootDir)

repositories {
    projectMavenLocal(project)
    maven("https://maven.aliyun.com/repository/public")
    maven("https://maven.aliyun.com/repository/central")
    mavenCentral()
}


java {
    withSourcesJar()
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}


dependencies {
    // Kotlin
    implementation(libs.kotlin.reflect)

    // Test
    testImplementation(libs.kotlin.test.junit5)
    testRuntimeOnly(libs.junit.platform.launcher)
    implementation(kotlin("script-runtime"))
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

val pushDir = rootDir.resolve(".m2/repository/io/github/yin-jinlong/$NAME/$version")

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.create("kotlinJavadocjar", Jar::class) {
    group = "build"
    archiveVersion = version.toString()
    archiveClassifier = "javadoc"
    val dokka = tasks.getByName("dokkaJavadoc", DokkaTask::class)
    dependsOn("dokkaJavadoc")
    from(dokka.outputDirectory)
}


signing {
    useGpgCmd()
}


publishing {
    publications {
        create(project) {
            from(components["java"])
            val docT = tasks.getByName("kotlinJavadocjar", Jar::class)
            artifact(docT.archiveFile) {
                classifier = "javadoc"
            }

            pom {
                name = artifactId
                description = project.description
                url = "https://github.com/Yin-Jinlong/$NAME"

                licenses {
                    license {
                        name = "MIT"
                        url = "https://opensource.org/license/MIT"
                    }
                }

                developers {
                    developer {
                        name = "Yin Jinlong"
                        email = "yjl_1567@qq.com"
                        url = "https://github.com/Yin-Jinlong"
                        timezone = "Asia/Shanghai"
                    }
                }

                scm {
                    connection = "scm:git:git://github.com/Yin-Jinlong/$NAME.git"
                    developerConnection = "scm:git:ssh://github.com/Yin-Jinlong/$NAME.git"
                    url = "https://github.com/Yin-Jinlong/$NAME"
                }

            }
        }
    }

    repositories {
        projectMavenLocal(project)
    }

}


tasks.withType<PublishToMavenRepository> {
    doLast {
        pushDir.listFiles()?.forEach {
            if (it.isFile) {
                if (it.name.endsWith(".jar") ||
                    it.name.endsWith(".pom") ||
                    it.name.endsWith("module")
                ) {
                    signing.sign(it)
                }
            }
        }
    }
}