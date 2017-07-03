package lessonce_15_in

/**
 * Модификатор in
 */

fun main(args: Array<String>) {

    println("Numbers")
    var nums = 1..10
    val value = 3
    for (num in nums){
        if (num == value){
            println(true)
            break
        }
    }

    println(value in nums)

    //------------------------------------------------------------------------------------------------------------------
    //----character
    println()
    println("Characters:")
    val characters = 'a'..'z'
    println('s' in characters)
    val word = "word"
    println('w' in word)

}