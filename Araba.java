import java.util.Scanner;

public class Araba {
    public int motorGucu;
    public String marka;
    public String model;
    public String[] yakitTuru = new String[]{"LPG", "Dizel", "Hibrit", "Benzin"};
    public String renk;
    public String uretimYili;
    public int kilometre;
    public int sigortaTarihi;



    public Araba(String marka, String model, int motorGucu, String renk, int uretimYili, int kilometre, int sigortaTarihi) {
        this.marka = marka;
        this.model = model;
        this.motorGucu = motorGucu;
        this.renk = renk;
        this.uretimYili = String.valueOf(uretimYili);
        this.kilometre = kilometre;
        this.sigortaTarihi = sigortaTarihi;
        this.kullaniciGirisleri();

    }

    public String sigortaBildir() {
        Scanner input = new Scanner(System.in);
        System.out.println("En son kaç ay önce bakım yaptırdınız?");
        int tarih = input.nextInt();
        if (tarih > 6) {
            System.out.println("En kısa sürede arabanızı bakıma götürün.");
        } else {
            System.out.println("Bakım tarihi yaklaşıyor.");
        }
        return null;
    }
    public String yakitTuketimiBul() {
        Scanner yakitSec = new Scanner(System.in);
        System.out.println("Yakıt türünü seçiniz: (1-Dizel, 2-Hibrit, 3-LPG, 4-Benzin)");
        int yakitSecim = yakitSec.nextInt();
        System.out.println("Motor gücü nedir (75-150 gibi): ");
        Scanner gucSecim = new Scanner(System.in);
        motorGucu = gucSecim.nextInt();
        if (yakitSecim == 1) {
            if (motorGucu < 100) {
                return "Düşük motor gücü ve yaklaşık 100km'de 5-7 litre yakıt yakıyor.";
            } else if (motorGucu < 150) {
                return "Orta motor gücü ve yaklaşık 100km'de 6-8 litre yakıt yakıyor.";
            } else {
                return "Yüksek motor gücü ve yaklaşık 100km'de 7-9 litre yakıt yakıyor.";
            }
        } else if (yakitSecim == 2) {

            if (motorGucu < 100) {
                return "Düşük motor gücü ve yaklaşık 100km'de 5-7 litre yakıt yakıyor.";
            } else if (motorGucu < 150) {
                return "Orta motor gücü ve yaklaşık 100km'de 6-8 litre yakıt yakıyor.";
            } else {
                return "Yüksek motor gücü ve yaklaşık 100km'de 7-9 litre yakıt yakıyor.";

            }
        }else if (yakitSecim==3){
                if (motorGucu < 100) {
                    return "Düşük motor gücü ve yaklaşık 100km'de 5-7 litre yakıt yakıyor.";
                } else if (motorGucu < 150) {
                    return "Orta motor gücü ve yaklaşık 100km'de 6-8 litre yakıt yakıyor.";
                } else {
                    return "Yüksek motor gücü ve yaklaşık 100km'de 7-9 litre yakıt yakıyor.";
                }
            } else if (yakitSecim==4) {
            if (motorGucu < 100) {
                return "Düşük motor gücü ve yaklaşık 100km'de 5-7 litre yakıt yakıyor.";
            } else if (motorGucu < 150) {
                return "Orta motor gücü ve yaklaşık 100km'de 6-8 litre yakıt yakıyor.";
            } else {
                return "Yüksek motor gücü ve yaklaşık 100km'de 7-9 litre yakıt yakıyor.";
            }            
        }

        return yakitTuketimiBul();
        }
    public void kilometreHesabi() {
        Scanner kilometreGiris = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi giriniz (km):");
        int gidilenMesafe = kilometreGiris.nextInt();

        if (gidilenMesafe < 60) {
            System.out.println("Baya temiz araba.");
        } else if (gidilenMesafe < 150) {
            System.out.println("Temiz araba.");
        } else if (gidilenMesafe < 250) {
            System.out.println("Orta araba.");
        } else if (gidilenMesafe < 500) {
            System.out.println("Biraz yorulmuş.");
        } else {
            System.out.println("Alma kanka bu arabayı.");
        }
    }
    public int motorGuc() {
        try {
            if (motorGucu>75){
                System.out.printf("düşük motor");
            } else if (motorGucu>100) {
                System.out.printf("normal güçlü");

            } else if (motorGucu>150) {
                System.out.printf("ortalama bi motor");
            }else {
                System.out.printf("Yüksek güç");
            }
        }catch (Exception e){
            System.out.printf("hatalı giriş");
        }

        return motorGucu;

    }
    private String kullaniciGirisi;
    public void kullaniciGirisleri(){
        Scanner input_1=new Scanner(System.in);

        System.out.println("Renk : ");
        String renk = input_1.nextLine();

        System.out.println("Model : ");
        String model = input_1.nextLine();

        System.out.println("Kilometre : ");
        int kilometre = input_1.nextInt();

        kullaniciGirisi = String.format("Renk: %s\nModel: %s\nKilometre: %d\n", renk, model, kilometre);

    }
    public String yazdirString() {





        return String.format(" Marka: %s\n, Model: %s\n, Renk: %s\n, Sigorta Durumu: %s\n, Motor Gücü:  %d %n", marka, model, renk, motorGuc());
    }


} 
