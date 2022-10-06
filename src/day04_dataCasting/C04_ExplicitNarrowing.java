package day04_dataCasting;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {


        int sayi1=130;


        byte sayi2= (byte) sayi1;
        System.out.println(sayi2);

        /*
        genis data turundeki degeri dar data turndeki variable ye atamak istersek
        java genis data turundeki degerin, dar data turunun sinirlarına uydurmak icin
        java risk almaz. bunun icin degerin onune parantez icine istedigimiz data turunu
        yazmamız yeterlidir

        riski aldık

        1.deger kalıba uyar ise ise hicbir kayıp olmadan cast(degisir) olur
        2. double ı int a cast etmek data kaybı yasatabilir
        3.genis kalıptan dar kalıba sınır asılırsa veri kaybı olabilir



         */

    }


}
