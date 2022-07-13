/*

Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

*/

package odevler;

import java.util.Scanner;

public class ucgenCevre {
    public static void main(String[] args) {
        
    
    double a,b,c;
    double d;

    Scanner girdi=new Scanner(System.in);

    //üç kenar alındı----------------
    System.out.println("1.kenar : ");
    a=girdi.nextInt();
    
    System.out.println("2.kenar : ");   
    b=girdi.nextInt();

    System.out.println("3.kenar : ");   
    c=girdi.nextInt(); 

    //hesaplamalar--------------------------

    double u,cevre;
    double alan;

    u = (a+b+c)/2;
    cevre = 2*u;
    alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

    System.out.println("Ucgen cevresi : "+cevre+" Ucgen alani : "+alan);
}
}
