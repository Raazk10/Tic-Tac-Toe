package tictactoe

fun main() {

    println("Enter Cells: ")
    val input = readLine()
    val myInput = input!!.toCharArray()
    println("---------")
    println("| ${myInput[0]} ${myInput[1]} ${myInput[2]} |")
    println("| ${myInput[3]} ${myInput[4]} ${myInput[5]} |")
    println("| ${myInput[6]} ${myInput[7]} ${myInput[8]} |")
    println("---------")


}