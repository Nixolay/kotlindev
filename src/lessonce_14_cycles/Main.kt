package lessonce_14_cycles

/**
 * Циклы
 *
 * Для прерывания цикла
 * можно использовать:
 * break - выйти из цикла
 * continue - перейти на следующий шаг цикла
 */

fun main(args: Array<String>) {
    var index: Int = 0

    println("while")
    while (index<10){
        print("$index ")
        index++
    }
    println()
    println()

    println("do while")
    index = 0
    do{
        print("$index ")
        index++
    }while (index<10)
    println()
    println()

    //------------------------------------------------------------------------------------------------------------------

    var nums = 1..10
    println("foreach")
    for (value in nums){
        print("$value ")
    }
    println()
    println()

    println("step")
    for (value in nums step 2){
        print("$value ")
    }
    println()
    println()

    println("downTo")
    for (value in 10 downTo 1){
        print("$value ")
    }
    println()
    println()


}
