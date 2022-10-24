package lekcijaPieci.labDarbs;

public class House {
    private int stavuDaudzums;
    private int loguSkaits;
    private int durvjuSkaits;

    public void setStavuDaudzums(int stavuDaudzums) {
        this.stavuDaudzums = stavuDaudzums;
    }

    public void setLoguSkaits(int loguSkaits) {
        this.loguSkaits = loguSkaits;
    }

    public void setDurvjuSkaits(int durvjuSkaits) {
        this.durvjuSkaits = durvjuSkaits;
    }

    public String getAdrese() {
        return adrese;
    }

    public void setAdrese(String adrese) {
        this.adrese = adrese;
    }

    public void setGrieztuAugstums(double grieztuAugstums) {
        this.grieztuAugstums = grieztuAugstums;
    }

    public void setVaiPrivatmaja(boolean vaiPrivatmaja) {
        this.vaiPrivatmaja = vaiPrivatmaja;
    }

    private String adrese;
    private double grieztuAugstums;
    private long kadastralaVertiba;

    public void setKadastralaVertiba(long kadastralaVertiba) {
        this.kadastralaVertiba = kadastralaVertiba;
    }

    private boolean vaiPrivatmaja;


    public House(int stavuDaudzums, int loguSkaits, int durvjuSkaits, String adrese, double grieztuAugstums, long kadastralaVertiba, boolean vaiPrivatmaja) {
        this.stavuDaudzums = stavuDaudzums;
        this.loguSkaits = loguSkaits;
        this.durvjuSkaits = durvjuSkaits;
        this.adrese = adrese;
        this.grieztuAugstums = grieztuAugstums;
        this.kadastralaVertiba = kadastralaVertiba;
        this.vaiPrivatmaja = vaiPrivatmaja;
    }


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
