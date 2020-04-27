package com.example.pokemonbattlesimulator

/**
 * This class will be used to create Blaziken's stats, typing, and moves
 * @author Matthew Montada
 */
internal class Blaziken :
    Pokemon(364, 372, 262, 350, 262, 284, "fire", "fighting") {
    /**
     * Blaziken function
     */
    init {
        moves[0][0] = "Brave Bird"
        moves[0][1] = "100"
        moves[0][2] = "90"
        moves[0][3] = "flying"
        moves[0][4] = "physical"
        moves[1][0] = "Flare Blitz"
        moves[1][1] = "120"
        moves[1][2] = "75"
        moves[1][3] = "fire"
        moves[1][4] = "physical"
        moves[2][0] = "Solar Beam"
        moves[2][1] = "120"
        moves[2][2] = "75"
        moves[2][3] = "grass"
        moves[2][4] = "special"
        moves[3][0] = "Sky Uppercut"
        moves[3][1] = "90"
        moves[3][2] = "85"
        moves[3][3] = "fighting"
        moves[3][4] = "physical"
    }
}