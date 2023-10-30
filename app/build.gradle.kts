// (1) Define Plugin : java-library plugin
plugins {
    id("java-library")
}

// (2) Define Plugin : java-library plugin
java { // Extension for java-library plugin
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

// (3) Define module dependencies or external dependencies
dependencies {
    implementation(project(":business-logic"))
    implementation(project(":data-model"))
    implementation("org.apache.commons:commons-lang3:3.9")
}