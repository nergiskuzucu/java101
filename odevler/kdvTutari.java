/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
*/

package odevler;
import java.util.Scanner;

public class kdvTutari {
    public static void main(String[] args) {
        
        double tutar, kdvOran, kdvliTutar,total ;
    
        //kullanicidan deger al
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ucret tutarini giriniz : ");
        tutar = input.nextDouble();

        if(0<tutar&& tutar<1000){
            kdvOran=0.18;
        }
        else{
            kdvOran=0.08;
        }

        kdvliTutar = tutar * kdvOran;

        System.out.println(kdvliTutar);

        total = tutar + kdvliTutar;

        System.out.println(total);


    }
}
