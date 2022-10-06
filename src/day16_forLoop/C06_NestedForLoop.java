package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

         /*
        Bazen tek degisken sorunu cozmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        // yan yana 3 tane * yaz
        for (int i = 1; i <=3 ; i++) {
            System.out.print("* ");
        }
        // yan yana 4 tane * yazin
        System.out.println("");       //------->  ALT SATIRA GECMEK İCİN HİCLİK İLE KOMUT VERDİK
        for (int i = 1; i <=4 ; i++) {
            System.out.print("* ");
        }
        System.out.println("");  //------->  ALT SATIRA GECMEK İCİN HİCLİK İLE KOMUT VERDİK
        // bu tur durumlarda ic ice(Nested) loop kullanmak gerekir
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println(""); //------->  ALT SATIRA GECMEK İCİN HİCLİK İLE KOMUT VERDİK
        }                              // VAR OLAN LOOP A EKLEMEZSEK YANYANA SIRAYLA 1 2 3 4 5 YILDIZ YAZDIRIR
                                        // nested loop ta ilk for icine yazdık. sade loop olsa for dısına yazmak lazım alt satır icin
    }
}
