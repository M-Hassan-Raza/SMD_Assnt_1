open class Batsman(name: String, age: Int, nationality: String, val score: Int, val batsmanRanking: Int) :
    Cricketer(name, age, nationality) {
    override fun print() {
        super.print()
        println("Score: $score")
        println("Batsman Ranking: $batsmanRanking")
    }
    open fun getRanking() {
        println("Batsman Ranking: $batsmanRanking")
    }
}