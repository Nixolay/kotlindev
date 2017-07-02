package lessonce_11_abstract_class_and_modificator_open.abstracts

/**
 * Модификатор open
 * говорит что класс открыт для носледования
 * */



open abstract class BaseTemplate {
    var count = 0
    fun a()= "Default"
    fun b(){
        println("Default")
    }

    fun inc(){
        count++
        println(count)
    }

    abstract fun dec()
}