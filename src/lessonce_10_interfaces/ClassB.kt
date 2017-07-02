package lessonce_10_interfaces

import lessonce_10_interfaces.interfaces.MyInterface


class ClassB:MyInterface {
    override fun A() {
        println("ClassB: i function A")
    }

    override fun B() {
        println("ClassB: i function B")
    }

}