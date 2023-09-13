class Batsman(name: String, age: Int, nationality: String, val score: Int, val batsmanRanking: Int) :
    Cricketer(name, age, nationality) {
    open fun getRanking() {
        println("Batsman Ranking: $batsmanRanking")
    }
}