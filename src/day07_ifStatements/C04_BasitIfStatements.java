package day07_ifStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = “Hafta sonu”
                gun=Sali output = “Hafta ici”
        *** String icin equals method’unu kullanin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String girilenGun=scan.next().toLowerCase();     //  next yerine nextline secmedik cunku tek kelimedir tum gun isimleri

        //   nasil yazacak Pazar,pazar PAZAR,PAzar ??? bilemeyiz
        // toLower veya toUpper yazmak belirsizliği ortadan kaldirir.


        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){  //GIRIS  if ile
            System.out.println("Girilen Gun HAFTASONU");      //  CIKIS   sout ile
        }

        // || or anlamindadir

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")|| girilenGun.equals("carsamba")|| girilenGun.equals("persembe")
                || girilenGun.equals("cuma")){
            System.out.println("Girilen Gun HAFTAICI");
        }

        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")|| girilenGun.equals("carsamba")|| girilenGun.equals("persembe")
                || girilenGun.equals("cuma") || girilenGun.equals("pazar") || girilenGun.equals("cumartesi"))){
            System.out.println("gecerli bir gun giriniz");
        }

    }
}
//if (boolean sart yazilir){sart saglanirsa istenen kod yazilir, sout ile yapilir ve; ile bitirilir }