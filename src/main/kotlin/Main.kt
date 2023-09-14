import Cricketer
import Bowler
import Batsman
import AllRounder
fun main(args: Array<String>) {
    val allRounder = AllRounder("Charlie", 27, "India", 200, 3, 800, 4, 1)
    allRounder.print()
    allRounder.getRanking()

    println("Program arguments: ${args.joinToString()}")
}