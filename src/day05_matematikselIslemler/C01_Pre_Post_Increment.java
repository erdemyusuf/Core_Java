package day05_matematikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1=10;

        int sayi2=sayi1+1;   // sayi2-->11

        sayi2+=5;  // sayi2-->16

        /*
        pre veya post increment/decrement sadece ++ ve -- islemi icin gecerlidir
        bu iki islem icin sayidan sonra veya once yazılmasına gore farkli iki isleyis olur


         */

        int sayi3=sayi2++;  //  once sayi2  sayi3 e atanacak sonra sayi2 bir artirilacak

        /*
        eger ++ veya -- variable sonnra ise post... denir bu durumda onca yazdır sonra artir
         */

        System.out.println("sayi3:" + sayi3);  // 16
        System.out.println("sayi2:" + sayi2);  // 17



        int sayi4=++sayi1;  // sayi1 1 artırılacak ve sayi1 sayi4 e atanacak


        /*
        eger ++ veya -- variable oncesi ise pre... denir bu durumda onca artır sonra yazdir
         */

        System.out.println("sayi4:" + sayi4);  // 11
        System.out.println("sayi1:" + sayi1);  // 11




    }


}
