package lessonce_16_pojo

/**
 * DATA - это классы которые не несут ни какой логики, пустые классы
 * параметры должны быть mutable или immutable
 *
 * DATA  не могут быть:
 * open
 * abstract
 * sealed
 * не могут быть внутренними
 * */

data class Person(val name:String,var age:Int)