/*

Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...

*/

package odevler;
import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        int mat , fizik , kimya , turkce , tarih , muzik;

        Scanner inp = new Scanner(System.in);

        //Kullanicidan degerleri al:
        //syso-tab

        System.out.println("Matematik notunuz : ");
        mat=inp.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik=inp.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya=inp.nextInt();

        System.out.println("Turkce notunuz : ");
        turkce=inp.nextInt();

        System.out.println("Tarih notunuz : ");
        tarih=inp.nextInt();

        System.out.println("Muzik notunuz : ");
        muzik=inp.nextInt();

        double sonuc = ( mat + fizik+kimya+turkce+tarih+muzik )/6.0;

        System.out.println(sonuc);

        //kosul ifadesi
        String durum  = (sonuc >= 60) ? "Gecti :) ": "Kaldi :( ";
        System.out.println("Basari Durumu : "+durum);


    }
}
