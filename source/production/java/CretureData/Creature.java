package CretureData;

import java.util.Iterator;

/**For your fifth project, you will be needing to do three things:
 *
 * 1) Implement an Interface.
 * 2) Inherit from an abstract class.
 * 3) Create either a SET or List of your elements.
 *
 * All creatures on earth share DNA in some manner. Taxonomists love to classify these creatures
 * into classes. Because computers are the way of the future, these unnamed taxonomists want you
 * to write a program which classifies Plants, Animals, and Fungi!
 *
 * Your Plant, Animal, and Fungi classes should all inherit from an abstract class called "creature"
 * which has the function "eatFood".
 *
 * - Your Plant class must override the function eat food and return "sunlight (aka photosynthesis)".
 * - Your animal class must override the function eatFood and return "ingestion".
 * - Your fungi class must override the function eatFood and return "external digestion with hyphae".
 *
 * Your classes must also implement the interface Reproduction, which has the function "modeOfReproduction".
 * Implementing the interface:
 *
 * - Animals must return the string "Sexual Reproduction" as their mode of production
 * - Plants must return the string "Seeds" as their mode of production.
 * - Fungi must return the string "Spores"
 *
 * Each of your classes should additionally override the 'toString' method. Be sure your toString method
 * uses both your interface and abstract class methods.
 *
 * In your main function, after implementing your classes, create 2 to 3 types of each, and place them
 * in a SET or a LIST. That is, for animals, have an Animal list, for plants, have a plant list, and
 * for Fungi, have a Fungi list.
 *
 * Then print out each of your sets/lists. When printing your lists be sure to print them with your
 * overridden toString methods.
 *
 *
 *
 * In your main function, after implementing your classes, create 2 to 3 types of each, and place them
 * in a SET or a LIST. That is, for animals, have an Animal list, for plants, have a plant list, and
 * for Fungi, have a Fungi list.
 *
 * Then print out each of your sets/lists. When printing your lists be sure to print them with your
 * overridden toString methods.
 *
 *
 *
 * main method:
 *      -create 2-3 objects of each class and place them is a SET or LIST
 *              ~ex: Animal List, Plant List, Fungi List
 *              ~print out each set/list
 *                  +use toString methods to print
 *
 *
 * Classes:
 *      - abstract class Creature implements Reproduction
 *              * method: eatFood
 *      - Plant class extends Creature implements Reproduction
 *              * override method: eatFood
 *                  +return "sunlight (aka photosynthesis)"
 *              * override method: toString
 *                  ~ should use interface and abstract class methods
 *              * inherited method: modeOfReproduction
 *                  +return (String "Seeds" as their mode of production.")
 *      - Animal class extends Creature implements Reproduction
 *              * override method: eatFood
 *                  +return "ingestion"
 *              * override method: toString
 *  *                  ~ should use interface and abstract class methods
 *              * inherited method: modeOfReproduction
 *                  +return (String "Sexual Reproduction")
 *      - Fungi class extends Creature implements Reproduction
 *              * override method: eatFood
 *                  +"external digestion with hyphae"
 *              * override method: toString
 *  *                  ~ should use interface and abstract class methods
 *              * inherited method: modeOfReproduction
 *                  +return (String "Spores")
 *
 * Interfaces:
 *      - Reproduction
 *              * method: modeOfReproduction
 *
 *
 *
 */

abstract class Creature implements Reproduction, Comparable<Creature> {
    String name;
    Creature(){
    }
    public abstract String toEat();
    public void name(String name){
        this.name=name;
    }

    public abstract String modeOfReproduction();
    @Override
    public String toString(){
        return"Creature Abstract Class";
    }
    public String toString(Creature currentCreature){
        return ("\n\tEats via: " + currentCreature.toEat() + "\n\tMode of Reproduction: " + currentCreature.modeOfReproduction());
    }

    public int compareTo(Creature c1){
        if(this.name.equals(c1.name)){
            return 0;
        }
        else{
            return this.name.compareTo(c1.name);
        }
    }


}
