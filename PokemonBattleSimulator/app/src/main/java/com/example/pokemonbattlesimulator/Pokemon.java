package com.example.pokemonbattlesimulator;

public class Pokemon extends Battle {
    int HP,Def,SpDef,Att,SpAtt,Spe; //declares each stats
    String name,type1,type2; //declares the name and typings of each Pokemon
    String moves[][]; //Move array list
    /**
     *
     * @param h
     * @param a
     * @param d
     * @param sa
     * @param sd
     * @param s
     * @param t1
     * @param t2
     */
    Pokemon(int h,int a,int d,int sa,int sd, int s, String t1, String t2)
    {
        moves=new String[4][6];
        HP=h;
        Def=d;
        SpDef=sd;
        Att=a;
        SpAtt=sa;
        Spe=s;
        type1=t1;
        type2=t2;
    }
    /**
     * function that prints the moves
     */
    void printMoves(){
        for(int i=0;i<4;i++)
            System.out.println((i+1)+". "+moves[i][0]);
    }
    /**
     * Function that calculates the damage done by each move
     * @param P
     * @param m
     */
    void calculateDamage(Pokemon P, int m) {
        System.out.println("\n\n");
        double damage=0.0;
        double r=Math.random()*100;

        if(r>Double.parseDouble(moves[m][2])){ //if statement for moves that miss
            System.out.println("Attack missed!");
            return;
        }

        if(moves[m][4].equals("special")){ //Damage done by Special Attacks
            damage=SpAtt*Double.parseDouble(moves[m][1])/P.SpDef;
        }

        else{ //Damage done by Physical Attacks
            damage=Att*Double.parseDouble(moves[m][1])/P.Def;
        }

        double rawDam=damage;
        String typem=moves[m][3];
        String typep1=P.type1;
        String typep2=P.type2;

        if(typep1.equals("fire")) //Fire type effectiveness
        {
            if(typem.equals("fire"))
            {
                damage/=2;
            }
            else if(typem.equals("water"))
            {
                damage*=2;
            }
            else if(typem.equals("grass"))
            {
                damage/=2;
            }
            else if(typem.equals("ground"))
            {
                damage*=2;
            }
            else if(typem.equals("rock"))
            {
                damage*=2;
            }
            else if(typem.equals("ice"))
            {
                damage/=2;
            }
        }

        else if(typep1.equals("water")) //Water Type effectiveness
        {
            switch (typem) {
                case "fire":
                    damage /= 2;
                    break;
                case "water":
                    damage /= 2;
                    break;
                case "grass":
                    damage *= 2;
                    break;
                case "electric":
                    damage *= 2;
                    break;
                case "ice":
                    damage /= 2;
                    break;
            }
        }

        else if(typep1.equals("grass")) //Grass type effectiveness
        {
            switch (typem) {
                case "fire":
                    damage *= 2;
                    break;
                case "water":
                    damage /= 2;
                    break;
                case "grass":
                    damage /= 2;
                    break;
                case "ground":
                    damage /= 2;
                    break;
                case "rock":
                    damage *= 2;
                    break;
                case "ice":
                    damage *= 2;
                    break;
                case "flying":
                    damage *= 2;
                    break;
                case "electric":
                    damage /= 2;
                    break;
            }
        }

        else if(typep1.equals("psychic")) //Psychic Type effectiveness
        {
            if(typem.equals("psychic"))
            {
                damage/=2;
            }
            else if(typem.equals("dark"))
            {
                damage*=2;
            }
            else if(typem.equals("fighting"))
            {
                damage/=2;
            }
        }

        else if(typep1.equals("flying")) //Flying type effectiveness
        {
            if(typem.equals("ice"))
            {
                damage*=2;
            }
            else if(typem.equals("electric"))
            {
                damage*=2;
            }
            else if(typem.equals("fighting"))
            {
                damage/=2;
            }
            else if(typem.equals("rock"))
            {
                damage*=2;
            }
            else if(typem.equals("ground"))
            {
                damage=0;
            }
            else if(typem.equals("grass"))
            {
                damage/=2;
            }
        }

        else if(typep1.equals("ground")) //Ground Type Effectiveness
        {
            switch (typem) {
                case "ice":
                    damage *= 2;
                    break;
                case "electric":
                    damage = 0;
                    break;
                case "water":
                    damage *= 2;
                    break;
                case "grass":
                    damage *= 2;
                    break;
            }
        }

        else if(typep1.equals("poison")) //Poison Type effectiveness
        {
            switch (typem) {
                case "ground":
                    damage *= 2;
                    break;
                case "psychic":
                    damage *= 2;
                    break;
                case "grass":
                    damage /= 2;
                    break;
                case "poison":
                    damage /= 2;
                    break;
                case "fighting":
                    damage /= 2;
                    break;
            }
        }

        if(typep2.equals("null")) //If a certain type is ineffective towards another type
        {
            P.HP-=(int)(damage);
        }

        else //Else statement for other type effectiveness damage calculations
        {
            switch (typep2) {
                case "fire":
//Fire Type Effectiveness (Defense)

                    switch (typem) {
                        case "fire":
                            damage /= 2;
                            break;
                        case "water":
                            damage *= 2;
                            break;
                        case "grass":
                            damage /= 2;
                            break;
                        case "ground":
                            damage *= 2;
                            break;
                        case "rock":
                            damage *= 2;
                            break;
                        case "ice":
                            damage /= 2;
                            break;
                    }
                    break;
                case "water":
//Water type effectiveness (Defense)

                    switch (typem) {
                        case "fire":
                            damage /= 2;
                            break;
                        case "water":
                            damage /= 2;
                            break;
                        case "grass":
                            damage *= 2;
                            break;
                        case "electric":
                            damage *= 2;
                            break;
                        case "ice":
                            damage /= 2;
                            break;
                    }
                    break;
                case "grass":
//Grass Type Effectiveness (Defense)

                    switch (typem) {
                        case "fire":
                            damage *= 2;
                            break;
                        case "water":
                            damage /= 2;
                            break;
                        case "grass":
                            damage /= 2;
                            break;
                        case "ground":
                            damage /= 2;
                            break;
                        case "rock":
                            damage *= 2;
                            break;
                        case "ice":
                            damage *= 2;
                            break;
                        case "flying":
                            damage *= 2;
                            break;
                        case "electric":
                            damage /= 2;
                            break;
                    }
                    break;
                case "psychic":
//Psychic Type Effectiveness (Defense)

                    switch (typem) {
                        case "psychic":
                            damage /= 2;
                            break;
                        case "dark":
                            damage *= 2;
                            break;
                        case "fighting":
                            damage /= 2;
                            break;
                    }
                    break;
                case "flying":
//Flying Type Effectiveness (Defense)

                    switch (typem) {
                        case "ice":
                            damage *= 2;
                            break;
                        case "electric":
                            damage *= 2;
                            break;
                        case "fighting":
                            damage /= 2;
                            break;
                        case "rock":
                            damage *= 2;
                            break;
                        case "ground":
                            damage = 0;
                            break;
                        case "grass":
                            damage /= 2;
                            break;
                    }
                    break;
                case "ground":
//Ground Type Effectiveness (Defense)

                    if (typem.equals("ice")) {
                        damage *= 2;
                    } else if (typem.equals("electric")) {
                        damage = 0;
                    } else if (typem.equals("water")) {
                        damage *= 2;
                    } else if (typem.equals("grass")) {
                        damage *= 2;
                    }
                    break;
                case "poison":
//Poison Type Effectiveness (Defense)

                    switch (typem) {
                        case "ground":
                            damage *= 2;
                            break;
                        case "psychic":
                            damage *= 2;
                            break;
                        case "grass":
                            damage /= 2;
                            break;
                        case "poison":
                            damage /= 2;
                            break;
                        case "fighting":
                            damage /= 2;
                            break;
                    }
                    break;
            }

            P.HP-=(int)(damage);
        }

        if(damage==0) //What will be printed if a moves has no effect
            System.out.println(moves[m][0] +" has no effect on "+P.name);

        else if(damage>rawDam) //What will be printed if a move does super effective damage
        {
            System.out.println(moves[m][0] +" is Super Effective on "+P.name);
        }

        else if(damage<rawDam) //What will be printed if a move does not very effective damage
        {
            System.out.println(moves[m][0] +" is Not Very Effective on "+P.name);
        }
    }
}