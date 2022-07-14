package odevler;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        int n1,n2,select;

        System.out.println("Ilk Sayiyi Giriniz :");
        Scanner input =new Scanner(System.in);
        n1=input.nextInt();

        System.out.println("Ikinci Sayiyi Giriniz :");
        n2=input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");

        System.out.println("Hangi Islemi Yapmak Istersiniz ? :");
        select=input.nextInt();

        
        switch (select){
            case 1:
                System.out.println("Sonuc : "+(n1+n2));
                break;
            case 2:
                System.out.println("Sonuc : "+(n1-n2));
                break;
            case 3:
                System.out.println("Sonuc : "+(n1*n2));
                break;
            case 4:
                if (n2!=0){
                    System.out.println("Sonuc : "+(n1/n2));
                }else {
                    System.out.println("Sayi 0'a Bolunemez");
                }
                break;
            default:
                System.out.println("Hatali Secim Yaptiniz,Lutfen Tekrar Deneyiniz");

        }

        }

        }


