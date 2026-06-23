package litcode

//Write a program to swap first character with last character of String array of Fruits

fun main() {

    val arr = arrayOf("Apple" , "Mango" , "Orange")

    for(i in arr){

        val charArray = i.toCharArray()

        charArray[0] =  charArray.last()
        charArray[charArray.lastIndex] = charArray.first()
        println(String(charArray))
    }
}
