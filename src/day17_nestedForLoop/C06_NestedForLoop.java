package day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
/*
        verilen string'i asagidaki gibi yazdiran bir program yazalim
        input= Deniz
        D
        De
        Den
        Deni
        Deniz
         */


        String str="Yavuz Tahir";

        for (int i = 1; i <=str.length(); i++) {  // int string uyumu istedi bu yuzden str.length yaptık
            for (int j = 1; j <=i ; j++) {
                System.out.print(str.substring(j-1,j)); // ilk harf icin substring(0,1) olmali cunku index sıfırdan baslar
            }
            System.out.println("");
        }

    }
}
