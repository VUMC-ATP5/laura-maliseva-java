package lekcijaPieci.staticPiemers;

public class Cilveks {
    public static int darbiniekaNumurs;
    public String name;

    public Cilveks(String name) {
        this.name = name;
        darbiniekaNumurs++;
    }

    public void printName(){
        System.out.println("Cilvēka vārds ir " + name);
        System.out.println("Darbinieka numurs ir " + darbiniekaNumurs);
    }


}
