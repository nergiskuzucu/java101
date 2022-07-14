/*

        Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

*/

import java.util.Scanner;

public class etkinlik {
    public static void main(String[] args) {

        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Değerini Giriniz: ");
        sicaklik = input.nextInt();

        System.out.println("Hava Durumuna Uygun Etkinlikler:");
        
        /* 
        if(sicaklik<5)
            System.out.println("Kayak");
        
        else if(sicaklik<25){
            if(5<sicaklik && sicaklik<15)
                System.out.println("Sinema");
            else if(15<sicaklik && sicaklik<25)
                System.out.println("Piknik");
        }

        else
            System.out.println("Yuzme");

        */

        if(sicaklik>25)
            System.out.println("Yuzme");
        else if(sicaklik>15)
            System.out.println("Piknik");
        else if(sicaklik>5)
            System.out.println("Sinema");
        else
            System.out.println("Kayak");

    }
}
