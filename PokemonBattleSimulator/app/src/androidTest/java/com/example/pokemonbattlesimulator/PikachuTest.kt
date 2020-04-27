package com.example.pokemonbattlesimulator

internal class Pikachu :
    Pokemon(274, 229, 196, 218, 218, 306, "electric", "null") {
    init {
        moves[0][0] = "Thunderbolt"
        moves[0][1] = "90"
        moves[0][2] = "100"
        moves[0][3] = "electric"
        moves[0][4] = "special"
        moves[1][0] = "Thunder"
        moves[1][1] = "110"
        moves[1][2] = "70"
        moves[1][3] = "electric"
        moves[1][4] = "special"
        moves[2][0] = "Iron Tail"
        moves[2][1] = "100"
        moves[2][2] = "75"
        moves[2][3] = "steel"
        moves[2][4] = "physical"
        moves[3][0] = "Surf"
        moves[3][1] = "90"
        moves[3][2] = "100"
        moves[3][3] = "water"
        moves[3][4] = "special"
    }
}