package lekcijaCetri.labDarbs;

public class Rinkis {
    double r;
    final double PI = Math.PI;

    public double rekinatLaukumu () {
        return r*r* PI;
    }

    public double rekinatRinkaLiniju () {
        return 2*PI*r;
    }

    public Rinkis(double r) {
        this.r = r;
    }


}
