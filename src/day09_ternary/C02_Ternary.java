package day09_ternary;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        // kullanicidan bir sayi alin sayi poztif ise "sayi pozitif"
        // negatifse sayinin karesini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();
        System.out.println(sayi>0 ? "sayi pozitif": (sayi*sayi));



        // eger ternary icinde sonuclar farkli data turlerinde ise atama yapamayiz, sadece yazdirabiliriz
        //           double                      string          double
        //   ORNEK: double sonuc=sayi>0 ? "sayi pozitif": (sayi*sayi); sonuc vermez

        //      BU YUZDEN SOUT YAPARIZ

       /*

            2.yol : ayni data turunde ise TERNARY variable ataması ve sout ile sonuc verir
            int sonuc= num>0 ? num:num*num;  // iki durumda da int istemis
             System.out.println(sonuc);
        */

    }
}
