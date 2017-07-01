package lessonce_6_class

import java.time.Year

class Car (private var weight:Double, private var yearMade:Int){
    var isNew: Boolean = true
    get(){
        println(field)
        return yearMade > (Year.now().value-3)
    }
    set(value){
        if (value){println("Yeees")}
        field=value
    }
}