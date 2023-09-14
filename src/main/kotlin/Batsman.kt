data class Batsman(
    override val name: String,
    override val age: Int,
    override val nationality: String,
    override val score: Int,
    override val batsmanRanking: Int
) : BatsmanInfo {
    override fun print() {
        println("Name: $name")
        println("Age: $age")
        println("Nationality: $nationality")
        println("Score: $score")
        println("Batsman Ranking: $batsmanRanking")
    }

    override fun getBatsmanRanking() {
        println("Batsman Ranking: $batsmanRanking")
    }
}