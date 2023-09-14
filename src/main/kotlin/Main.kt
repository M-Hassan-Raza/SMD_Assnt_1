import Cricketer
import Bowler
import Batsman
import AllRounder
fun main(args: Array<String>) {
    val bowler = Bowler("Alice", 28, "England", 150, 5)
    val batsman = Batsman("Bob", 30, "Australia", 1000, 2)
    val allRounder = AllRounder(bowler, batsman, 1)

    allRounder.print()
    allRounder.getBowlerRanking()
    allRounder.getBatsmanRanking()
    println("Program arguments: ${args.joinToString()}")
}