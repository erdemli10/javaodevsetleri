
import java.util.Scanner;

public class Odevseti5 {

    public static void main(String[] args) {

        
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz:");
        
        int sayi = sc.nextInt();
        int basamak = 0;
         
        while (sayi > 0) {            
           sayi = sayi / 10;
                   basamak++;
        }

        System.out.println("Sayinin basmak sayisi=" + basamak);
       
        
           
           
 
        
        

    }
}
