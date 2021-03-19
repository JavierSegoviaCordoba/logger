plugins { `kotlin-dsl` }

repositories {
    mavenCentral()
    jcenter()
    google()
    gradlePluginPortal()
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())

    implementation(files(pluginLibs.javaClass.protectionDomain.codeSource.location))

    pluginLibs.apply {
        implementation(javiersc.massiveCatalogs.pluginsAccessors)

        implementation(javiersc.gradlePlugins.changelog)
        implementation(javiersc.gradlePlugins.codeAnalysis)
        implementation(javiersc.gradlePlugins.codeFormatter)
        implementation(javiersc.gradlePlugins.dependencyUpdates)
        implementation(javiersc.gradlePlugins.docs)
        implementation(javiersc.gradlePlugins.kotlinMultiplatform)
        implementation(javiersc.gradlePlugins.publishKotlinMultiplatform)
        implementation(javiersc.gradlePlugins.nexus)
        implementation(javiersc.gradlePlugins.readmeBadgesGenerator)
        implementation(javiersc.gradlePlugins.versioning)

        implementation(android.toolsBuild.gradle)
        implementation(jetbrains.kotlin.kotlinSerialization)
        implementation(jetbrains.kotlinx.binaryCompatibilityValidator)
    }
}
