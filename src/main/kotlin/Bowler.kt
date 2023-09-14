data class Bowler(
    override val name: String,
    override val age: Int,
    override val nationality: String,
    override val wickets: Int,
    override val bowlerRanking: Int
) : BowlerInfo {
    override fun print() {
        println("Name: $name")
        println("Age: $age")
        println("Nationality: $nationality")
        println("Wickets: $wickets")
        println("Bowler Ranking: $bowlerRanking")
    }

    override fun getBowlerRanking() {
        println("Bowler Ranking: $bowlerRanking")
    }
}