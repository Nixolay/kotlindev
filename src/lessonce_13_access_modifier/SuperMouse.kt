package lessonce_13_access_modifier

/**
 *
 */
 internal class SuperMouse : Mouse() {
    fun funB(){
        println("Super text")
        funA()
    }
}