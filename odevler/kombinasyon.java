/* 
Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların 
sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)

*/

import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, r, a;
        int faktN = 1;
        int faktR = 1;
        int faktnR = 1;
        int comb;

        System.out.println("C(n,r)");

        System.out.println("n degerini giriniz: ");
        n = input.nextInt();
        System.out.println("r degerini giriniz: ");
        r = input.nextInt();

        //n! hesapla--------------------------

        //5! = 5.4.3.2.1
        for(int i=1; i<=n; i++){
            faktN = faktN * i;
        }

        //r! hesapla--------------------------
        
        for(int i=1; i<=r; i++){
            faktR = faktR * i;
        }

        //(n-r)! hesapla-------------------------

        a=n-r;
        for(int i=1; i<=a; i++){
            faktnR = faktnR * i;
        }

        //C(n,r) = n! / (r! * (n-r)!)

        comb = faktN/(faktR*faktnR);


        System.out.println("C(" + n + "," + r + ") = " + comb);


    }
}
