data class Cricketer(
    override val name: String,
    override val age: Int,
    override val nationality: String
) : CricketerInfo {
    override fun print() {
        println("Name: $name")
        println("Age: $age")
        println("Nationality: $nationality")
    }
}