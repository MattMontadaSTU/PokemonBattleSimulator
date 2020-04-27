package com.example.pokemonbattlesimulator;

/**
 * This class will be used to create Sceptile's stats, typing, and moves
 * @author Matthew Montada
 *
 */
class Sceptile extends Pokemon
{
    /**
     * Sceptile Function
     */
    Sceptile()
    {
        super(344,295,251,339,295,372,"grass","null");
        moves[0][0]= "Faint Attack";
        moves[0][1]= "60";
        moves[0][2]= "100";
        moves[0][3]= "dark";
        moves[0][4]= "special";
        moves[1][0]= "Leaf Blade";
        moves[1][1]= "85";
        moves[1][2]= "100";
        moves[1][3]= "grass";
        moves[1][4]= "physical";
        moves[2][0]= "Psychic";
        moves[2][1]= "90";
        moves[2][2]= "90";
        moves[2][3]=  "psychic";
        moves[2][4]= "special";
        moves[3][0]= "Aerial Ace";
        moves[3][1]= "65";
        moves[3][2]= "100";
        moves[3][3]= "flying";
        moves[3][4]= "physical";
    }
}