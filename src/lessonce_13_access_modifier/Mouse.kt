package lessonce_13_access_modifier

/**
 * Все в kotlin по умолчанию
 * public - тоесть доступно для использования в других пакетах
 * private - закрывает доступ
 * protected - доступ только в нутри пакета
 * internal - закрывает доступ из других модулей
 * */
public open class Mouse{
    private var a =1
    protected fun funA(){println("funA")}
}