class Bowler(name: String, age: Int, nationality: String, val wickets: Int, val bowlerRanking: Int) :
    Cricketer(name, age, nationality) {
    open fun getRanking() {
        println("Bowler Ranking: $bowlerRanking")
    }
}