class LambdaTest(private val src: String)  {

    private var _src: String = ""

    init {
        _src = src
    }

    fun run() {
        println("----------------")
        println("running LambdaTest... $_src")
        val asc = Array(5) { i -> (i*i).toString() }
        for(i in asc.indices) {
            println(asc[i])
        }
    }

}