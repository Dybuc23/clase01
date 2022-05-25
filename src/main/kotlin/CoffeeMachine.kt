class CoffeeMachine (
    price: Double,
    color: String
): BaseCoffeeMachine(price, color){
    override val brand: String
        get() = "Brand Y"

    override fun makeCoffee(type: String): String {
        Thread.sleep(3500)
        return "Your $type is ready!"
    }
}