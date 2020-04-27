package com.example.pokemonbattlesimulator;

class Venasaur extends Pokemon {
    /**
     * This class will be used to create Venasaur's stats, typing, and moves
     * @author Matthew Montada
     *
     */
        /**
         * Venasaur function
         */
        Venasaur()
        {
            super(364,289,291,328,328,284,"grass","poison");
            moves[0][0]= "Solar Beam";
            moves[0][1]= "120";
            moves[0][2]= "75";
            moves[0][3]= "grass";
            moves[0][4]= "special";
            moves[1][0]= "Sludge Bomb";
            moves[1][1]= "90";
            moves[1][2]= "95";
            moves[1][3]= "poison";
            moves[1][4]= "special";
            moves[2][0]="Wood Hammer";
            moves[2][1]= "85";
            moves[2][2]= "90";
            moves[2][3]= "grass";
            moves[2][4]= "physical";
            moves[3][0]= "Bulldoze";
            moves[3][1]= "60";
            moves[3][2]= "100";
            moves[3][3]= "ground";
            moves[3][4]= "physical";
        }
    }
