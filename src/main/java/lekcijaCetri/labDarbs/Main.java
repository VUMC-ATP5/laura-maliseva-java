package lekcijaCetri.labDarbs;

public class Main {
    public static void main(String[] args) {
        String vards = "Laura";
        House majaViens = new House(2,10,2,"Brīvības iela 123", 3.2, 100000, true);
        majaViens.printHouse();

        House majaDivi = new House(1, 8, 1, "Vainodes iela 15", 3.2, 60000, true);
//        majaDivi.adrese = "Vaiņodes iela 15";
//        majaDivi.stavuDaudzums = 1;
//        majaDivi.durvjuSkaits = 1;
//        majaDivi.kadastralaVertiba = 60000;
//        majaDivi.grieztuAugstums = 3.2;
//        majaDivi.loguSkaits = 8;
//        majaDivi.vaiPrivatmaja = true;
        majaDivi.printHouse();

        System.out.println(majaViens.adrese);
        System.out.println(majaDivi.adrese);

        char [] mansVards = {'L', 'a', 'u', 'r', 'a'};
        for (char burts : mansVards){
            System.out.println(burts);
        }

        House [] majas = {majaViens, majaDivi};
        for (House maja : majas) {
            maja.printHouse();
        }

        // te nesanāk tikai vienam iedot vērtību
        Velosipeds mansVelo = new Velosipeds();
        mansVelo.atrums = 9;
        mansVelo.printAtrums();
        Velosipeds mansVelo2 = new Velosipeds();
        mansVelo.printAtrums();

        Velosipeds ritenBraucejsViens = new Velosipeds();
        Velosipeds ritenBraucejsDivi = new Velosipeds();
//        ritenBraucejsViens.riepa.platums = 10;
        Velosipeds ritenisX = new Velosipeds("Giant", 21, 23);

        ritenBraucejsViens.atrums = 40;
        ritenBraucejsDivi.atrums = 30;

        ritenBraucejsViens.printAtrums();
        ritenBraucejsDivi.printAtrums();

        Velosipeds ritenBraucejsTris = new Velosipeds();
        ritenBraucejsTris.zimols = "Liv";
        ritenBraucejsTris.printAtrums();

        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.printAtrums();

        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.printAtrums();
        System.out.println("Priekšā izskrien kaķis");

        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.printAtrums();

        Koks koksViens = new Koks();
        koksViens.suga = "liepa";
        koksViens.augstums = 25;
        koksViens.apkartmers = 120;
        koksViens.printKoks();

        Koks koksDivi = new Koks();
        koksDivi.suga = "ozols";
        koksDivi.augstums = 20;
        koksDivi.apkartmers = 350;
        koksDivi.printKoks();

        // apskatīties Jura kodu par objekta izmantošanu objektā zivs un kaķis

        Rinkis rinkisViens = new Rinkis(5);
//        rinkisViens.r = 5;
        System.out.println(rinkisViens.rekinatLaukumu());
        System.out.println(rinkisViens.rekinatRinkaLiniju());

        Rinkis rinkisDivi = new Rinkis(10);
//        rinkisDivi.r = 10;
        System.out.println(rinkisDivi.rekinatLaukumu());
        System.out.println(rinkisDivi.rekinatRinkaLiniju());

        Rinkis rinkisTris = new Rinkis(25);
        System.out.println(rinkisTris.rekinatLaukumu());

//      Par matemātiskām izteiksmēm
        int a = 5;
        int b = 10;

        System.out.println(Math.max(a, b));





    }
}
