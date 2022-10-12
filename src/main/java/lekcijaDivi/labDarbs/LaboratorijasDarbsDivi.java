package lekcijaDivi.labDarbs;

import java.util.Scanner;

public class LaboratorijasDarbsDivi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Salīdzināšanas izteiksmes
        //Lielāks
        int x = 3;
        int y = 2;
        // šeit būt true
        System.out.println(x > y);
        y = 3;
        // šeit būs false
        System.out.println(x > y);

        //Mazāks
        x=5;
        y=3;
        System.out.println(x < y);
        y=10;
        System.out.println(x < y);

        // vienāds
        System.out.println(x==y);
        System.out.println(5==5);

        String luksaforaKrasa = "green";
        System.out.println(luksaforaKrasa.equals("green"));
        System.out.println(luksaforaKrasa.equals("red"));

        //nav vienāds
        System.out.println(x!=y);
        System.out.println(!luksaforaKrasa.equals("red"));

        //mazāks vienāds
        x=7;
        y=5;
        int z=8;
        System.out.println(x<=y);
        System.out.println();

        int vecums = 18;

        System.out.println("Vai cilvēks var balsot (kļūdains variants)? " + (vecums>18));
        System.out.println("Vai cilvēks var balsot? " + (vecums>=18));

        System.out.println(x<6 || z>y);

        int age = 19;
        boolean hasVoted = false;
        System.out.println("Paskaties cilvēka pasē");
        if (age>=18 && hasVoted==false){
            System.out.println("Drīkst balsot");
        }
        System.out.println("Tālākas darbības");

        //es aizeju un nobalsoju
        hasVoted = true;
        System.out.println("Paskaties cilvēka pasē");
        if (age>=18 && hasVoted==false){
            System.out.println("Drīkst balsot");
        } else {
            System.out.println("Nedrīskt balsot");
        }
        System.out.println("Tālākas darbības");


// uzdevums
        int skaitlis = -3;
        System.out.println("Pārbaudīt skaitli, vai ir negatīvs");
        if (skaitlis<0){
            System.out.println("Skaitlis ir negatīvs");
        }
        System.out.println(skaitlis);

        if (skaitlis>0){
            System.out.println("Skaitlis pozitīvs");
        } else {
            System.out.println("Skaitlis negatīvs vai 0");
        }

        String luksaforaKrasa2 = "red";
        if (luksaforaKrasa2.equals("green")){
            System.out.println("Ej");
        } else {
            System.out.println("Stāvi");
        }

        System.out.println("Ievadi skaitli i");
        int i = 17;
        if (i==10) {
            System.out.println("Skaitlis ir 10");
        } else if (i==15) {
            System.out.println("Skaitlis ir 15");
        } else if (i==20) {
            System.out.println("Skaitlis ir 20");
        } else {
            System.out.println("Skaitlis nav neviens no vajadzīgajiem");
        }

        //luksafors
        // KODS - LUKSOFORS
//        String trafficLight;
//        System.out.println("Enter traffic light color (red, yellow or green):");
//        trafficLight = scanner.nextLine();
//
//        if (trafficLight.equals("red")){
//            System.out.println("Stay!");
//        } else if (trafficLight.equals("yellow")) {
//            System.out.println("Wait!");
//        } else if (trafficLight.equals("green")){
//            System.out.println("Go!");
//        } else {
//            System.out.println("Wrong color!");
//        }




        //vai skaitlis
//        System.out.println("Ievadi skaitli g");
//        int g = scanner.nextInt();
//        if (g<0) {
//            System.out.println("Skaitlis ir negatīvs");
//        } else if (g==0) {
//            System.out.println("Skaitlis ir nulle");
//        } else (g>0) {
//            System.out.println("Skaitlis ir pozitīvs");
//        }


        //piemērs
        int mountsNumber = 7;
        switch (mountsNumber) {
            case 1: System.out.println("Janvāris");
            break;
            case 2: System.out.println("Februāris");
            break;
            case 3: System.out.println("Marts");
            break;
            case 4: System.out.println("Aprīlis");
            break;
            default:
                System.out.println("šāds mēnesis neeksistē");
        }

        String animal = "Dog";
        String result;
        switch (animal){
            case "Dog":
            case "Cat":
                result = "Domestic animal";
                break;
            case "Tiger":
                result = "Wild animal";
            default:
                result = "unknown animal";
        }










//        System.out.println("Hello, lekcija 2!");
//
//        // if ir ja, var būt arī if else, ja nenostrādā if, tad jāstrādā else.
//
//        //int temperatura = 10;
//        // ja t ir mazāka par<10, man jāvelk cepure
//
//        int vecums;
//        System.out.println("Kā Tevi sauc?");
//        String name = scanner.nextLine();
//        System.out.println("Labdien, " + name + " Esi sveicināts/a manā programmā");
//
//        System.out.println("Ievadi cilvēka vecumu...");
//        vecums = scanner.nextInt();
//
//        if(vecums>=18){
//            System.out.println("Cilvēks drīskt balsot");
//        }
//
//        System.out.println("Programmas turpinājums ");
//
//        System.out.println("Ievadi skaili a");
//        int a = scanner.nextInt();
//        System.out.println("Ievadi skaili b");
//        int b = scanner.nextInt();
//        int summa = a+b;
//        System.out.println("Skaitla " + a + " un Skaitla " + b + " Summa ir " + summa);
//


    }
}
