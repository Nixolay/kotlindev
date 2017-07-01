package lessonce_6_class

import java.time.Year


/**
 * Классы и их свойства
 */

fun main(args: Array<String>) {
    var person = Person("Name1","Last1",Integer(24))

    println(person.firstName)
    println(person.lastName)
    println(person.age)

    var car = Car(12.3, 3)
    println(Year.now().value)
    print(car.isNew)

}


