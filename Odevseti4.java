
import java.util.Scanner;

public class Odevseti4 {

    public static void main(String[] args) {

        
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz:");
        
        int sayi = sc.nextInt();
        if (0 >= sayi) {
            System.out.println("Yanlis bir sayi girdiniz.");  
        } else {
            
             int i = 1;
        int carpım = 1;
        
        while (sayi >= i) {            
            carpım = carpım*i;
            i++;
        }
 
        System.out.println("Sayinin faktoriyeli=" + carpım);
            
            
            
            
            
            
            
           
            
            
        }
        
        
      
       
        
    }
}
