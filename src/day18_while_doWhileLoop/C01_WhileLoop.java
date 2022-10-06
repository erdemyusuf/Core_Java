package day18_while_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {


        /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */

        char ilkHarf='f';
        char sonHarf='t';
        char temp=ilkHarf;  // bize vrilen ilk harfi bozmamak icin temp tanımladık
        String buyult="";
        while(temp<=sonHarf){
            buyult=(temp+"").toUpperCase();  // yanına "" hiclik koyduk ki string hale cevirdik.
            System.out.print(buyult + " ");
            temp+=1;
        }
    }

}
