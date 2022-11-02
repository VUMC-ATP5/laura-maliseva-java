package lekcijaPieci.majasDarbs;

public class Main {

    public static void main(String[] args) {

        Cilindrs cilindrsViens = new Cilindrs();
        cilindrsViens.setAugstums(4);
        cilindrsViens.setRadiuss(5);

        Cilindrs cilindsDivi = new Cilindrs(3, 4);

        System.out.println("Pirmā cilindra augstums un radiuss: " + cilindrsViens.getAugstums() + ", " + cilindrsViens.getRadiuss());
        System.out.println("Otrā cilindra augstums un radiuss: " +  cilindsDivi.getAugstums() + ", " + cilindsDivi.getRadiuss());

        System.out.println("Pirmā cilindra tilpums: " + cilindrsViens.rekinatCilindraTilpums());
        System.out.println("Pirmā cilindra virsmas laukums: " + cilindrsViens.rekinatCilindraVirsmasLaukumu());

        System.out.println("Otrā cilindra tilpums: " + cilindsDivi.rekinatCilindraTilpums());
        System.out.println("Otrā cilindra virsmas laukums: " + cilindsDivi.rekinatCilindraVirsmasLaukumu());






    }

}
