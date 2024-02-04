fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
        println("[$prefix] $message")

        fun sum(x: Int, y: Int): Int {                                          // 3
            return x + y
        }

        println(sum(1, 2))



        fun multiply(x: Int, y: Int) = x * y


        println("Multiplication")
        println(multiply(5, 10))

        printMessageWithPrefix("Azul", "Cor")

    }
}