import java.util.Scanner;

public class daireHesap {
    public static void main(String[] args) {
        
    double  pi=3.14 , r , cevre , alan;

    System.out.println("Dairenin Yarı Çapını Giriniz");
    
    Scanner input = new Scanner(System .in);
    
    r = input.nextDouble();

            
    cevre=2*pi*r;
    alan = pi*r*r;
    
    System.out.println("Dairenin Çevresi " +cevre);   

    System.out.println("Dairenin Alanı " +alan);
    


    }
    
}
