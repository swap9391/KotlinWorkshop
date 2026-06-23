package litcode

class RemoveDuplicateCharacters {

    //Write a program to remove duplicate character

    fun main() {


        val text = "ababcacb"

        val charArray = text.toCharArray()

        val charSet = HashSet<String>()

        val string = StringBuilder()

        for (i in charArray) {
            charSet.add(i.toString())
        }

        for (i in charSet) {
            string.append(i)
        }

        println("The answer is \"$string\", with the length of ${string.length}.")


    }
}