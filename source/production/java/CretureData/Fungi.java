package CretureData;

public class Fungi extends Creature implements Reproduction{
    Fungi(){
        this.name = "";
    }
    Fungi(String name){
        this.name = name;
    }
    @Override
    public String toEat(){
        return "external digestion with hyphae";
    }
    @Override
    public String modeOfReproduction() {
        return "Spores";
    }
    @Override
    public String toString(){
        if(this.name.isEmpty()){
            return null;
        }else{
            return ("Fungi: " + this.name + super.toString(this));
        }
    }
}
