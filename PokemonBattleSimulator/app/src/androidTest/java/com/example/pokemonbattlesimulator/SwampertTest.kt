package com.example.pokemonbattlesimulator

/**
 * This class will be used to create Swampert's stats, typing, and moves
 * @author Matthew Montada
 */
internal class Swampert :
    Pokemon(404, 350, 306, 295, 306, 240, "water", "ground") {
    /**
     * Swampert function
     */
    init {
        moves[0][0] = "Muddy Water"
        moves[0][1] = "90"
        moves[0][2] = "90"
        moves[0][3] = "water"
        moves[0][4] = "special"
        moves[1][0] = "Hammer Arm"
        moves[1][1] = "100"
        moves[1][2] = "85"
        moves[1][3] = "figthing"
        moves[1][4] = "physical"
        moves[2][0] = "Blizzard"
        moves[2][1] = "120"
        moves[2][2] = "75"
        moves[2][3] = "ice"
        moves[2][4] = "special"
        moves[3][0] = "Earthquake"
        moves[3][1] = "100"
        moves[3][2] = "100"
        moves[3][3] = "ground"
        moves[3][4] = "physical"
    }
}