package lessonce_12_modificator_open.openexample

/**
 * override - это способ переопределения методов
 *
 * В джаве FINAL говорит что метод, класс, атрибут имеют
 * полность завершенную структуру и не иемют в будущем раширение функциональности
 *
 * В котлине все классы по умолчанию final
 * и для открытия их дольнейших доработок
 *необходимо использовать модификатор Open
 */

open  class Person(val name: String){
    open val  age: Int = 0
    open fun getAddress():String = "Test address"

    override fun toString():String = "Person(name='$name')"
}