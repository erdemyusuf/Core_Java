package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {

    public static void main(String[] args) {

       /*
        Wrapper class javanin hazir methodlari kullanabilmemiz icin
        primitive data turlerinin herbiri icin actigi class'lardir
        int --> Integer
        char --> Character
        digerleri primitive data turu ile ayni sadece bas harfi buyuk
         */

        String str= "Java ile hayat ne guzel";
        System.out.println(str.toUpperCase()); // JAVA ILE HAYAT NE GUZEL

        boolean guzelMi= true;
        // guzelMi.   boolean primitive oldugundan hazir method'u bulunmuyor

        Boolean buGuzelMi=true;
        buGuzelMi.toString();


        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.MAX_VALUE); // 32767

        String ogrNo="123456"; // toplama cıkarma yapmayacaksak variableleri string yapabiliriz

        // kullanicidan bir sifre isteyin
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");
        String sifre=scan.nextLine();  // rakamlardan olusmaması istenmis

        Integer sifreSayi= Integer.parseInt(sifre);  // bu ınteger metotu icine string alır
        System.out.println("girilen sifrenin 3 fazlasi : " + (sifre+3));  //
        System.out.println("Integer sifrenin 3 fazlasi : " + (sifreSayi+3));  // matematiksel islem
        /*
        Wrapper class'lar ilerde kullanabilecegimiz pekcok faydali hazir method icerir
         */


















    }


}
