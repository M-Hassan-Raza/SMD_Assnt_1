import Cricketer
import Bowler
import Batsman
import AllRounder
fun main() {
    val bowler = Bowler("Alice", 28, "England", 150, 5)
    val batsman = Batsman("Bob", 30, "Australia", 1000, 2)
    val allRounder = AllRounder("Charlie", 27, "India", 200, 800, 500, 1, 5)

    bowler.print()
    bowler.getRanking()

    batsman.print()
    batsman.getRanking()

    allRounder.print()
    allRounder.getRanking()
}