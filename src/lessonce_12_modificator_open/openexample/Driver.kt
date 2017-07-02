package lessonce_12_modificator_open.openexample

class Driver(name:String):Person(name) {
    override val age:Int = 2

    override fun getAddress(): String {
        return super.getAddress()+": $age"
    }

    override fun toString(): String = super.toString()+": age = $age"
}