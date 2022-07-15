/*
Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

*/

import java.util.Scanner;

public class kuvvetler {
    public static void main(String[] args) {
        
        int sayi;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi girin : ");
        sayi=input.nextInt();

        for(int i=0; i<=sayi; i++){
            if(i%4 == 0 && i%5 == 0){
              System.out.println(i);
            } 
            
        }


    }
    
}
