package day07_ifStatements;

public class C01_AndOperatorleri {

    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);   // true  && ile baglandigi icin hepsi dogru ise true olur

        System.out.println(a<0 && b<20 && c>=b);    // false bir tanesi false olsa sonuc false olur

        /*
        java && operatoru konusunda bize iki secenek sunar
        && (and and) kullanırsak ilk false ise artık sonuc falsedir, geriye kalanı incelemez
        & (and) kullanırsak tum ssartlari konrtol eder, sonra sonucu belirler
        bundan dolayi & daha yavas olabilir
         */

        System.out.println(a<0 & b<20 & c>=b);  //false





    }
}
