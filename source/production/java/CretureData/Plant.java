package CretureData;

public class Plant extends Creature implements Reproduction{
    Plant(){
        this.name ="";
    }
    Plant(String plantName){
        this.name=name;
    }
    @Override
    public String toEat(){
        return "sunlight (aka photosynthesis)";
    }
    @Override
    public String modeOfReproduction(){
        return "Seeds";
    }
    @Override
    public String toString(){
        if(this.name.isEmpty()){
            return null;
        }else{
            return ("Plant: " + this.name + super.toString(this));
        }
    }
}
