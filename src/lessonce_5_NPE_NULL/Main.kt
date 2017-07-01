package lessonce_5_NPE_NULL

/*NUL_and_NPE*/

/*
*    ?  - Соглашаемся что можем получить null
*    !! - Соглашаемся с тем что тут может быть null
* */



fun main(args: Array<String>) {

    val st1: String?
    val st2: String

    st1 = getSt()
    st2 = getSt()!!

    val size1 = st1!!.length
    val size2 = st1!!.length
    val size3 = st2.length

    println(size1)
    println(size2)
}

fun getSt():String?{
    return null
}