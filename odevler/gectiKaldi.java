/*
 Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

 */

import java.util.Scanner;

public class gectiKaldi {
    public static void main(String[] args) {

        int mat,fiz,tur,kim,muz,gecme=55;
        boolean durum;
        double ort=0.0;

        Scanner input = new Scanner(System.in);

        //notlarin girilmesi 

        System.out.println("Matematik notu : ");
        mat=input.nextInt();
        System.out.println("Fizik notu : ");
        fiz=input.nextInt();
        System.out.println("Turkce notu : ");
        tur=input.nextInt();
        System.out.println("Kimya notu : ");
        kim=input.nextInt();
        System.out.println("Muzik notu : ");
        muz=input.nextInt();

        if (mat < 0 || mat > 100)
        mat = 0;
        if (fiz < 0 || fiz > 100)
        fiz = 0;
        if (kim < 0 || kim > 100)
        kim = 0;
        if (tur < 0 || tur > 100)
        tur = 0;
        if (muz < 0 || muz > 100)
        muz = 0;

        //ortalama hesabi

        ort=(mat+fiz+kim+tur+muz)/5.0;

        durum = ort>=gecme;

        if(durum)
            System.out.println("Geçti");
        else
            System.out.println("Kaldi");

    }
}
