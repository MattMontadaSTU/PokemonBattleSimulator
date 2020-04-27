package com.example.pokemonbattlesimulator

/**
 * This class will be used to create Charizard's stats, typing, and moves
 * @author Matthew Montada
 */
class Charizard :
    Pokemon(360, 293, 280, 348, 295, 328, "fire", "flying") {
    init {
        moves[0][0] = "Flamethrower"
        moves[0][1] = "90"
        moves[0][2] = "95"
        moves[0][3] = "fire"
        moves[0][4] = "special"
        moves[1][0] = "Earthquake"
        moves[1][1] = "100"
        moves[1][2] = "100"
        moves[1][3] = "ground"
        moves[1][4] = "physical"
        moves[2][0] = "Air Slash"
        moves[2][1] = "85"
        moves[2][2] = "80"
        moves[2][3] = "flying"
        moves[2][4] = "special"
        moves[3][0] = "Rock Slide"
        moves[3][1] = "80"
        moves[3][2] = "85"
        moves[3][3] = "rock"
        moves[3][4] = "physical"
    }
}
