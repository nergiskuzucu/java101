import java.util.Scanner;
/**
 * usAlma
 */
public class usluSayi {

    public static void main(String[] args) {
      
                int taban,us;
                int sonuc =1;
                Scanner input = new Scanner(System.in);

                System.out.print("Taban sayiyi girin:");
                taban = input.nextInt();
                System.out.println("Ussu girin:");
                us = input.nextInt();
        
                for(int i =1;i<=us;i++){
        
                    sonuc=sonuc*taban;
        
                }
        
                System.out.println(sonuc);
            }
        }