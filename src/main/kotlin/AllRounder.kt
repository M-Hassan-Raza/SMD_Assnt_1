class AllRounder(
    name: String,
    age: Int,
    nationality: String,
    wickets: Int,
    bowlerRanking: Int,
    score: Int,
    batsmanRanking: Int,
    val ranking: Int
) : Bowler(name, age, nationality, wickets, bowlerRanking), Batsman(name, age, nationality, score, batsmanRanking) {
    override fun print() {
        super.print()
        println("Ranking: $ranking")
    }

    override fun getRanking() {
        println("Ranking: $ranking")
    }
}