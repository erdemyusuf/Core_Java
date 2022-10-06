package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {



        // Soru 3- Kulanicidan aldiginiz bir ismin,verilen array’de olup olmadigini kontrol edip,
        // bize true veya false sonucu donen bir method olusturun.

        String [] isimler= {"Basak", "Nurullah", "Fatih","Adem","Enes"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Aradiginiz ismi yaziniz");
        String arananIsim=scan.nextLine();
        boolean sonuc= contains(isimler,arananIsim); // true false istedigi icin boolean sonuc  yazıp metodu burada cagırdık
        if (sonuc){                                  // sout aşagıda metotta yazdırmadik. if ile burada bu islemi yaptık
            System.out.println("Girilen isim listede var");
        } else {
            System.out.println("girilen isim listede yok");
        }
    }
    public static boolean contains(String[] isimler, String arananIsim) {
        boolean sonucMethod=false;
        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].equalsIgnoreCase(arananIsim)){  //array deki isimler birebir ayni ise buyuk kucuk farketmemesi icin equalıgnorecase yi kullandik
                sonucMethod=true;
            }
        }

        return sonucMethod;  // return type void degil return kelimesini arar metot call icin
    }
}