rootProject.name = "understanding-gradle"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }

    // Reference To include additional Project to same Window: https://stackoverflow.com/a/29096428/2790197
    includeBuild("../my-build-logic")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    // Reference : https://stackoverflow.com/a/29096428/2790197
    includeBuild("../my-other-project")
}


// Alternate way to include modules such as `app` ,`business-logic` & `data-model`
rootDir.listFiles()?.filter { it.isDirectory && !it.isHidden}?.forEach{ projectPath ->
    include(projectPath.name)
}
