package com.github.karollewandowski.reproduceenumsissue.enums

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity

internal class FrameworkInitializer : StartupActivity {

    override fun runActivity(project: Project) {
        println("Hello from intializer: ${project.getService(FrameworkSettings::class.java).frameworkVersion.subFramework}")
    }

}