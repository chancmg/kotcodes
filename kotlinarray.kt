/**
 * Created by chan on 6/30/2017.
 */

fun main(args: Array<String>) {
    var myarray = arrayOf(1, 1.3, "Chan")

    println("Size of the array is ${myarray.size}")
    println("first element is ${myarray.first()}")
    println("last element is" + myarray.last())
    var part = myarray.copyOfRange(0, 1)
    println("${part.size}")
    println("Index of chan is ${myarray.indexOf("Chan")}")
    var sqrarr = Array(5, { x -> x * x })
    println(sqrarr[2])
    var arr: Array<Int> = arrayOf(1, 2, 3)
    println(arr[2])
}
