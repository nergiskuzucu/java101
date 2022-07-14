/*
         
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu 
        şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre 
        oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan 
        programı yazınız.

*/
        
import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        //Kullanıcı adı ve parola oluştur

        String kullaniciAdi,kullaniciAdi2,parola,parola2,parola3,cevap;
        System.out.println("Kullanici adinizi olusturunuz : ");
        Scanner input = new Scanner(System.in);

        kullaniciAdi = input.nextLine();

        System.out.println("Parola olusturunuz : ");
        parola = input.nextLine();
        

        //Dogrula

        System.out.println("Giriş Yapınız...");
        System.out.println("Kullanıcı Adınız : ");
        kullaniciAdi2=input.nextLine();

        System.out.println("Parolanizi Giriniz : ");
        parola2=input.nextLine();

        System.out.println("Bilgiler Kontrol Ediliyor...");

        if(parola2.equals(parola)){
            System.out.println("Giriş Başarılı ! ");
        }

        else{
            System.out.println("Parola hatalı! Şifrenizi sıfırlamak ister misiniz? E / H ");

            cevap = input.nextLine();

            switch (cevap) {
                case "E":

                    System.out.println("Yeni parola oluşturun");
                    parola3 = input.nextLine();

                    while(parola3.equals(parola)){

                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        parola3 = input.nextLine();
                    }

                    parola=parola3;
                        
                    System.out.println("Şifre oluşturuldu");
                    

                    break;  

                case "H":
                    System.out.println("Giriş Yapılmadı!");
            }

        }
        

    }
}
