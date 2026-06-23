package litcode

fun main() {

    val romanMap = HashMap<Char,Int>()

    romanMap['I'] = 1
    romanMap['V'] = 5
    romanMap['X'] = 10
    romanMap['L'] = 50
    romanMap['C'] = 100
    romanMap['D'] = 500
    romanMap['M'] = 1000

    val text = "III"

    var sum=0

    for(i in text.toCharArray()){
       sum+= romanMap[i]!!
    }

    println("The answer $sum")


}
