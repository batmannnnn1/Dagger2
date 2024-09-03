plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.dagger2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dagger2"
        minSdk = 26
        targetSdk = 34
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
kapt{
    generateStubs = true
}

dependencies {
// https://mvnrepository.com/artifact/com.google.dagger/dagger
    implementation("com.google.dagger:dagger:2.52")

    // https://mvnrepository.com/artifact/com.google.dagger/dagger-compiler
    kapt("com.google.dagger:dagger-compiler:2.51.1")


    compileOnly ("javax.annotation:jsr250-api:1.0")
    implementation ("javax.inject:javax.inject:1")


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}