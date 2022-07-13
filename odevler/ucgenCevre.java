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