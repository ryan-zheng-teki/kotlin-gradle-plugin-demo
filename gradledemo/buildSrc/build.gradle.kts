plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    jcenter()
    maven { setUrl("https://plugins.gradle.org/m2/") }
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")
    implementation("io.spring.dependency-management:io.spring.dependency-management.gradle.plugin:1.0.10.RELEASE")
    implementation(group = "org.springframework.boot", name = "spring-boot-gradle-plugin", version = "2.4.3")
}