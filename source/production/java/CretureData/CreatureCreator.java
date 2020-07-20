package CretureData;


import java.util.HashSet;
import java.util.Set;

public class CreatureCreator extends Creature implements Reproduction {
    Set<Plant> plantSet;
    Set<Animal> animalSet;
    Set<Fungi> fungiSet;
    CreatureCreator(){
        this.plantSet = new HashSet<Plant>();
        this.animalSet = new HashSet<Animal>();
        this.fungiSet = new HashSet<Fungi>();
    }

    public void addList(Object o1) {
        if(o1.getClass().equals(Animal.class)){
            animalSet.add((Animal)o1);
        }else if(o1.getClass().equals(Plant.class)){
            plantSet.add((Plant)o1);
        }else if(o1.getClass().equals(Fungi.class)){
            fungiSet.add((Fungi)o1);
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
