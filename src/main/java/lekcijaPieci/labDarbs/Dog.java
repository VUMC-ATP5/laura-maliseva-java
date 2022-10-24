package lekcijaPieci.labDarbs;

public class Dog extends Animal{

    public void makeSound () {
        System.out.println("Vau! Vau! Vau!");
    }

    public void growl (){
        System.out.println("RRRRRRRRRRRRRRRRRR");
    }

    private int legCount = 4;

    public int getLegCount(){
        return this.legCount;
    }





}
