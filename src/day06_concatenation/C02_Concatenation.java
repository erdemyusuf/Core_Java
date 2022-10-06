package day06_concatenation;

public class C02_Concatenation {

    public static void main(String[] args) {
        String str1="Java";
        String str2="Guzeldir";
        int sayi1=5;
        int sayi2=4;


        // yukaridaki variable leri kullanarak istenen metinleri yazdiralim

        System.out.println(str1+" "+str2+" "+sayi1+sayi2); // java guzeldir 54

        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));  // java guzeldir 9

        System.out.println(sayi1+sayi2+ " "+str1);  // 9 java - islem soldan baslar toplam icin paranteze gerek yok -

        System.out.println(""+sayi1+sayi2+" "+str2);  // 54 guzeldir  "" hiclik anlamindadir stringe cevirdi 54 oldu
        //"" hiclik anlamındadır. " " ise bosluk bırakır araya bir bosluk yaptik


        // string metotlarindan concat secersek de yanyana yazabiliriz ( + ile birleştirme yerine metot kullanmak istersek concat yapabiliriz)

        System.out.println(str1.concat(str2));                          //JavaGuzeldir
        System.out.println(str1.concat((" ").concat((str2))));          //Java Guzeldir




    }
}
