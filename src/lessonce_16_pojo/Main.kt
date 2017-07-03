package lessonce_16_pojo

/**
 * POJO - это объекты, классы которые содержат какието свойства
 */

fun main(args: Array<String>) {

    val person = Person("Nix",24)
    val person2 = person.copy(age = 2)


    person.age = 29

    println(person)
    println(person2)

    val (age,name) = person
    println(age+" "+name)

    println(Person("Nix",24))
}