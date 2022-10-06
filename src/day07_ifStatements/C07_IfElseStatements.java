package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        /*
        Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin,
         calismalisin”, 65’e esit veya buyukse “Emekli olabilirsin” yazdirin

        kullanici negatif deger girerse uyaralim

        NOT: birden fazla if - else if birbirine baglanmıssa son durum onemlidir
        eger else ile bitiyorsa diger tum olasılıklar kapsanıyor demektir
        ama else if ile bitiyorsa kapsamnayan durumlar olabilir


         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<0){
            System.out.println("lutfen gecerli bir yas girin");
        } else if (yas<65){
            System.out.println("emekli olamazsin, "+(65-yas)+" yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }
    }
}


// BİRİNCİ SART GERCEKLESMEZ İSE ELSE İF DEVREYE GİRMEZ YENİDEN DEGER İSTER
// GERCEKLEŞİRSE ELSE İF SONRASI KOŞULLAR DEVREYE GİRER????
