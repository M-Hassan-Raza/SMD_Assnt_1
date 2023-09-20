class AllRounder(
    name: String,
    age: Int,
    nationality: String,
    wickets: Int,
    bowlerRanking: Int,
    score: Int,
    batsmanRanking: Int,
    val ranking: Int
) : Batsman (name, age, nationality, score, batsmanRanking){

    private val bowler = Bowler(name, age, nationality, wickets, bowlerRanking)

    override fun print() {
        super.print()
        bowler.print()
        println("Ranking: $ranking")
    }

    override fun getRanking() {
        super.getRanking()
        bowler.getRanking()
        println("Overall Ranking: $ranking")
    }
}