/*
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

*/

import java.util.Scanner;

public class ciftSayilar {

    public static void main(String[] args) {
        int toplam=0,ort,sayi,sayac=0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi girin : ");
        sayi=input.nextInt();

        for(int i=0; i<=sayi; i++){
            if(i%3 == 0 && i%4 == 0){
              toplam += i;  
              sayac++;
            } 
            
        }

        ort=toplam/sayac;
        System.out.println(ort);
    }
    
}
