package CretureData;
//Animal class
class Animal extends Creature implements Reproduction{
    // constructors are not public so that objects can not be made outside of the package
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
