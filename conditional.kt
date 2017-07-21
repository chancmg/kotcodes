/**
 * Created by chan on 7/21/2017.
 */
fun main(args: Array<String>) {
    var age: Int
    age = 18

    when (age) {
        1, 2, 3, 4 -> {
            println("paal vaadi")
        }
        5 -> {
            println("1st std")
        }
        in 6..17 -> {
            val grade = age - 5
            println("in std $grade")
        }

        else -> {
            println("college")
        }
    }

    fun add(a: Int, b: Int): Int = a + b
    fun sub(a: Int = 1, b: Int = 1) = a - b
    println(add(5 + 5, 6))
    println(sub(5 + 5, 6))

    fun sayhello(name: String): Unit = println("Hello $name")
    sayhello("Chan")
    val (two, three) = twonum(1)
    println("1,$two,$three")

}

fun twonum(num: Int): Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}