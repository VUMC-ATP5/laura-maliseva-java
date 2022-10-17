package lekcijaCetri.labDarbs;

import java.util.Date;

public class Velosipeds {
    String zimols;
    int ramjaIzmers;
    int atrums = 0;
    Date izgatavosanasDatums;
//    Riepa riepa;


//    Konstruktors
    Velosipeds(){
        System.out.println("Taisām jaunu velo!!!");
        izgatavosanasDatums = new Date();
        System.out.println("Izgatavošanas datums: " + izgatavosanasDatums);
    }

    Velosipeds (String zimols, int ramjaIzmers, int atrums){
        izgatavosanasDatums = new Date();
        this.zimols = zimols;
        this.ramjaIzmers = ramjaIzmers;
        this.atrums = atrums;
    }

    public void printAtrums (){
        System.out.println(atrums);
    }

    public void paatrinajums(){
        System.out.println( zimols + " Velo paatrinas "+ atrums);
        atrums = atrums + 5;
    }

    public void bremzesana(){
        System.out.println(zimols + " Velo Bremze " + atrums);
        if (atrums>=5){
        atrums = atrums - 5;
        } else {
            System.out.println("Beidz bremzēt, Tu jau stāvi");
        }
    }

}
