package lekcijaViens.majasDarbs;

public class FirstClass {
    public static void main(String[] args) {

        String valstsNosaukums = "Lietuva";
        System.out.println("Valsts nosaukums " + valstsNosaukums);

        int iedzivotajuSkaits = 2810118;
        System.out.println("Iedzīvotaju skaits " + iedzivotajuSkaits);

        int platiba = 65303;
        System.out.println("Lietuvas platība " + platiba);

        String galvaspilseta = "Viļņa";
        System.out.println("Valsts galvaspilsēta ir " + galvaspilseta);

        String valoda = "lietuviešu";
        System.out.println("Lietuvas oficiālā valoda -  " + valoda);

        boolean irESdalibvalsts = true;
        System.out.println("Vai Lietuva ir ES dalībvalsts? " + irESdalibvalsts);

        char valuta = '€';
        System.out.println("Valūta " + valuta);

        int vilnasIedzivotaji = 552787;
        int kaunasIedzivotaji = 297906;
        System.out.println( valstsNosaukums + "s galvaspilsēta ir " + galvaspilseta + ", tās iedzīvotaju skaits ir " + vilnasIedzivotaji + ".");
        System.out.println (valstsNosaukums + "s iedzīvotāju skaits ir " + iedzivotajuSkaits + " un tās platība " + platiba + " kvadrātkilometri.");
        System.out.println ("Kauņā dzīvo " + kaunasIedzivotaji + " iedzīvotāju, tā ir otra lielākā pilsēta.");

        int latvijasIedzivotajuSkaits = 1902000;
        int igaunijasIedzivotajuSkaits = 1331000;
        int latvijasPlatiba = 64589;
        int igaunijasPlatiba = 45339;

        int rezultats;
        rezultats = vilnasIedzivotaji + kaunasIedzivotaji;
        System.out.println(rezultats);

        rezultats = latvijasIedzivotajuSkaits + iedzivotajuSkaits + igaunijasIedzivotajuSkaits;
        System.out.println(rezultats);

        rezultats = latvijasPlatiba + platiba + igaunijasPlatiba;
        System.out.println(rezultats);

        rezultats = iedzivotajuSkaits - vilnasIedzivotaji;
        System.out.println(rezultats);

        rezultats = iedzivotajuSkaits - kaunasIedzivotaji;
        System.out.println(rezultats);

        rezultats = iedzivotajuSkaits - latvijasIedzivotajuSkaits;
        System.out.println(rezultats);

        rezultats = iedzivotajuSkaits * 2;
        System.out.println(rezultats);

        rezultats = latvijasPlatiba * 4;
        System.out.println(rezultats);

        rezultats = vilnasIedzivotaji * 5;
        System.out.println(rezultats);

        rezultats = igaunijasPlatiba / 4;
        System.out.println(rezultats);

        rezultats = igaunijasIedzivotajuSkaits / 15;
        System.out.println(rezultats);

        rezultats = latvijasIedzivotajuSkaits / latvijasPlatiba;
        System.out.println(rezultats);

    }
}
