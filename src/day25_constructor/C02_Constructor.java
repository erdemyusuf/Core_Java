package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {




        C01         obj1        =   new         C01()    ;
        // class adi  objenin adi     keyword    constructor
        Scanner scan = new Scanner(System.in);
        Random rnd= new Random();
        List<String> list= new ArrayList<>();
        // List<String> list2=new List<>(); --> sadece list ile yazamayiz, ArrayList yazmaliyiz
        /*
        Javada bir obje olusturabilmek icin
        mutlaka constructor kullanmalisiniz

        Aynı class kullanilarak birden fazla obje uretebiliriz
         */
        System.out.println(obj1.sayi); // 0
        obj1.deneme(); // C01 den deneme method calisir ifadesini yazdirir


         /*
            obje oluşturmak sipariş vermek gibidir.
             constructor  class icinde main metot dısında olusturulur

        1- Obje olusturmak icin constructor kullanmak zorundayiz
        2- Constructor'da parametre ile ozellikleri belirlemezsek, java standart bir obje olusturur
        3- Her class'da gormesek bile Java'nin koydugu default constructor vardir

        */

        /*
        Herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda
        Java degeri su siralama ile arar
        1- o obje olusturulduktan sonra bir deger atandi mi ?
        2- Objenin olusturuldugu class'da variable'a bir deger atanmis mi bakar
        3- O zaman data turune gore Java default degeri atar
         */
    }
}