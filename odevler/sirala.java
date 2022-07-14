/*

Ödev
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

*/

import java.util.Scanner;

public class sirala {
    public static void main(String[] args) {
        int s1,s2,s3,max;

        Scanner input = new Scanner(System.in);

        System.out.println("ilk sayi : ");
        s1=input.nextInt();

        max = s1;

        System.out.println("ikinci sayi : ");
        s2=input.nextInt();

        if(s2>max)
            max=s2;

        System.out.println("ucuncu sayi : ");
        s3=input.nextInt();
        
        if(s3> max)
            max=s3;

        System.out.println("En buyuk sayi : "+ max);
    }
}
