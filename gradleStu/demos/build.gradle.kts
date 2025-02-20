plugins {
    application
    kotlin("jvm")
}

application {
    mainClassName = "Test"
}

dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}