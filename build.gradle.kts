version = "1.0"
group = "ch.peters.daniel"


plugins {
  java
  kotlin("jvm") version "1.2.61"
  application
  groovy
}



application {
  applicationName = "postfixcalculator"
  mainClassName = "${project.group}.$applicationName.App"
}

dependencies {
  implementation("com.google.guava:guava:23.0")
  implementation(kotlin("stdlib"))
  implementation("com.fasterxml.jackson.core:jackson-core:2.9.5")
  implementation("com.fasterxml.jackson.core:jackson-annotations:2.9.5")
  implementation("com.fasterxml.jackson.core:jackson-databind:2.9.5")
  implementation("com.jfoenix:jfoenix:9.0.6")
  testImplementation("org.codehaus.groovy:groovy-all:2.4.15")
  testImplementation("org.spockframework:spock-core:1.0-groovy-2.4")
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

