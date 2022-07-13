/* 

Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. 
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173           
    
*/

import java.util.Scanner;

public class vucutkitle {
    public static void main(String[] args) {
    
    double boy,kilo,indeks;

    System.out.println("Lutfen boyunuzu (m) giriniz : ");
    Scanner inp = new Scanner(System.in);
    boy = inp.nextDouble();

    System.out.println("Lutfen kilonuzu giriniz : ");
    Scanner input = new Scanner(System.in);
    kilo = input.nextDouble();

    indeks = kilo/(boy*boy);
    System.out.println("Vücut Kitle İndeksiniz : " + indeks );


    }
}
