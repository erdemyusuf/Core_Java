package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        /*
        Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin,
         calismalisin”, 65’e esit veya buyukse “Emekli olabilirsin” yazdirin
         */


        Scanner scan=new Scanner(System.in);                 // kullanici dedigi icin scanner aliyoruz
        System.out.println("Lutfen yasinizi giriniz");       // yasini sorduk
        int yas=scan.nextInt();                              // variable yas oldugu icin int aldik

        if (yas<65){
            System.out.println("emekli olamazsin, "+(65-yas)+" yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }
    }
}
