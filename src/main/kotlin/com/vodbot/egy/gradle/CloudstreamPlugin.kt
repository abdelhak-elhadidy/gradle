package com.vodbot.egy.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import com.vodbot.egy.gradle.tasks.registerTasks
import com.vodbot.egy.gradle.configuration.registerConfigurations

abstract class CloudstreamPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.create("vodbot", CloudstreamExtension::class.java, project)

        registerTasks(project)
        registerConfigurations(project)
    }
}