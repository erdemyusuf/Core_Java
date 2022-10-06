package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // bir onceki soruyu tek seferde kullanicidan tum bilgileri alarak yapiniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi,soyisminizi ve yasinizi giriniz \naralarda Enter tusuna basiniz");

        String isim=scan.nextLine();
        scan.nextLine();  // bu satir olmadan hata veriyor yorumlarda bug dummy gibi ifadeler yazilmis
        String soyisim=scan.nextLine();

        int yas=scan.nextInt();

        System.out.println("girilen bilgiler="+isim+" "+soyisim+" "+yas);




    }
}
