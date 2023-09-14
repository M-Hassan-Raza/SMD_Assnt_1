class AllRounder(
    name: String,
    age: Int,
    nationality: String,
    wickets: Int,
    bowlerRanking: Int,
    score: Int,
    batsmanRanking: Int,
    val ranking: Int
) : Ranking {

    private val bowler = Bowler(name, age, nationality, wickets, bowlerRanking)
    private val batsman = Batsman(name, age, nationality, score, batsmanRanking)

    fun print() {
        bowler.print()
        batsman.print()
        println("Ranking: $ranking")
    }

    override fun getRanking() {
        bowler.getRanking()
        batsman.getRanking()
        println("Overall Ranking: $ranking")
    }
}