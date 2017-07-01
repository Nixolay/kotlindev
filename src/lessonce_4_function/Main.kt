package lessonce_4_function
/*ФУНКЦИЯ*/
fun main(args: Array<String>) {
    val result = myFirstFunction4(2,3.2)
    println(result)
}

//функция имя_фугкции(принимаемые данные):возврщвеммые данные
fun myFirstFunction():Int{
    return 1
}

fun myFirstFunction2(a: Long):Int{
    return a.toInt()
}

fun myFirstFunction3(){}

fun myFirstFunction4(a:Long,b: Double)=a+b