package day03_scanner;


import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanicidan ismini isteyin
        // girilen ismi
        // isminiz : yusuf seklinde yazdirin


        // insanlarin dunyasıdan kodlarin bulundugu class a deger almak icin
        // scanner class ini kullaniriz

        // 1- scanner olustur
        Scanner scan =new Scanner(System.in);

        // 2- kullaniciya istedigini soyle

        System.out.println("lutfen isminizi girin");

        // 3- olusturdugumuz scan objesi ile kullanicinin girdigi degeri alip
        // olusturacagimiz uygun bir variableye atayalim

        String kullaniciIsmi=scan.next();

        System.out.println("isminiz:"+kullaniciIsmi);



    }

}
