open class Bowler(name: String, age: Int, nationality: String, val wickets: Int, val bowlerRanking: Int) :
    Cricketer(name, age, nationality) {
    override fun print() {
        super.print()
        println("Wickets: $wickets")
        println("Bowler Ranking: $bowlerRanking")
    }
    open fun getRanking() {
        println("Bowler Ranking: $bowlerRanking")
    }
}