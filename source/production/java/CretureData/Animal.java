package CretureData;

class Animal extends Creature implements Reproduction{
    Animal(){
        this.name="";
    }
    Animal(String name){
        this.name=name;
    }
    @Override
    public String toEat(){
        return "Ingestion";
    }
    @Override
    public String modeOfReproduction(){
        return "Sexual Reproduction";
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
