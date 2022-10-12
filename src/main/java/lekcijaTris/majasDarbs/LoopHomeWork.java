package lekcijaTris.majasDarbs;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        pirmaisUzdevums();
        System.out.println("\n");

        otraisUzdevums();
        System.out.println("\n");

        tresaisUzdevums();
        System.out.println("\n");

        ceturtaisUzdevums();
    }
    public static void pirmaisUzdevums () {
        Scanner ievade = new Scanner(System.in);

        int skaitluSumma = 0;
        while (skaitluSumma <= 100) {
            System.out.println("Ievadi skaitli:");
            int number = ievade.nextInt();
            skaitluSumma = skaitluSumma + number;
        }
        System.out.println("Gatavs");
    }

    public static void otraisUzdevums () {

        String[] kartis = {"dūzis", "kalps", "dāma", "kungs"};
        int i = 0;
        while (i < kartis.length) {
            System.out.println(kartis[i]);
            i ++;
        }

        int q = 0;
        do {
            System.out.println(kartis[q]);
            q ++;
        } while (q < kartis.length);

        for (int j = 0; j < kartis.length; j++) {
            System.out.println(kartis[j]);
        }

        for (String karts : kartis) {
            System.out.println(karts);
        }


        int[] menesaTerini = {100, 40, 23, -44, 55, 200};
        int ii = 0;
        while (ii < menesaTerini.length) {
            System.out.println(menesaTerini[ii]);
            ii ++;
        }

        int qq = 0;
        do {
            System.out.println(menesaTerini[qq]);
            qq ++;
        } while (qq < menesaTerini.length);

        for (int jj = 0; jj < menesaTerini.length; jj++) {
            System.out.println(menesaTerini[jj]);
        }

        for (int oktobris : menesaTerini) {
            System.out.println(oktobris);
        }

        char[] vardaBurti = {'l', 'a', 'u', 'r', 'a'};
        int iii = 0;
        while (iii < vardaBurti.length) {
            System.out.println(vardaBurti[iii]);
            iii ++;
        }

        int qqq = 0;
        do {
            System.out.println(vardaBurti[qqq]);
            qqq ++;
        } while (qqq < vardaBurti.length);

        for (int jjj = 0; jjj < vardaBurti.length; jjj++) {
            System.out.println(vardaBurti[jjj]);
        }

        for (char burts : vardaBurti) {
            System.out.println(burts);
        }

    }

    private static void tresaisUzdevums() {
        int[] skaitluMasivs =  new int[99];
        for (int v = 0; v < skaitluMasivs.length; v++) {
            skaitluMasivs[v] = v * 2;
        }
        for (int vertiba : skaitluMasivs) {
            System.out.print(vertiba);
        }
    }

    private static void ceturtaisUzdevums() {
        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadi veselu skaitli:");

        int skaitls = ievade.nextInt();
        long faktorials = 1;

        for(long i=1; i <= skaitls; i++){
            faktorials = faktorials * i;
        }
        System.out.println(faktorials);
    }
}
