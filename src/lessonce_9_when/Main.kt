package lessonce_9_when

import lessonce_8_enum.Colors
import lessonce_8_enum.Colors.*


/**
 * WHEN
 */

fun main(args: Array<String>) {

    println(getColor(WHITE))
    println(getColors(WHITE,BLACK))
    println(getNumberStr(1))
    println(getEquals(1,2))
}

fun getColor(color:Colors) = when (color) {
    GREEN -> "Зеленый"
    WHITE,BLACK -> "Белый или черный"
    RED -> "Краный"
}

fun getColors(color:Colors,color2:Colors) = when (setOf(color,color2)) {
    setOf(GREEN,RED) -> "Зелено-красный"
    setOf(WHITE,BLACK) -> "Бело-черный"
    else -> "Да кто его знает"
}

fun getNumberStr(N:Int) = when (N){
    1 -> "One"
    2 -> "Two"
    3 -> "Three"
    4 -> "Four"
    5 -> "Five"
    else -> "None"
}

fun getEquals(a:Int,b:Int) = when{
    (a>b)->"$a > $b = true"
    (a<b)->"$a < $b = true"
    (a==b)->"$a == $b = true"
    else -> {
        "NULL"
    }
}
