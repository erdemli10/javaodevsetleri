
import java.util.Scanner;

public class Odevseti7 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       
        System.out.println("Bir sayi giriniz:");
        
        int sayi = sc.nextInt();
        
        if (2 > sayi) {
            System.out.println("Sayi asal degildir.");
        } else {
     
        int bolen = 0;
        
            for (int i = 1; i <= sayi; i++) {
                if (sayi % i == 0) {
                    bolen++;
                }
            }
        
            if (bolen == 2) {
                System.out.println("Sayiniz asaldir");   
            } else {
                System.out.println("Syainiz asal degildir.");
            }
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
        
        
        
    }
}
