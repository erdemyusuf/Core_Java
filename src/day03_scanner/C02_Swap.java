package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {

 /*
 1- verilen sayi1 ve sayi2 variable nin degerini degistiren SWAP
 bir program yaziniz

 orn: sayi1=10 ve sayi2 =20

 kod  calıstıktan sonra

 sayi1=20 ve sayi2= 10


  */
        int sayi1=10;
        int sayi2=20;
        int sayi3=0;

        // sayi3 gecici kovamız

        // adim1- sayi2 yi bos kovaya koyalım

        sayi3=sayi2;  // 10 20  20 olur, islem en sagdan baslar bu yuzden sayi2 sayi3 e atanmıs olur

        // adim 2 - 1.sayiyi 2. sayiya atayacagiz

        sayi2=sayi1;  // 10  10   20   islem en sagdan baslar bu yuzden sayi1 sayi2 ye atanmıs olur

        //adim 3 - bos kovayi sayi1 e atayalim

        sayi1=sayi3;  // 20 10 20 islem en sagdan baslar bu yuzden sayi3 sayi1 e atanmıs olur

        System.out.println("swap sonrasi sayi1:"+ sayi1);
        System.out.println("swap sonrasi sayi2:"+ sayi2);

    }


}
