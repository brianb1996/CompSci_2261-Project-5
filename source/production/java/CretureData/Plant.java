package CretureData;

class Plant extends Creature implements Reproduction{
    // constructors are not public so that objects can not be made outside of the package

    Plant(){
        this.name ="";
    }
    Plant(String name){
        this.name=name;
    }
    @Override
    public String toEat(){
        return "Sunlight (aka photosynthesis)";
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
            return (this.name + super.toString(this));
        }
    }
}
