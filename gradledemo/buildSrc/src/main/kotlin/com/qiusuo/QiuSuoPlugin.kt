package com.qiusuo

import io.spring.gradle.dependencymanagement.DependencyManagementPlugin
import io.spring.gradle.dependencymanagement.internal.dsl.StandardDependencyManagementExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.ApplicationPlugin
import org.gradle.api.plugins.JavaPlugin
import org.springframework.boot.gradle.plugin.SpringBootPlugin

class QiuSuoPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.configurePlugins()
        target.configureRepositories()
    }
}

fun Project.configurePlugins() {
    pluginManager.apply(SpringBootPlugin::class.java)
    pluginManager.apply(DependencyManagementPlugin::class.java)
    pluginManager.apply(JavaPlugin::class.java)
    pluginManager.apply(ApplicationPlugin::class.java)
}

fun Project.configureRepositories() {
    repositories.mavenLocal()
    repositories.mavenCentral()
    repositories.jcenter()
}