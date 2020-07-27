package CretureData;

import java.util.InputMismatchException;
import java.util.Scanner;


public class AddAndDisplay {

    private AddAndDisplay(){}

    // based on the users input the corresponding prompt will appear
    public static void NameNewCreature(CreatureLists currentCreatureList){
        Scanner userInput;
        System.out.println("What kind of creature would you like to add?");

        char firstChar = input("Press [X] - to Exit");
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

    // based on the input passed by the user a new creature will be created
    // used only to create creatures
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

    //used to prompt the user for which category of creature they would like to view
    public static void DisplayCategory(CreatureLists currentList){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What Creatures would you like to view?");
        char firstChar = input("Press [X] - for All Creatures");
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

    //takes input from the user to be used for the displayCategory and nameNewCreature method
    //if the input is does not correspond to the chars in the if statement the user will be prompted to enter a valid input
    public static char input(String x){ // string x corresponds to the prompt for the char x, if the user enters x for the displayCreature method all the creatures will be displayed
        Scanner userInput = new Scanner(System.in);
        char firstChar;
        do {
            try {
                System.out.println(x);
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
