package CretureData;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CreatureLists extends Creature implements Reproduction {
    Set<Plant> plantSet;
    Set<Animal> animalSet;
    Set<Fungi> fungiSet;

    public CreatureLists(){
        this.plantSet = new TreeSet<>();
        this.animalSet = new TreeSet<>();
        this.fungiSet = new TreeSet<>();
    }

    protected void addList(Object o1) {
        if(o1.getClass().equals(Animal.class)){
            animalSet.add((Animal)o1);
        }else if(o1.getClass().equals(Plant.class)){
            plantSet.add((Plant)o1);
        }else if(o1.getClass().equals(Fungi.class)){
            fungiSet.add((Fungi)o1);
        }
    }

    protected void displayAnimals(){
        System.out.println("Animals: ");
        for(Animal a1: animalSet){
            System.out.println(a1.toString());
        }
    }

    protected void displayPlants(){
        System.out.println("Plants: ");
        for(Plant p1: plantSet){
            System.out.println(p1.toString());
        }
    }

    protected void displayFungi(){
        System.out.println("Fungi: ");
        for(Fungi f1: fungiSet){
            System.out.println(f1.toString());
        }
    }


    @Override
    public String toEat() {
        return null;
    }
    @Override
    public String modeOfReproduction() {
        return null;
    }


}
