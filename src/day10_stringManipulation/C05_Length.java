package day10_stringManipulation;

public class C05_Length {
    public static void main(String[] args) {


        /*
        String str = "Java candır" str length i 11 en buyuk index 10 dur
        length uzunluktur 1 den baslar, index 0 dan baslar
        BU NEDENLE --> en buyuk index=str.lengtj()-1 iliskisi vardır

         */

        String str= "Java ogren, isi kap";  //
        System.out.println(str.length()); // str'in karakter sayisini dondurur 19
        System.out.println(str.charAt(str.length()-1)); // son karakterini yazdiralim p  karakter istendiği icin charAt metodu kullandik
        System.out.println(str.charAt(str.length()-3)); // sondan 3. karakteri yazdiralim

        /*
        Java'da null pointer (isaretleyici) bir deger degil,
        karsisina yazildigi variable'in hic BİR DEGER ATANMADIGININ İŞARETCİSİDİR
        null ın java daki karsiligi cok farklıdır
         */

        String str2= "" ;   // str2'ye bir deger atanmis midir? cevap: EVET,  bu deger nedir : hiclik
        System.out.println(str2.length()); // 0


        String str3=null; // str3'e bir deger atanmis midir HAYIR -  null bu deger atamamayi isaret etmektedir
        System.out.println(str3.length());  // bir deger atanmamis ki nasil uzunlugu olsun ? NullPointerException olarak hata verir


    }
}
