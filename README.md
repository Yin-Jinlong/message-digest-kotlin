# Message Digest Utils for kotlin

##  快速开始

`buld.gradle.kts`

```kotlin
dependencies {
    implementation("io.github.yin-jinlong:message-digest-kotlin:<version>")
}
```

```kotlin
val strMd5="string".md5
val fileMd5=File("test").md5
```