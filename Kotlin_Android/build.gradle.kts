buildscript {
    val compose_ui_version by extra("1.1.1")
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.4.1")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.

tasks.register("clean",Delete::class) {
    delete(rootProject.buildDir)
}
