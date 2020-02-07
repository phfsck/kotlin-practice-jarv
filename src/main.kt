
fun main() {
    val tj = TestJarv()
    tj.run()
    val bt = BasicTypes()
    bt.run()
    val lt = LambdaTest("test mic 1 2 3")
    lt.run()
    val a = 23
    val b = 32
    val sum: (Int, Int) -> Int = {x: Int, y: Int -> x + y}
    println("Some...: " + sum(21, 21))
//    myName(n -> System.out::println("My name is: " + n), "Jarvy")
}

fun myName(names: Names, name: String): Unit = names.sayName(name)

fun compare(a: String, b: String): Boolean = a.length > b.length