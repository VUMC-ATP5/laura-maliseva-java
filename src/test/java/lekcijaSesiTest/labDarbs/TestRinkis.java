package lekcijaSesiTest.labDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestRinkis {

    @Test
    public void testRekinatLaukumu() {
        System.out.println("Tests, kurš testē kā rēķinās riņķa laukumu");
        Rinkis mansRinkis = new Rinkis(60);
        Double expectedArea = 11309.733552923255;
        Double actualArea = mansRinkis.rekinatLaukumu();
        Assert.assertEquals(actualArea,expectedArea);
    }

    @Test
    public void testRekinatLaukumuDalskaitlis() {
        System.out.println("Tests, kurš testē kā rēķinās riņķa laukumu");
        Rinkis mansRinkis = new Rinkis(4.5);
        Double expectedArea = 63.61;
        Double actualArea = mansRinkis.rekinatLaukumu();
        Assert.assertEquals(actualArea,expectedArea);
    }

    @Test
    public void testRekinatLinija() {
        System.out.println("Tests, kurš testē kā rēķinās riņķa līniju");
        Rinkis mansRinkis = new Rinkis(4.5);
        Double expectedArea = 28.26;
        Double actualArea = mansRinkis.rekinatRinkaLiniju();
        Assert.assertEquals(actualArea,expectedArea);
    }

    @Test
    public void testRekinatLinijaNull() {
        System.out.println("Tests, kurš testē kā rēķinās riņķa līniju");
        Rinkis mansRinkis = new Rinkis(0.0);
        Double expectedArea = 0.0;
        Double actualArea = mansRinkis.rekinatRinkaLiniju();
        Assert.assertEquals(actualArea,expectedArea);
    }

    @BeforeMethod
    public void sagatavosanas() {
        System.out.println("Šī metode tiek izpildīta pirms katra testa");
    }

    @AfterMethod
    public void pecDarbibas() {
        System.out.println("Šī metode tiek izpildīta pēc katra testa");
    }

    @BeforeTest
    public void pirmsTesta() {
        System.out.println("Šī ir BEFORE TEST ANOTĀCIJA");
    }

    @AfterTest
    public void pecTesta() {
        System.out.println("Šī ir AFTER TEST ANOTĀCIJA");
    }

    @Test
    public void testRekinatLinijaMinus() {
        System.out.println("Tests, kurš testē kā rēķinās riņķa līniju");
        Rinkis mansRinkis = new Rinkis(-6);
        Double expectedArea = -37.68;
        Double actualArea = mansRinkis.rekinatRinkaLiniju();
        Assert.assertEquals(actualArea,expectedArea);
    }


    private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums) {
        System.out.println("Tests, kurš testē kā rēķinās riņķa līniju");
        Rinkis mansRinkis = new Rinkis (radiuss);
        Double expectedArea = sagaidamaisLaukums;
        Double actualArea = mansRinkis.rekinatRinkaLiniju();
        Assert.assertEquals(actualArea,expectedArea);
    }

    private void calculateAreaAndAssertIsaisVariants(Double radiuss, Double sagaidamaisLaukums){
        System.out.println("Tests kurš testē kā rēķinās riņķa laukums");
        Rinkis mansRinkis = new Rinkis(radiuss);
        Assert.assertEquals(mansRinkis.rekinatLaukumu(),sagaidamaisLaukums);
    }



}
