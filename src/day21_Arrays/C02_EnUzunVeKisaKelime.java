package day21_Arrays;

public class C02_EnUzunVeKisaKelime {
    public static void main(String[] args) {

        // Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun

        String[] isimler = {"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};


        enuzunvekisayiYazdir(isimler);


    }

    public static void enuzunvekisayiYazdir(String[] isimler) {

        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() > enUzunKelime.length()) {
                enUzunKelime = isimler[i];

            }

            if (isimler[i].length() < enKisaKelime.length()) {
                enKisaKelime = isimler[i];

            }

        }

        System.out.println(enUzunKelime);
        System.out.println(enKisaKelime);


    }


}