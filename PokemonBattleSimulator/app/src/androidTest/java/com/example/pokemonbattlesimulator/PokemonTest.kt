package com.example.pokemonbattlesimulator

open class Pokemon internal constructor(
    h: Int,
    a: Int,
    d: Int,
    sa: Int,
    sd: Int,
    s: Int,
    t1: String,
    t2: String
) :
    Battle() {
    var hP: Int = h //declares each stat variable
    private var def: Int = d
    private var spDef: Int = sd
    private var att: Int = a
    private var spAtt: Int = sa
    var spe : Int = s
    var name: Nothing? = null
    private var type1: String = t1
    private var type2: String = t2 //declares the name and typings of each Pokemon
    var moves: Array<Array<String?>> = Array(4) { arrayOfNulls<String>(6) } //Move array list
    /*
     * function that prints the moves
     */
    fun printMoves() {
        for (i in 0..3) println((i + 1).toString() + ". " + moves[i][0])
    }

    /*
     * Function that calculates the damage done by each move
     * @param P
     * @param m
     */
    fun calculateDamage(P: Pokemon, m: Int) {
        println("\n\n")
        var damage: Double
        val r = Math.random() * 100
        if (r > moves[m][2]!!.toDouble()) { //if statement for moves that miss
            println("Attack missed!")
            return
        }
        damage = if (moves[m][4] == "special") { //Damage done by Special Attacks
            spAtt * moves[m][1]!!.toDouble() / P.spDef
        } else { //Damage done by Physical Attacks
            att * moves[m][1]!!.toDouble() / P.def
        }
        val rawDam = damage
        val typem = moves[m][3]
        val typep1 = P.type1
        val typep2 = P.type2
        if (typep1 == "fire") //Fire type effectiveness
        {
            if (typem != "fire") {
                when (typem) {
                    "water" -> {
                        damage *= 2.0
                    }
                    "grass" -> {
                        damage /= 2.0
                    }
                    "ground" -> {
                        damage *= 2.0
                    }
                    "rock" -> {
                        damage *= 2.0
                    }
                    "ice" -> {
                        damage /= 2.0
                    }
                }
            } else {
                damage /= 2.0
            }
        } else if (typep1 == "water") //Water Type effectiveness
        {
            when (typem) {
                "fire" -> damage /= 2.0
                "water" -> damage /= 2.0
                "grass" -> damage *= 2.0
                "electric" -> damage *= 2.0
                "ice" -> damage /= 2.0
            }
        } else if (typep1 == "grass") //Grass type effectiveness
        {
            when (typem) {
                "fire" -> damage *= 2.0
                "water" -> damage /= 2.0
                "grass" -> damage /= 2.0
                "ground" -> damage /= 2.0
                "rock" -> damage *= 2.0
                "ice" -> damage *= 2.0
                "flying" -> damage *= 2.0
                "electric" -> damage /= 2.0
            }
        } else if (typep1 == "psychic") //Psychic Type effectiveness
        {
            if (typem != "psychic") {
                if (typem == "dark") {
                    damage *= 2.0
                } else if (typem == "fighting") {
                    damage /= 2.0
                }
            } else {
                damage /= 2.0
            }
        } else if (typep1 == "flying") //Flying type effectiveness
        {
            when (typem) {
                "ice" -> {
                    damage *= 2.0
                }
                "electric" -> {
                    damage *= 2.0
                }
                "fighting" -> {
                    damage /= 2.0
                }
                "rock" -> {
                    damage *= 2.0
                }
                "ground" -> {
                    damage = 0.0
                }
                "grass" -> {
                    damage /= 2.0
                }
            }
        } else if (typep1 == "ground") //Ground Type Effectiveness
        {
            when (typem) {
                "ice" -> damage *= 2.0
                "electric" -> damage = 0.0
                "water" -> damage *= 2.0
                "grass" -> damage *= 2.0
            }
        } else if (typep1 == "poison") //Poison Type effectiveness
        {
            when (typem) {
                "ground" -> damage *= 2.0
                "psychic" -> damage *= 2.0
                "grass" -> damage /= 2.0
                "poison" -> damage /= 2.0
                "fighting" -> damage /= 2.0
            }
        }
        if (typep2 == "null") //If a certain type is ineffective towards another type
        {
            P.hP -= damage.toInt()
        } else  //Else statement for other type effectiveness damage calculations
        {
            when (typep2) {
                "fire" -> when (typem) {
                    "fire" -> damage /= 2.0
                    "water" -> damage *= 2.0
                    "grass" -> damage /= 2.0
                    "ground" -> damage *= 2.0
                    "rock" -> damage *= 2.0
                    "ice" -> damage /= 2.0
                }
                "water" -> when (typem) {
                    "fire" -> damage /= 2.0
                    "water" -> damage /= 2.0
                    "grass" -> damage *= 2.0
                    "electric" -> damage *= 2.0
                    "ice" -> damage /= 2.0
                }
                "grass" -> when (typem) {
                    "fire" -> damage *= 2.0
                    "water" -> damage /= 2.0
                    "grass" -> damage /= 2.0
                    "ground" -> damage /= 2.0
                    "rock" -> damage *= 2.0
                    "ice" -> damage *= 2.0
                    "flying" -> damage *= 2.0
                    "electric" -> damage /= 2.0
                }
                "psychic" -> when (typem) {
                    "psychic" -> damage /= 2.0
                    "dark" -> damage *= 2.0
                    "fighting" -> damage /= 2.0
                }
                "flying" -> when (typem) {
                    "ice" -> damage *= 2.0
                    "electric" -> damage *= 2.0
                    "fighting" -> damage /= 2.0
                    "rock" -> damage *= 2.0
                    "ground" -> damage = 0.0
                    "grass" -> damage /= 2.0
                }
                "ground" ->  when (typem) {//Ground Type Effectiveness (Defense)
                    "ice" -> damage *= 2.0
                    "electric" -> damage = 0.0
                    "water" -> damage *= 2.0
                    "grass" -> damage *= 2.0
                }

                "poison" -> when (typem) {
                    "ground" -> damage *= 2.0
                    "psychic" -> damage *= 2.0
                    "grass" -> damage /= 2.0
                    "poison" -> damage /= 2.0
                    "fighting" -> damage /= 2.0
                }
            }
            P.hP -= damage.toInt()
        }
        when {
            damage == 0.0 //What will be printed if a moves has no effect
            -> println(moves[m][0].toString() + " has no effect on " + P.name)
            damage > rawDam //What will be printed if a move does super effective damage
            -> {
                println(moves[m][0].toString() + " is Super Effective on " + P.name)
            }
            damage < rawDam //What will be printed if a move does not very effective damage
            -> {
                println(moves[m][0].toString() + " is Not Very Effective on " + P.name)
            }
        }
    }

}