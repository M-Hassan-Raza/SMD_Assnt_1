open class Cricketer(val name: String, val age: Int, val nationality: String) {
    open fun print() {
        println("Name: $name")
        println("Age: $age")
        println("Nationality: $nationality")
    }
}