/*
		Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
		Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
		Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın 
		ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

		Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi 
		ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir 
		uyarı verilmelidir.
		Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
		Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
		Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
		Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

 */

import java.util.Scanner;

public class ucakBileti {
	public static void main(String[] args) {

		
		double km = 0.10;
		double mesafe;
		int yas;
		int yolculukTip;
		double biletUcret;

		Scanner input = new Scanner(System.in);

		System.out.println("Mesafeyi Girin : ");
		mesafe=input.nextDouble();

		System.out.println("Yasinizi Girin : ");
		yas=input.nextInt();

		System.out.println("Yolculuk Tipini Girin (Tek Yon-1 , Gidis Donus-2 ) : ");
		yolculukTip=input.nextInt();

		biletUcret = mesafe * km;

		if(mesafe<0 && yas<0){
			System.out.println("Hatali Veri Girdiniz!");
		}

		if (yas < 12) {
			biletUcret -= biletUcret * 0.5;
		}
		
		else if (yas >= 12 && yas <= 24) {
			biletUcret -= biletUcret * 0.1;
		}
		
		else if (yas >= 65) {
			biletUcret -= biletUcret * 0.3;
		}
		
		else {
			
		}

		if(yolculukTip==2){
			biletUcret -= biletUcret*0.2;
			biletUcret *= 2;
		}


		System.out.println("Tutar : " + biletUcret);

	
	}
}