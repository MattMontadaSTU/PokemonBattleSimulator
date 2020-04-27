package com.example.pokemonbattlesimulator;

/**
 * This class will be used to create Typhlosion's stats, typing, and moves
 * @author Matthew Montada
 *
 */
class Typhlosion extends Pokemon
{
    Typhlosion()
    {
        super(360,293,280,348,295,328,"fire","null");
        moves[0][0]= "Fire Blast";
        moves[0][1]= "5000";
        moves[0][2]= "75";
        moves[0][3]= "fire";
        moves[0][4]= "special";
        moves[1][0]= "Body Slam";
        moves[1][1]= "80";
        moves[1][2]= "100";
        moves[1][3]= "normal";
        moves[1][4]= "physical";
        moves[2][0]= "Brick Break";
        moves[2][1]= "75";
        moves[2][2]= "100";
        moves[2][3]=  "fighting";
        moves[2][4]= "physical";
        moves[3][0]= "Fire Punch";
        moves[3][1]= "75";
        moves[3][2]= "100";
        moves[3][3]= "fire";
        moves[3][4]= "physical";
    }
}