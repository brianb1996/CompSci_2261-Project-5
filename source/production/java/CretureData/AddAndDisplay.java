package CretureData;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddAndDisplay {

    private AddAndDisplay(){}

    public static void NameNewCreature(CreatureLists currentCreatureList){
        Scanner userInput;
        System.out.println("What kind of creature would you like to add?");
        System.out.println("Press [X] - to Exit");

        char firstChar = input();
        userInput = new Scanner(System.in);
        switch (firstChar) {
            case 'a', 'A' -> {
                System.out.println("Please Enter the name of the Animal: ");
                currentCreatureList.addList(new Animal(userInput.nextLine()));
            }
            case 'p', 'P' -> {
                System.out.println("Please Enter the name of the Plant: ");
                currentCreatureList.addList(new Plant(userInput.nextLine()));
            }
            case 'f', 'F' -> {
                System.out.println("Please Enter the name of the Fungi: ");
                currentCreatureList.addList(new Fungi(userInput.nextLine()));
            }
            case 'x', 'X' ->{}
            default -> {
                System.out.println("ERROR: Invalid Input");
            }
        }
    }

    public static void NameNewCreature(CreatureLists currentCreatureList, String name, char classLetter) {
        switch (classLetter) {
            case 'a', 'A' -> {
                currentCreatureList.addList(new Animal(name));
            }
            case 'p', 'P' -> {
                currentCreatureList.addList(new Plant(name));
            }
            case 'f', 'F' -> {
                currentCreatureList.addList(new Fungi(name));
            }

        }
    }

    public static void DisplayCategory(CreatureLists currentList){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What Creatures would you like to view?");
        System.out.println("Press [X] - for All Creatures");
        char firstChar = input();
                switch (firstChar) {
                    case 'a', 'A' -> {
                        currentList.displayAnimals();
                    }
                    case 'p', 'P' -> {
                        currentList.displayPlants();
                    }
                    case 'f', 'F' -> {
                        currentList.displayFungi();
                    }
                    case 'x', 'X' ->{
                        currentList.displayAnimals();
                        currentList.displayPlants();
                        currentList.displayFungi();


                    }
                }
    }

    public static char input(){
        Scanner userInput = new Scanner(System.in);
        char firstChar;
        do {
            try {
                System.out.println("Press [A] - for Animal");
                System.out.println("Press [P] - for Plant");
                System.out.println("Press [F] - for Fungi");
                firstChar = userInput.nextLine().charAt(0);
                if(firstChar == 'A' || firstChar == 'a' || firstChar == 'P' || firstChar == 'p' || firstChar == 'F' || firstChar == 'f' || firstChar == 'x' || firstChar == 'X'){
                    return firstChar;
                }else{
                    System.out.println("ERROR: Invalid Input");
                }
            }catch(InputMismatchException ex){
                System.out.println("ERROR: Invalid Input");
                userInput = new Scanner(System.in);
            }
        }while(true);
    }
}
