package lekcijaPieci.labDarbs;

public class Cat extends Animal{

    public void makeSound () {
        System.out.println("Ņau, ņau, ņau!");
    }

    public void sharpenClaws (){
        System.out.println("I am sharpening my claws");
    }

    public void printClimbing(){
        System.out.println("Vai kaķis var kāpt kokos? " + canClimbTrees);
    }


}
