package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {

    public static void main(String[] args) {
        // kullanıcıdan 4 basamaklı bir sayi alın ve rakamlar toplamını bulup yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();   //   5267 olsun


        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;  // kullanicinin girdigi sayinin degismemesi icin tanimladik


        // su anda sayi 5267 birler bas 0 rak top 0

        birlerBasamagi=sayi%10;
        rakamlarToplami +=birlerBasamagi;

        sayi /=10;  // sayiyi 10 a bolup 10 a atıyor (decrement)

        // su anda sayi 526 bb 7 rt 7

        birlerBasamagi= sayi%10;  // bb 6
        rakamlarToplami +=birlerBasamagi;  //7+6=13

        sayi/=10;  // sayiyi 10 a bolup 10 a atıyor (decrement)


        //su anda sayi 52 bb 6 rt 13

        birlerBasamagi=sayi%10;  // bb 2
        rakamlarToplami +=birlerBasamagi;  //  rt 13+2=15

        sayi/=10;

        //su anda sayi 5  bb 5 rt 15

        birlerBasamagi=sayi%10;  // bb 5
        rakamlarToplami +=birlerBasamagi;  // rt 15+5 = 20

        sayi/=10;

        //su anda sayi 0 bb 5 rt 20

        System.out.println(ilkGirilenSayi + " sayisinin rakamlar toplami:" + rakamlarToplami);  // string icinde bosluk birakirsak calistirinca bosluk aliriz




    }

}
