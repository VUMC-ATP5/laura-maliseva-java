package lekcijaPieci.majasDarbs;

public class Cilindrs {

    private double radiuss;

    private double augstums;

    public double getRadiuss() {
        return radiuss;
    }

    public double getAugstums() {
        return augstums;
    }

    public void setRadiuss(double radiuss) {
        this.radiuss = radiuss;
    }

    public void setAugstums(double augstums) {
        this.augstums = augstums;
    }

    final double PI = Math.PI;

    public double rekinatCilindraTilpums() {
        return PI * radiuss * radiuss * augstums;
    }

    public double rekinatCilindraVirsmasLaukumu() {
        return 2 * PI * radiuss * augstums;
    }

    public Cilindrs(double radiuss, double augstums) {
        this.radiuss = radiuss;
        this.augstums = augstums;
    }

    public Cilindrs() {
        this.radiuss = radiuss;
        this.augstums = augstums;
    }
}
