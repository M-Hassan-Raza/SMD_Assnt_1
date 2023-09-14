data class AllRounder(
    val bowlerInfo: BowlerInfo,
    val batsmanInfo: BatsmanInfo,
    val ranking: Int
) : BowlerInfo, BatsmanInfo by batsmanInfo {
    override val name: String = bowlerInfo.name // You can choose which name to use
    override val age: Int = bowlerInfo.age // You can choose which age to use
    override val nationality: String = bowlerInfo.nationality // You can choose which nationality to use
    override val wickets: Int = bowlerInfo.wickets
    override val bowlerRanking: Int = bowlerInfo.bowlerRanking

    override fun getBowlerRanking() {
        println("Bowler Ranking: $bowlerRanking")
    }

    override fun print() {
        bowlerInfo.print()
        batsmanInfo.print()
        println("Ranking: $ranking")
    }
}