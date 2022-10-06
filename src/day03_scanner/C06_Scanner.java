package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        /*
        kullanicidan isim soyisim ve yasini alin
        girilen bilgiler = yusuf erdem 33 seklinde yazdırın
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen isminizi girin");
        /*
        string verileri scanner ile alirken next(): ilk bosluga kadar olan kismi (1 kelime) alir
        nextLine(): satirin sonuna kadar ne yazarsak alir
        NOT: ardarda birden fazla kelime yazilacaksa nextLine() kullaniriz         */

        String isim=scan.nextLine();

        System.out.println("lutfen soyisminizi girin");

        String soyisim=scan.nextLine();

        System.out.println("lutfen yasinizi girin");

        double yas= scan.nextDouble();

        System.out.println("girilen bilgiler="+isim+" "+soyisim+" "+yas);
    }
}
