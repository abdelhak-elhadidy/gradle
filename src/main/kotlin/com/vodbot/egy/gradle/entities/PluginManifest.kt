package com.vodbot.egy.gradle.entities

data class PluginManifest(
    val pluginClassName: String?,
    val name: String,
    val version: Int,
    val requiresResources: Boolean
)