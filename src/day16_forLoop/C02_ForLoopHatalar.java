package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        //baslangic noktasından sonra
        //bitis sartina yaklasmıyorsak sonsuz loop olusur

        /*
        for (int i = 0; i >-10 ; i++) {
            System.out.println(i);
        }
        */

        // eger ilk deger icin bile bitis sarti saglanmıyorsa for loop calısir
        //ama loop body si hicbir zaman devreye girmez

        for (int i = 0; i >5 ; i++) {
            System.out.println(i);
        }

    }
}
