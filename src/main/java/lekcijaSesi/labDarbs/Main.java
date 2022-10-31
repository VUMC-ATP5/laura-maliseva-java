package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String vards = faker.name().firstName();
        System.out.println("Mani sauc " + vards);

        System.out.println(faker.shakespeare().hamletQuote());
        System.out.println(faker.address().cityName());
        System.out.println(faker.cat().name());
        System.out.println(faker.pokemon().name());

        System.out.println("Adrese " + faker.address().city() + " " + faker.address().zipCode() + " " + faker.address().streetName());
        System.out.println("Tel. nr. " + faker.phoneNumber().cellPhone());
        System.out.println("Uzvārds " + faker.name().lastName());
        System.out.println("Grāmatas nosaukums " + faker.book().title());


    }
}
