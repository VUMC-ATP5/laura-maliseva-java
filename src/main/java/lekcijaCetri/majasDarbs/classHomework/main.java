package lekcijaCetri.majasDarbs.classHomework;

import lekcijaCetri.labDarbs.Rinkis;

public class main {
    public static void main(String[] args) {
        trissturis trissturisViens = new trissturis();
        trissturisViens.a = 3;
        trissturisViens.b = 3;
        trissturisViens.c = 3;
        System.out.println(trissturisViens.vaiIrVienadmalu());
        System.out.println(trissturisViens.vaiIrVienadsanu());

        trissturis trissturisDivi= new trissturis(6,6,9);
        System.out.println(trissturisDivi.vaiIrVienadmalu());
        System.out.println(trissturisDivi.vaiIrVienadsanu());
    }
}
