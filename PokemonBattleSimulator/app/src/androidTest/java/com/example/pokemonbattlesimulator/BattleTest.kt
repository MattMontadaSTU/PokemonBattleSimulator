package com.example.pokemonbattlesimulator

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.system.exitProcess

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`) //Scanner for inputs
    val br = BufferedReader(InputStreamReader(System.`in`)) //Buffered reader
    println("Welcome to Poke Battle Simulator. Get ready to battle") //Greetings Message
    println("1. Venasaur 2. Charizard 3. Blastoise 4. Feraligatr 5. Typhlosion 6. Mewtwo 7. Swampert 8. Blaziken 9. Sceptile 10. Pikachu")
    println("Player 1 choose the Pokemon you want(number)") //Prompts user to choose Pokemon
    val player1 = sc.nextInt()
    val p1: Pokemon?
    when (player1) {
        1 -> p1 = Venasaur()
        2 -> p1 = Charizard()
        3 -> p1 = Blastoise()
        4 -> p1 = Feraligatr()
        5 -> p1 = Typhlosion()
        6 -> p1 = Mewtwo()
        7 -> p1 = Swampert()
        8 -> p1 = Blaziken()
        9 -> p1 = Sceptile()
        10 -> p1 = Pikachu()
        else -> {
            println("Wrong input!") //What will be imprinted if the user inputs a number higher than 9
            exitProcess(0) //Exit the program if the input is wrong
        }
    }
    println("What would you like to name your Pokemon?") //Prompts user to nickname Pokemon
    p1.name = br.readLine() as Nothing?
    println("Player 2 choose your Pokemon(number)")
    val p2 = sc.nextInt()
    val player2: Pokemon?
    when (p2) {
        1 -> player2 = Venasaur()
        2 -> player2 = Charizard()
        3 -> player2 = Blastoise()
        4 -> player2 = Feraligatr()
        5 -> player2 = Typhlosion()
        6 -> player2 = Mewtwo()
        7 -> player2 = Swampert()
        8 -> player2 = Blaziken()
        9 -> player2 = Sceptile()
        10 -> player2 = Pikachu()
        else -> {
            println("Wrong input!")
            exitProcess(0)
        }
    }
    println("What would you like to name your Pokemon?")
    player2.name = br.readLine()
    println("Let the Battle begin")
    val pokemon1: Pokemon?
    val pokemon2: Pokemon?
    if (p1.spe > player2.spe) { //What will occur when the Pokemon of the 1st player has higher speed than player 2
        pokemon1 = p1
        pokemon2 = player2
    } else { //If player2 is faster than player 1
        pokemon1 = player2
        pokemon2 = p1
    }
    println(pokemon1.name + " starts ")
    while (true) {
        println("\n\n" + pokemon1.name + "\nHP:" + pokemon1.hP + "\n") //Displays name and HP (Player 1)
        println("Moves:")
        pokemon1.printMoves() //Displays moves (Player 1)
        println("\n\n" + pokemon2.name + "\nHP:" + pokemon2.hP + "\n") //Displays name and HP (Player 1)
        println("Moves:")
        pokemon2.printMoves() //Displays moves (Player 2)
        println("\n\n" + pokemon1.name + ", choose a move(number)") //Prompts user to choose a move (Player 1)
        var m1 = sc.nextInt()
        m1--
        println("\n\n" + pokemon2.name + ", choose a move(number)") //Prompts user to choose a move (Player 2)
        var m2 = sc.nextInt()
        m2--
        pokemon1.calculateDamage(pokemon2, m1)
        if (pokemon2.hP <= 0) { //What will occur if Player 2's Pokemon's HP reaches 0
            println(pokemon2.name + " is defeated! \n" + pokemon1.name + " wins!")
            println("Do you want to battle again?(y/n)") //Prompts the user if they want to battle again
            val c = br.readLine().toLowerCase()[0]
            if (c == 'y') {
                main(args) //restarts the main function is user says yes
            } else {
                println("Thanks for playing")
                exitProcess(0) //exits program is user says no
            }
        }
        pokemon2.calculateDamage(pokemon1, m2)
        if (pokemon1.hP <= 0) { //Same rules that apply for Player 1
            println(pokemon1.name + " is defeated! \n" + pokemon2.name + " wins!")
            println("Do you want to battle again?(y/n)")
            val c = sc.next().toLowerCase()[0]
            if (c == 'y') main(args) else {
                println("Thanks for playing")
                exitProcess(0)
            }
        }
        println("Enter any button to continue") //what will be printed if the battle is not over and moves are declared
        sc.next()
    }
}
