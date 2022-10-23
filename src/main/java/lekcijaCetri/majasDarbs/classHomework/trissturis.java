package lekcijaCetri.majasDarbs.classHomework;

import static java.lang.Math.sqrt;

public class trissturis {

    int a = 0;
    int b = 0;
    int c = 0;
    double s = 0;

    trissturis(){
        System.out.println("Tiek veidots trīsstūris!");
    }
    trissturis(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = (a + b + c) / 2.0;
        double A = sqrt(this.s * (this.s - a) * (this.s - b) * (this.s - c));
        System.out.println(A);
    }

    public boolean vaiIrVienadmalu() {
        if ((this.a==this.b)&&(this.b==this.c)){
            return true;
        } else {
            return false;
        }
    }

    public boolean vaiIrVienadsanu() {
        if ((this.a==this.b)||(this.a==this.c)||(this.b==this.c)) {
            return true;
        } else {
            return false;
        }
    }
}
