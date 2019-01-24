version = "1.0"
group = "ch.peters.daniel"


plugins {
  java
  kotlin("jvm") version "1.3.20"
  application
  groovy
}

application {
  applicationName = "postfixcalculator"
  mainClassName = "${project.group}.$applicationName.App"
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation("com.fasterxml.jackson.core:jackson-core:2.9.8")
  implementation("com.fasterxml.jackson.core:jackson-annotations:2.9.8")
  implementation("com.fasterxml.jackson.core:jackson-databind:2.9.8")
  implementation("com.jfoenix:jfoenix:9.0.8")
  testImplementation("org.codehaus.groovy:groovy-all:2.5.5")
  testImplementation("org.spockframework:spock-core:1.2-groovy-2.5")
  testImplementation("junit:junit:4.12")
}

repositories {
  jcenter()
}

tasks.withType(JavaExec::class.java) {
  standardInput = System.`in`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10
}

