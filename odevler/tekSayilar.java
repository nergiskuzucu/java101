/*

Java döngüler ile negatif bir değer girilene kadar kullanıcıdan 
girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp e
krana basan programı yazıyoruz.

Ödev

Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri 
kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları 
toplayıp ekrana basan programı yazıyoruz.

*/

import java.util.Scanner;

public class tekSayilar {
    public static void main(String[] args) {

        int sayi,toplam=0;
        Scanner input = new Scanner(System.in);


        do{
            sayi = input.nextInt();

            if(sayi%2 == 0 && sayi%4 == 0){
                toplam += sayi;
            }
            
        }while(sayi% 2 == 0);


        System.out.println(toplam);
    }
}
