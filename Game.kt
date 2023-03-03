fun main (args: Array<String>){

    val options: Array<String> = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserchoice(options)
    printResult(userChoice, gameChoice)

}

fun getGameChoice(opts: Array<String>) = opts[(Math.random()*opts.size).toInt()]

fun getUserchoice(opts: Array<String>) : String {
    var  isValidChoice = false
    var userChoice = ""
    //Loopuntil userChoice is valid
    while(!isValidChoice) {
        //Ask user for choice
        println("Please enter one of the following:")
        for (item in opts) print(" $item")
        println(".")
        //Read user input
        val userInput = readln()
        //Validate users input
        if(userInput != null && userInput in opts) {
            isValidChoice=true
            userChoice = userInput
        }
        //if the choice is invalid inform the user
        if(!isValidChoice) println("Enter a valid choice.")

    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String){
    val result: String
    //Figure out the result
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") || (userChoice == "Paper" && gameChoice=="Rock")
        || (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You loose"
    //print result
    println("You chose $userChoice. I choose $gameChoice. $result")
}