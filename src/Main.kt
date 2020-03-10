import reactor.core.publisher.Flux
import java.util.*
import kotlin.collections.HashMap

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
//    myName(n: Names -> System.out::println("My name is: " + n), "Jarvy")
    val anonFuncTest = fun(s: String): String { return s}
    println(anonFuncTest("hello"))

    val testLambda = { s: String -> s.toUpperCase()}
    println(testLambda("wutdahell"))

    val fluxInt: Flux<Int> = Flux.range(1, 10)
    fluxInt.subscribe()

    println("-------------------------")
    val userPayload = UserPayload()
    userPayload.removeApplicationAttributes()
    userPayload.removeApplicationAttributes()
    userPayload.putApplicationAttributes(HashMap<String, Any?>())
    print(userPayload)

    println("-------------------------")
    val timezoneSample = "UTC -12:00"
    val matched = FunctionalProgramming.isTimezoneFormatValid(timezoneSample)
    println(matched)

//    val timeZoneId = TimeZone.getTimeZone("sss")
//    println(timeZoneId.id)
//    val validIds = TimeZone.getAvailableIDs()
//    println("--------------------------")
//    for(s in validIds)
//        println(s)
}

fun myName(names: Names, name: String): Unit = names.sayName(name)

fun compare(a: String, b: String): Boolean = a.length > b.length