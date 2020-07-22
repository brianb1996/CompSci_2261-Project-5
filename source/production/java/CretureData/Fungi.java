package CretureData;

class Fungi extends Creature implements Reproduction{
    Fungi(){
        this.name = "";
    }
    Fungi(String name){
        this.name = name;
    }
    @Override
    public String toEat(){
        return "External Digestion with Hyphae";
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
            return (this.name + super.toString(this));
        }
    }
}
