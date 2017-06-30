import sun.security.util.Length

/**
 * Created by chan on 6/30/2017.
 */
fun main(args: Array<String>) {
    val name = "Chancmg"
    print(name + "\n")

    var fname = "Roshini"
    var lname = "Chandrasekar"

    println(fname + lname);
    println("Length of string is ${lname.length}")

    if (fname.equals("Roshini")) {
        println("She is my darling")
    }

    println("index of 3 is ${lname.get(3)}")
    println("index of 2 is ${lname[2]}")
    println("Contains ${lname.contains("Chan")}")
    println("Sub seq of Roshini is ${fname.subSequence(0, 3)}")
}