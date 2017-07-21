/**
 * Created by chan on 7/3/2017.
 */

fun main(args: Array<String>) {
    var onetoten = 1..10
    var tentoone = 10.downTo(1)
    var steps3 = onetoten.step(3)
    var twototwnty = 2.rangeTo(20)
    var reversedtwo = twototwnty.reversed()

    for (x in onetoten) println(x)
    for (x in tentoone) println(x)
    for (x in steps3) println(x)
    for (x in twototwnty) println(x)
    for (x in reversedtwo) println(x)
}