package lekcijaPieci.labDarbs;

public class Main {
    public static void main(String[] args) {
        Cat muris = new Cat();
        Dog reksis = new Dog();

        muris.breathe();
        reksis.breathe();

        muris.makeSound();
        reksis.makeSound();

        muris.age=5;

        muris.eat();
        reksis.eat();

        muris.sharpenClaws();
        reksis.growl();

        muris.canClimbTrees = true;
        reksis.canClimbTrees = false;

        muris.printClimbing();

        Cow govs = new Cow();

        govs.breathe();
        govs.makeSound();

        Fish zivs = new Fish();

        zivs.breathe();

        House house = new House(4, 29, 2, "Brīvības iela 29", 3.1, 130000, false);

        house.printHouse();

        house.setKadastralaVertiba(30000);
        house.setVaiPrivatmaja(true);
        house.setAdrese("Tallinas iela");
        System.out.println("Mājas adrese ir " + house.getAdrese());

        house.printHouse();

        Calculator kalkulators = new Calculator();
        System.out.println(kalkulators.add(5,10));
        System.out.println(kalkulators.add(5.9,11.10));
        System.out.println(kalkulators.add(5,10,62));


    }
}
