package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        // dar veri turundeki bir degeri genis turdeki variabale ye otomatik assign olarak eder
        byte sayi1=23;
        short sayi2=55;
        int sayi3=sayi1+sayi2;  // 88 sonucu verir  int>short ve byte


        double sayi4=sayi1*sayi2;  //1265.0 olur

        sayi4=sayi2/sayi1;
        System.out.println(sayi4);  // once islemi yapar 55/23 2.391 olur ikisini de int olarak alir sayi4 double 2.0 gosterir

        sayi4= (double)sayi2/sayi1;  // yukarıdakinden farkli olarak double olarak islem yaptık. sayi2 yi double yaptık, sayi1 i yapmadık

        System.out.println(sayi4);



    }

}
