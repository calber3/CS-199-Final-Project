// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    ext.kotlin_version = '1.3.72'
    repositories {
        google()
        jcenter()
        maven {url = uri("maven.google.com")}
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.6.3")
       // classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        fileTree(dir "libs", include: ["YouTubeAndroidPlayerApi.jar"])
    }
}

allprojects {
    repositories {
        google()
        jcenter()

    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}