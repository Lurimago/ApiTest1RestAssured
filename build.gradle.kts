plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
    //testImplementation(platform("org.junit:junit-bom:5.9.1"))
    //testImplementation("org.junit.jupiter:junit-jupiter")

    // https://mvnrepository.com/artifact/io.rest-assured/rest-assured
    testImplementation("io.rest-assured:rest-assured:5.5.0")

    // https://mvnrepository.com/artifact/io.cucumber/cucumber-java
    implementation("io.cucumber:cucumber-java:6.10.3")
    testImplementation("io.cucumber:cucumber-junit:6.10.3")

    // https://mvnrepository.com/artifact/tech.grasshopper/extentreports-cucumber6-adapter
    implementation("tech.grasshopper:extentreports-cucumber6-adapter:2.18.0")

    // https://mvnrepository.com/artifact/org.json/json
    implementation("org.json:json:20180813")

    // https://mvnrepository.com/artifact/org.codehaus.groovy/groovy-all
    testImplementation(platform("org.junit:junit-bom:5.7.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
tasks.test {
    useJUnitPlatform()
}
