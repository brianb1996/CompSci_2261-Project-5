package edu.umsl;

import CretureData.AddAndDisplay;
import CretureData.CreatureLists;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreatureTest {

    static public void main(String[] args){
        CreatureLists currentLists = new CreatureLists();
        firstCreatures(currentLists);
        boolean goodInput;
        Scanner userInput = new Scanner(System.in);
        int inputToInt;
        do {
            goodInput = true;
            try {
                System.out.println("Creature Database");
                System.out.println("Press [1] - Add a new creature");
                System.out.println("Press [2] - View Creatures by category");
                System.out.println("Press [3] - Exit the Database");
                inputToInt = userInput.nextInt();
                switch (inputToInt) {
                    case 1 -> AddAndDisplay.NameNewCreature(currentLists);
                    case 2 -> AddAndDisplay.DisplayCategory(currentLists);
                    case 3 -> {
                        System.out.println("Thank you for using the Database");
                        goodInput = false;
                    }
                    default -> {
                        System.out.println("ERROR: Invalid input");
                        goodInput = false;
                    }
                }

            }catch (InputMismatchException ex){
                System.out.println("ERROR: Invalid input");
                userInput = new Scanner(System.in);
            }
        }while(goodInput);
        System.out.println("Now Exiting the Database");
    }
    public static void firstCreatures (CreatureLists currentList){
        AddAndDisplay.NameNewCreature(currentList, "Tiger", 'A');
        AddAndDisplay.NameNewCreature(currentList, "Northern Pine Tree", 'P');
        AddAndDisplay.NameNewCreature(currentList, "Pavement Mushroom", 'F');
    }

}
