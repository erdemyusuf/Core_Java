package day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        /*
        Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
         ipucu: bir karakter deyince aklimiza char gelir oyle degil mi?
         */

        Scanner scan=new Scanner(System.in);                         //  kullanicadan dedigi icin scanner  kullandik
        System.out.println("lutfen bir karakter giriniz");
        char harf=scan.next().charAt(0);                               //char at kullanılması nedeni:next char yok bu yuzden

        if ((harf>='a'  && harf<='z')|| (harf>='A' && harf<='Z')){
            System.out.println("Girilen karakter bir harf");
        } else  {
            System.out.println("Girilen bir harf degil");
        }
    }
}


// BİR KELİME DE GİRSEK İLK HARFİ ALACAKTIR SFKJGG YAZSAK S GOSTERECEK