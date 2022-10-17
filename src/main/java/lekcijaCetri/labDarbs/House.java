package lekcijaCetri.labDarbs;

public class House {
    int stavuDaudzums;
    int loguSkaits;
    int durvjuSkaits;

    public House(int stavuDaudzums, int loguSkaits, int durvjuSkaits, String adrese, double grieztuAugstums, long kadastralaVertiba, boolean vaiPrivatmaja) {
        this.stavuDaudzums = stavuDaudzums;
        this.loguSkaits = loguSkaits;
        this.durvjuSkaits = durvjuSkaits;
        this.adrese = adrese;
        this.grieztuAugstums = grieztuAugstums;
        this.kadastralaVertiba = kadastralaVertiba;
        this.vaiPrivatmaja = vaiPrivatmaja;
    }

    String adrese;
    double grieztuAugstums;
    long kadastralaVertiba;
    boolean vaiPrivatmaja;

    public void printHouse() {
        System.out.println("House{" +
                "stavuDaudzums=" + stavuDaudzums +
                ", loguSkaits=" + loguSkaits +
                ", durvjuSkaits=" + durvjuSkaits +
                ", adrese='" + adrese + '\'' +
                ", grieztuAugstums=" + grieztuAugstums +
                ", kadastralaVertiba=" + kadastralaVertiba +
                ", vaiPrivatmaja=" + vaiPrivatmaja +
                '}');
    }
}
