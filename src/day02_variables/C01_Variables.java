package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {

        int            note         =                70                  ;
        //data turu   variable ismi assigment sign   varible degeri     islem bitti isareti

        int note2      =    80;
        //variable         deger


// java once degeri hesaplar sonra assign islemini yapar


        note2=90;
        // basina int yazmaya gerek yok.cunku bebek dogmus
        // en son deger 90 oldugu icin ortalamada 90 baz alınacak
        // eger yazmamıs olsaydık note2 yi 80 alacakti

        int ort=(note+note2)/2;

        System.out.println(ort);
        // " " icinde yazilan hersey metindir, java " " icinde ne gorurse o sekilde yazar
        // eger variable yazdırmak istersek " " olmadan variable ismini yazariz.


    }
}
