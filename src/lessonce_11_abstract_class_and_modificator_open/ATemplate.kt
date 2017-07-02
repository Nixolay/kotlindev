package lessonce_11_abstract_class_and_modificator_open

import lessonce_11_abstract_class_and_modificator_open.abstracts.BaseTemplate

/**
 * наследование нескольких классов запрещено
 * */

class ATemplate: BaseTemplate(){
    override fun dec() {
        count--
        println(count)
    }
}