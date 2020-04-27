package com.example.pokemonbattlesimulator

/**
 * This class will be used to create Blastoise's stats, typing, and moves
 * @author Matthew Montada
 */
internal class Blastoise :
    Pokemon(362, 291, 328, 295, 339, 280, "water", "null") {
    /**
     * Blastoise function
     */
    init {
        moves[0][0] = "Surf"
        moves[0][1] = "95"
        moves[0][2] = "90"
        moves[0][3] = "water"
        moves[0][4] = "special"
        moves[1][0] = "Skull Bash"
        moves[1][1] = "80"
        moves[1][2] = "90"
        moves[1][3] = "normal"
        moves[1][4] = "physical"
        moves[2][0] = "Ice Beam"
        moves[2][1] = "95"
        moves[2][2] = "95"
        moves[2][3] = "ice"
        moves[2][4] = "special"
        moves[3][0] = "Earthquake"
        moves[3][1] = "100"
        moves[3][2] = "100"
        moves[3][3] = "ground"
        moves[3][4] = "physical"
    }
}