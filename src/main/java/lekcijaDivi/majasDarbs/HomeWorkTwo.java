package lekcijaDivi.majasDarbs;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.uzdevums
        int x = 1;
        //a
        System.out.println(x > 0);
        //b
        System.out.println(x < 0);
        //c
        System.out.println((x < 5) && (x <= 10));
        //d
        System.out.println(!(x >= 5) && (x < 10));
        //e
        System.out.println((x == 0) || (x == 10));
        //f
        x = 7;
        System.out.println(x * x > 10);

        //2.uzdevums
        int mountsNumber = 8;
        switch (mountsNumber) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("šāds mēnesis neeksistē");
        }

        //3.uzdevums
        int a = 4;
        int b = 6;
        int c = 2;
        if ((a > b) && (a > c)) {
            System.out.println(a);
        }
        if ((b > a) && (b > c)) {
            System.out.println(b);
        }
        if ((c > b) && (c > a)) {
            System.out.println(c);
        }


        //4.uzdevums
        String luksaforaGaisma;
        System.out.println("Ieraksti luksafora signāla krāsu (sarkans, dzeltens, zaļš):");
        luksaforaGaisma = scanner.nextLine();

        if (luksaforaGaisma.equals("sarkans")) {
            System.out.println("Stāvi!");
        } else if (luksaforaGaisma.equals("dzeltens")) {
            System.out.println("Stāvi!");
        } else if (luksaforaGaisma.equals("zaļš")) {
            System.out.println("Ej!");
        } else {
            System.out.println("Nezināms signāls! Kustība aizliegta.");
        }



        //5. uzdevums
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        //6.uzdevums
        printBusinessCard2("Gatis", "Ozoliņš", "+371 29785634", 1981);
        printBusinessCard2("Juziks", "Miglāns", "+371 28003571", 2000);



    }

    //5. uzdevums
    public static void printBusinessCard () {
        System.out.println("Vizītkarte");
        System.out.println("##############");
        System.out.println("Vārds: Kārlis");
        System.out.println("Uzvārds: Kalniņš");
        System.out.println("Telefona numurs: +371 28342617");
        System.out.println("Dzimšanas gads: 1956");
        System.out.println("##############");
    }

    public static void printBusinessCard2 (String vards, String uzvards, String telefonaNumurs, int dzimsanasGads) {
        System.out.println("Vizītkarte");
        System.out.println("##############");
        System.out.println("Vārds: " + vards);
        System.out.println("Uzvārds: " + uzvards);
        System.out.println("Telefona numurs: " + telefonaNumurs);
        System.out.println("Dzimšanas gads: " + dzimsanasGads);
        System.out.println("##############");
    }

}
