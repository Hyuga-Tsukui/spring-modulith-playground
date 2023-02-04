import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.0.2"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.7.22"
	kotlin("plugin.spring") version "1.7.22"
}

group = "com.hyuga.tsukui"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	// https://mvnrepository.com/artifact/org.springframework.experimental/spring-modulith-core
	implementation("org.springframework.experimental:spring-modulith-core:0.3.0")
	// https://mvnrepository.com/artifact/org.springframework.experimental/spring-modulith-test
	implementation("org.springframework.experimental:spring-modulith-test:0.3.0")
	// https://mvnrepository.com/artifact/org.springframework.experimental/spring-modulith-actuator
	implementation("org.springframework.experimental:spring-modulith-actuator:0.3.0")
	// https://mvnrepository.com/artifact/org.springframework.experimental/spring-modulith-api
	implementation("org.springframework.experimental:spring-modulith-api:0.3.0")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	runtimeOnly("com.h2database:h2")
	runtimeOnly("org.postgresql:postgresql")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
