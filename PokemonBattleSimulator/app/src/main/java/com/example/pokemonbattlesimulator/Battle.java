package com.example.pokemonbattlesimulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Battle
{
    /**
     * The main function where the game will be run
     */
    public static void main(String args[]) throws IOException
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in); //Scanner for inputs
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //Buffered reader
        System.out.println("Welcome to Poke Battle Simulator. Get ready to battle"); //Greetings Message
        System.out.println("1. Venasaur 2. Charizard 3. Blastoise 4. Feraligatr 5. Typhlosion 6. Mewtwo 7. Swampert 8. Blaziken 9. Sceptile 10. Pikachu");
        System.out.println("Player 1 choose the Pokemon you want(number)"); //Prompts user to choose Pokemon
        int player1=sc.nextInt();
        Pokemon P1=null;
        switch(player1) {
            case 1: P1=new Venasaur();break; //1st Case: Venasaur 
            case 2: P1=new Charizard();break;  //2nd Case: Charizard
            case 3: P1=new Blastoise();break; //3rd Case: Blastoise
            case 4: P1=new Feraligatr();break; //4th Case: Feraligatr
            case 5: P1=new Typhlosion();break; //5th Case: Typhlosion
            case 6: P1=new Mewtwo();break; //6th Case: Mewtwo
            case 7: P1=new Swampert();break; //7th Case: Swampert
            case 8: P1=new Blaziken();break; //8th Case: Blaziken
            case 9: P1=new Sceptile();break; //9th Case: Sceptile
            case 10: P1=new Pikachu();break; //10th Case: Pikachu
            default:System.out.println("Wrong input!"); //What will be imprinted if the user inputs a number higher than 9
                System.exit(0); //Exit the program if the input is wrong
                break;
        }

        System.out.println("What would you like to name your Pokemon?"); //Prompts user to nickname Pokemon
        P1.name=br.readLine();
        System.out.println("Player 2 choose your Pokemon(number)");
        int p2=sc.nextInt();

        Pokemon P2=null;
        switch(p2) { //Same rules that apply to Player 2
            case 1: P2=new Venasaur();break;
            case 2: P2=new Charizard();break;
            case 3: P2=new Blastoise();break;
            case 4: P2=new Feraligatr();break;
            case 5: P2=new Typhlosion();break;
            case 6: P2=new Mewtwo();break;
            case 7: P2=new Swampert();break;
            case 8: P2=new Blaziken();break;
            case 9: P2=new Sceptile();break;
            case 10: P2=new Pikachu();break;

            default:System.out.println("Wrong input!");
                System.exit(0);
                break;
        }

        System.out.println("What would you like to name your Pokemon?");
        P2.name=br.readLine();
        System.out.println("\fLet the Battle begin");
        Pokemon Poke1,Poke2;

        if(P1.Spe>P2.Spe){ //What will occur when the Pokemon of the 1st player has higher speed than player 2           
            Poke1=P1;
            Poke2=P2;
        }
        else{ //If player2 is faster than player 1           
            Poke1=P2;
            Poke2=P1;
        }

        System.out.println(Poke1.name + " starts ");

        while(true){
            System.out.println("\n\n"+Poke1.name +"\nHP:"+Poke1.HP +"\n"); //Displays name and HP (Player 1)       
            System.out.println("Moves:");
            Poke1.printMoves(); //Displays moves (Player 1)     
            System.out.println("\n\n"+Poke2.name +"\nHP:"+Poke2.HP +"\n");  //Displays name and HP (Player 1)         
            System.out.println("Moves:");
            Poke2.printMoves(); //Displays moves (Player 2)     
            System.out.println("\n\n"+Poke1.name +", choose a move(number)"); //Prompts user to choose a move (Player 1)         
            int m1=sc.nextInt();
            m1--;
            System.out.println("\n\n"+Poke2.name +", choose a move(number)"); //Prompts user to choose a move (Player 2)          
            int m2=sc.nextInt();
            m2--;

            Poke1.calculateDamage(Poke2,m1);

            if(Poke2.HP<=0){ //What will occur if Player 2's Pokemon's HP reaches 0              
                System.out.println(Poke2.name +" is defeated! \n" + Poke1.name + " wins!");
                System.out.println("Do you want to battle again?(y/n)"); //Prompts the user if they want to battle again            
                char c=(br.readLine().toLowerCase()).charAt(0);
                if(c=='y')
                {
                    main(args); //restarts the main function is user says yes
                }
                else
                {
                    System.out.println("Thanks for playing");
                    System.exit(0); //exits program is user says no
                }
            }

            Poke2.calculateDamage(Poke1,m2);

            if(Poke1.HP<=0){ //Same rules that apply for Player 1        
                System.out.println(Poke1.name +" is defeated! \n" + Poke2.name + " wins!");
                System.out.println("Do you want to battle again?(y/n)");
                char c=sc.next().toLowerCase().charAt(0);
                if(c=='y')
                    main(args);
                else
                {
                    System.out.println("Thanks for playing");
                    System.exit(0);
                }
            }
            System.out.println("Enter any button to continue"); //what will be printed if the battle is not over and moves are declared         
            @SuppressWarnings("unused")
            String f=sc.next();
            System.out.print("\f");
        }
    }
}
