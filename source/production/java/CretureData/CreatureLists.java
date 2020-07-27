package CretureData;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

//Creature List is used to order and display creature objects in a treeSet.
public class CreatureLists{
    Set<Plant> plantSet;
    Set<Animal> animalSet;
    Set<Fungi> fungiSet;

    //CreatureLists constructor
    public CreatureLists(){
        this.plantSet = new TreeSet<>();
        this.animalSet = new TreeSet<>();
        this.fungiSet = new TreeSet<>();
    }

    //adds a new creature to the corresponding TreeSet
    protected void addList(Object o1) {
        if(o1.getClass().equals(Animal.class)){
            animalSet.add((Animal)o1);
        }else if(o1.getClass().equals(Plant.class)){
            plantSet.add((Plant)o1);
        }else if(o1.getClass().equals(Fungi.class)){
            fungiSet.add((Fungi)o1);
        }
    }

    //Displays the Animals in the animalSet TreeSet
    protected void displayAnimals(){
        System.out.println("Animals: ");
        for(Animal a1: animalSet){
            System.out.println("\t" + a1.toString());
        }
    }

    //Displays the Plants in the plantSet TreeSet
    protected void displayPlants(){
        System.out.println("Plants: ");
        for(Plant p1: plantSet){
            System.out.println("\t" + p1.toString());
        }
    }

    //Displays the Fungi in the fungiSet TreeSet
    protected void displayFungi(){
        System.out.println("Fungi: ");
        for(Fungi f1: fungiSet){
            System.out.println("\t" + f1.toString());
        }
    }

}
