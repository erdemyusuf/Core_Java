package day17_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

 /*
        verilen input'a gore
        * lardan olusan asagidaki sekli olusturun
        input=4
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */


        // artan kismi nested forloop ile yapalim

        int verilen=5;

        for (int i = 1; i <=verilen ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("# ");
            }
            System.out.println("");
        }
        for (int i = verilen-1; i >=1 ; i--) {  // azalacak unutma
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");   //------->  ALT SATIRA GECMEK İCİN HİCLİK İLE KOMUT VERDİK
        }                               // VAR OLAN LOOP A EKLEMEZSEK YANYANA SIRAYLA 1 2 3 4 5 YILDIZ YAZDIRIR
                                         // nested loop ta ilk for icine yazdık. sade loop olsa for dısına yazmak lazım alt satır icin
    }
}
