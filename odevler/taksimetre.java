/*

Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.

*/

package odevler;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        double tmetre,acilis,ucret,yol;
        tmetre=2.20;
        acilis=10.0;
        ucret=0.0;
        yol=0.0;

        System.out.println("Mesafeyi girin : ");
        Scanner input = new Scanner(System.in);

        yol = input.nextDouble();

        ucret = acilis + (yol * tmetre);  //hesaplama

        if(ucret <= 20.0)
                {
                    ucret = 20;
                }

        System.out.println("Odenecek tutar : " + ucret);


    }
}
