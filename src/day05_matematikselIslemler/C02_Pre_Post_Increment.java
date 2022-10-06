package day05_matematikselIslemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi=10;


        System.out.println("pre-increment:" +   ++sayi);  // pre de once artırma sonra yazdırma-atama

        System.out.println("post-increment:" +  sayi++);  // post ta once yazdırma-atama sonra artırma  (post ta sonra artırma)


        System.out.println("post-incrementten sonra:" + sayi);
        System.out.println(sayi++);;  // 12 olur  (13 niye olmadi????)  post islemdir sout ile calistirınca
                                      // once sayi yi yazdırır-atama yapar sonra artır

        System.out.println(++sayi);  //  14 olur  sout ile calistirınca


    }


}
