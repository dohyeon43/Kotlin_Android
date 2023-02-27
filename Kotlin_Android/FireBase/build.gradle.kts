plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.example.firebase"
        minSdk = 31
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(Dependencies.AndroidX.CORE_KTX)
    implementation(Dependencies.AndroidX.COMPOSE_UI)
    implementation("androidx.compose.material:material:1.3.1")
    implementation(Dependencies.AndroidX.COMPOSE_PREVIEW)
    implementation(Dependencies.AndroidX.LIFECYCLE_LIVEDATA_KTX)
    implementation(Dependencies.AndroidX.ACTIVITY_COMPOSE)
    implementation(Dependencies.AndroidX.CORE_KTX)
    implementation(Dependencies.AndroidX.ACTIVITY_KTX)
    implementation("androidx.activity:activity-ktx:1.6.1")
    implementation("androidx.core:core-ktx:+")
    testImplementation(Dependencies.UnitTest.JUNIT)
    androidTestImplementation(Dependencies.AndroidTest.ANDROID_JUNIT)
    androidTestImplementation(Dependencies.AndroidTest.ESPRESSO_CORE)
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}")
    debugImplementation("androidx.compose.ui:ui-tooling:${Versions.COMPOSE}")
    debugImplementation("androidx.compose.ui:ui-test-manifest:${Versions.COMPOSE}")
}