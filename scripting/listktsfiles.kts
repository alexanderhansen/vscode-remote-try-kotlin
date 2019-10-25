// #!/usr/local/sdkman/candidates/kotlin/current/bin/kotlinc-jvm -script
// Since there's a bug in 1.3.50 you have to run script with: java -jar $KOTLIN_HOME/lib/kotlin-compiler.jar -script 

java.io.File(".")
    .walk()
    .filter { file -> file.extension == "kts" }
    .forEach { println(it) }
