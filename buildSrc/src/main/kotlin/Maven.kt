import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.publish.PublicationContainer
import org.gradle.api.publish.maven.MavenPublication
import java.io.File

fun PublicationContainer.create(
    project: Project,
    configuration: MavenPublication.() -> Unit
): MavenPublication = create(
    project.name,
    MavenPublication::class.java
) {
    it.apply {
        groupId = project.group.toString()
        artifactId = project.name
        version = project.version.toString()

        pom {
            groupId = project.group.toString()
        }

    }.apply(configuration)
}

fun RepositoryHandler.projectMavenLocal(project: Project) {
    maven {
        it.url = File(project.rootDir, ".m2/repository").toURI()
    }
}