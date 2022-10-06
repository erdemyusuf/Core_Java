package day07_ifStatements;

public class C03_IfStatements {
    public static void main(String[] args) {



        /*
        bir if statement te süslü parantez kullanılmazsa java İLK SATIRI sart ile baglar
        sonraki satirlar bagımsız olur

        eger birden fazla satir ayni if sartina baglamis ise MUTLAKA {} kullanmaliyiz
         */

        int sayi=-23;  // if e baglı ilk satirlar calısır diğerleri bagımsızdir run edilince çıktı verir


        if(sayi>0)
            System.out.println("sayi pozitif");
        System.out.println("pozitif kalacaktir"); // -23 icin calismamasi beklenir ancak run edilince ilk satir harici bagımsızolur
        System.out.println("ucuncu satir");

        // run edilince -23 icin

        if (sayi%2==0)
            System.out.println("sayi cift");
        System.out.println("cift kalacaktir");  // -23 icin calismamasi beklenir ancak run edilince ilk satir harici bagımsızolur



        if (sayi%5==0)
            System.out.println("sayi 5 in tam kati");





    }
}
