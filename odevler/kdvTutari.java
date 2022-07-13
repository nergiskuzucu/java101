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
