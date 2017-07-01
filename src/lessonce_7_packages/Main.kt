package lessonce_7_packages

import lessonce_7_packages.animals.cat.Cat
import lessonce_7_packages.animals.dog.*

/**
 * Пакеты
 * их нужно именованть с маленькой буквы
 * создание внутрилежащих пакетов идет через точку
 */

fun main(args: Array<String>) {
    var cat = Cat()
    var dog = Dog()
    var dogs = Dogs()

    cat.speak()
    cat.talk()

    println()

    dog.speak()
    dog.talk()

    println()

    dogs.speak()
    dogs.talk()

}