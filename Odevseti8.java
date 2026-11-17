
import java.util.Scanner;

public class Odevseti8 {

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        
        int gizlisayi = 78;
        int tahmin;
        do {            
            System.out.println("Tahmin:");
            tahmin = sc.nextInt(); 
            
            
          
            if (tahmin == gizlisayi) {
                System.out.println("Dogru sayi!");
            } else if (gizlisayi > tahmin) {
                System.out.println("Girdiginiz sayi gizli sayidan kucuktur.");
            } else {
                System.out.println("Girdiginiz sayi gizli sayidan buyuktur.");
            }
            
        } while (tahmin != gizlisayi); 
        
        

        
    
}

}