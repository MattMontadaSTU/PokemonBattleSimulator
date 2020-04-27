package com.example.pokemonbattlesimulator;

/**
 * This class will be used to create Feraligatr's stats, typing, and moves
 * @author Matthew Montada
 *
 */
class Feraligatr extends Pokemon
{
    /**
     * Feraligatr function
     */
    Feraligatr()
    {
        super(374,339,328,282,291,280,"water","null");
        moves[0][0]= "Hydro Pump";
        moves[0][1]= "120";
        moves[0][2]= "75";
        moves[0][3]= "water";
        moves[0][4]= "special";
        moves[1][0]= "Superpower";
        moves[1][1]= "120";
        moves[1][2]= "80";
        moves[1][3]= "fighting";
        moves[1][4]= "physical";
        moves[2][0]= "Ice Fang";
        moves[2][1]= "65";
        moves[2][2]= "90";
        moves[2][3]=  "ice";
        moves[2][4]= "physical";
        moves[3][0]= "Crunch";
        moves[3][1]= "80";
        moves[3][2]= "100";
        moves[3][3]= "dark";
        moves[3][4]= "physical";
    }
}