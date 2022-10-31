plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KAPT)
    id(Plugins.SECRETS_GRADLE_PLUGIN)
    id(Plugins.SAFEARGS)
    id(Plugins.PARCELIZE)
    id(Plugins.HILT_PLUGIN)
}

android {
    compileSdk = DefaultConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = "com.qualitybitz.booksearchapp"
        minSdk = DefaultConfig.MIN_SDK_VERSION
        targetSdk = DefaultConfig.TARGET_SDK_VERSION
        versionCode = DefaultConfig.VERSION_CODE
        versionName = DefaultConfig.VERSION_NAME

//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunner = "com.qualitybitz.booksearchapp.HiltTestRunner"
    }

    buildTypes {
        named("release") {
//            minifyEnabled false
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
    kapt {
        correctErrorTypes = true
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
        animationsDisabled = true
    }
}

dependencies {

    implementation(Dependencies.coreKtx)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.material)
    implementation(Dependencies.constraintLayout)

    // Test
    testImplementation(Testing.junit4)
    testImplementation(Testing.textExtTruth)
    testImplementation(Testing.textRunner)
    testImplementation(Testing.roboletric)
    testImplementation(Testing.testExtJunit)
    testImplementation(Testing.testCore)
    testImplementation(Testing.coroutineTest)

    androidTestImplementation(Testing.testExtJunit)
    androidTestImplementation(Testing.espressoCore)
    androidTestImplementation(Testing.espressoContrib)
    androidTestImplementation(Testing.hamcrest)
    androidTestImplementation(Testing.testCore)
    androidTestImplementation(Testing.textExtTruth)
    androidTestImplementation(Testing.textRunner)
    androidTestImplementation(Testing.coroutineTest)
    androidTestImplementation(Testing.hiltAndroidTesting)
    kaptAndroidTest(Testing.hiltAndroidCompiler)

    // Retrofit
    implementation(Dependencies.retrofit)
    implementation(Dependencies.retrofitConverterMoshi)

    // Moshi
    implementation(Dependencies.moshi)
    kapt(Dependencies.moshiKapt)

    // Okhttp
    implementation(Dependencies.okhttp)
    implementation(Dependencies.okhttpLoggingInterceptor)

    // Lifecycle
    implementation(Dependencies.lifecycleViewmodelKtx)
    implementation(Dependencies.lifecycleRuntimeKtx)
    implementation(Dependencies.lifecycleViewmodelSavedstate)

    // Coroutine
    implementation(Dependencies.coroutinesCore)
    implementation(Dependencies.coroutinesAndroid)

    // Coil
    implementation(Dependencies.coil)

    // Recyclerview
    implementation(Dependencies.recyclerview)

    // Navigation
    implementation(Dependencies.navigationFragementKtx)
    implementation(Dependencies.navigationUiKtx)

    // Room
    implementation(Dependencies.roomRuntime)
    implementation(Dependencies.roomKtx)
    kapt(Dependencies.roomKapt)
    implementation(Dependencies.roomPaging)

    // Kotlin serialization
    implementation(Dependencies.kotlinSerialization)

    // DataStore
    implementation(Dependencies.preferencesDatastore)

    // Paging
    implementation(Dependencies.paging)

    // WorkManager
    implementation(Dependencies.workmanager)

    // Hilt
    implementation(Dependencies.daggerHilt)
    kapt(Dependencies.daggerHiltKapt)

    // ViewModel delegate
    implementation(Dependencies.activityKtx)
    implementation(Dependencies.fragmentKtx)

    // Hilt extension
    implementation(Dependencies.hiltExtensionWork)
    kapt(Dependencies.hitlExtensionKapt)
}