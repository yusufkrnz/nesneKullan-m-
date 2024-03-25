public class Main {

    public static void main(String[] args) {
        Araba araba = new Araba("Toyota", "Corolla", 120, "Beyaz", 2019, 20000, 1 / 2000);

        araba.sigortaBildir();
        System.out.println(araba.yakitTuketimiBul());
        araba.kilometreHesabi();
        araba.motorGuc();
        araba.uretimYili();
        araba.model();
        araba.kullaniciGirisleri();
        System.out.println(araba.yazdirString());







    }
}