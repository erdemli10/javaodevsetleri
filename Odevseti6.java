
import java.util.Scanner;

public class Odevseti6 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz:");
        int sayi = sc.nextInt();
        
        int tersi = 0; 

        while (sayi > 0) {
            int kalan = sayi % 10;       
            tersi = tersi*10 + kalan;  
            sayi = sayi / 10;            
        }

        
        
        System.out.println("Sayinin tersi = " + tersi);
        
        
        
        
        
        
    }
}
