package lekcijaTris.labDarbs;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //metodes
        System.out.println("Sākas programma");
        vizitKarte2("Raimonds", "Mališevs", "Rīga", 34);
        vizitKarte2("Rodžers", "Mališevs", "Rīga", 7);
        vizitKarte2("Meks", "Mališevs", "Rīga", 8);
        vizitKarte();
        vizitKarte();
        System.out.println("Beidzas programma");
        int laukums = aprekinaTaisnsturaLaukumu(3, 7);
        System.out.println("Taisnstūra laukums ir: " + laukums);
        System.out.println("Taisnstūra laukums ir: " + aprekinaTaisnsturaLaukumu(5,6));
        System.out.println(average(6.5, 3.5, 2.5));

        //masīvi
        int[] menesaIzmaksas = {100, 40, 23, 44, 55, 200};
        String[] produktuSaraksts = {"Piens", "Maize", "Olas"};

        System.out.println(produktuSaraksts[0]); //piens
        System.out.println(produktuSaraksts[1]); //maize
        System.out.println(produktuSaraksts[2]); //olas
        System.out.println(menesaIzmaksas[3]);

        produktuSaraksts[2] = "Desa";
        System.out.println(produktuSaraksts[2]); //desa

        String[] masinas = {"Volvo", "BMW", "Nissan", "Mercedes"};
        System.out.println("Masīva garums ir " + masinas.length);
        masinas[1] = "Audi";
        System.out.println(masinas[1]);
        System.out.println(masinas[2]);

        String[] studentuSaraksts = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņs";
        studentuSaraksts[1] = "Juris Kreilis";

        System.out.println(  studentuSaraksts[0]);
        System.out.println(  studentuSaraksts[1]);
        System.out.println(  studentuSaraksts[2]); //vērtībai vieta ir, bet nav piešķirta, tad izprintē "null"


        int[] menesiGada = new int[12];
        menesiGada[0]=1;
        menesiGada[1]=78;

        whileCikls();






    }

    public static void whileCikls() {
        int x = 5;
        while (x >= 0) {
            System.out.println("x nav nulle, x = " + x);
            x = x - 1;
        }

        int i = 10;
        while (i < 50) {
            System.out.println("I ir " + i);
            i = i + 1;
        }

        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};

        System.out.println("cikla kods sākās");
        int z = 0;
        while (z < 4) {
            System.out.println(cars[z]);
            z = z + 1;
        }
        System.out.println("cikla kods beidzās");

        //uzdevums - izprintēt visus skaitlus no menesa tēriņi masīva uz ekrāna
        int[] menesaTerini = {100, 40, 23, -44, 55, 200};
        int m = 0;
        while (m < menesaTerini.length) {
            System.out.println(menesaTerini[m]);
            m = m + 1;
        }

        //uzdevums 2 - pieprasīt no lietotāja ievadīt veselu skaitli, kamēr skaitli ir pozitivi
        //saskaitīt tos un izvadīt uz ekrāna summu, ja ir ievadīta 0 vai negatīvs(Jāizmanto scanner)

        Scanner ievade = new Scanner(System.in);
//        System.out.println("Ievadi skaitli...");
//        int number = ievade.nextInt();
//        int summa = 0;
//        while (number > 0) {
//            summa = summa + number;
//            System.out.println("Ievadi skaitli...");
//            number = ievade.nextInt();
//        }
//        System.out.println("summa ir:" + summa);

        //uzdevums
        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
        int k = 0;
        while (k < kartis.length) {
            System.out.println(kartis[k]);
            k = k + 1;
        }


//        int q = 1;
//        do {
//            System.out.println("Test test test");
//            q ++;
//        } while (q<10);
//
//        String palore = "SuperSecretPasword1123";
//        String ievaditParoli;
//        do {
//            System.out.println("Ievadi paroli");
//            ievaditParoli = ievade.nextLine();
//            System.out.println("Pārbaudām paroli");
//        } while (!ievaditParoli.equals(palore));
//
//        System.out.println("Pareiza parole");

        System.out.println(" ");

        //dažādi veidi kā veikt cilku
        String[] kartis2 = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};

        for (String vienaKarts : kartis2) {
            System.out.println(vienaKarts);
        }

        for (int j = 0; j < kartis2.length; j++) {
            System.out.println(kartis2[j]);
        }

        //pāra skaitļi
        for (int v = 0; v <= 20; v = v + 2) {
            System.out.println(v);
        }


        //kā izeterēt katru no telefona nr.
        long[] telefonaNr = {22222222, 33333333, 44444444, 55555555, 666666666};
        for (long numurs : telefonaNr) {
            System.out.println(numurs);
        }

        //vēl lekvijā stāstīja par break un continue


        int count = 0;
        for (int j = 1; j <= 50; j++) {
            if (!(j % 3 == 0 || j % 5 == 0)) {
                count++;
            }
        }
        System.out.println("Der " + count + " Māju nr");

        char [] vardaBurti = {'l', 'a', 'u', 'r', 'a'};
        for (char vards: vardaBurti) {
            //System.out.println(vardaBurti); //print-line, drukās stabiņā
            System.out.print(vards); //print (vienkārši), nedrukās stabiņā, bet vienu aiz otra
        }
    }



    // metodes definēšana
    public static double average (double a, double b, double c){
        return a+b+c/3;
    }

    public static void jaunaLinija() {
        System.out.println("\n");
    }

    //mājasdarba 5.uzdevums
    public static void vizitKarte () {
        System.out.println("##############");
        System.out.println("Vizītkarte");
        System.out.println("Laura");
        System.out.println("Mališeva");
        System.out.println("1989");
        System.out.println("Rīga");
        System.out.println("##############");
        jaunaLinija();
    }

    //mājas darba 7. uzdevums
    public static int aprekinaTaisnsturaLaukumu (int platums, int garums) {
        return platums * garums;
    }

    //mājasdarba 6.uzdevums
    public static void vizitKarte2 (String vards, String uzvards, String pilseta, int vecums) {
        System.out.println("##############");
        System.out.println("Vizītkarte");
        System.out.println(vards + " " + uzvards);
        System.out.println(pilseta);
        System.out.println("vecums " + vecums);
        System.out.println("##############");
    }

}
