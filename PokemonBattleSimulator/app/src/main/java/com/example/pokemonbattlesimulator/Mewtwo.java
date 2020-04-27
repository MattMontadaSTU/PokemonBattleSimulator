package com.example.pokemonbattlesimulator;

/**
 * This class will be used to create Mewtwo's stats, typing, and moves
 * @author Matthew Montada
 *
 */
class Mewtwo extends Pokemon
{
    /**
     * Mewtwo Function
     */
    Mewtwo()
    {
        super(4166,350,306,447,306,394,"psychic","null");

        moves[0][0]= "Psychstrike";
        moves[0][1]= "100";
        moves[0][2]= "100";
        moves[0][3]= "psychic";
        moves[0][4]= "special";
        moves[1][0]= "Aura Sphere";
        moves[1][1]= "100";
        moves[1][2]= "100";
        moves[1][3]= "fighting";
        moves[1][4]= "special";
        moves[2][0]= "Thunderbolt";
        moves[2][1]= "95";
        moves[2][2]= "100";
        moves[2][3]=  "electric";
        moves[2][4]= "special";
        moves[3][0]= "Ice Beam";
        moves[3][1]= "95";
        moves[3][2]= "95";
        moves[3][3]= "ice";
        moves[3][4]= "special";
    }
}