// Since there's a bug in 1.3.50 you have to run script with: java -jar $KOTLIN_HOME/lib/kotlin-compiler.jar -script 
val greet = "Hello"

println(greet)
println(greet::class)
println(greet.javaClass)
