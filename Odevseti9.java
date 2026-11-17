
import java.util.Scanner;

public class Odevseti9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double top = 0;
        int poz = 0;
        int neg = 0;
        int sif = 0;

        for (int i = 0; i < 10; i++) {
          
            System.out.print((i + 1) + ". sayiyi girin: ");
            double s = sc.nextDouble();
            
            top += s;

            if (s > 0) {
                poz++;
            } else if (s < 0) {
                neg++;
            } else {
                sif++;
            }
        }

        double ort = top / 10.0;


        System.out.println("Toplam:" + top + " Ortalama:" + ort + " Pozitif:" + poz + " Negatif:" + neg + " Sifir:" + sif);
        
        

    }
}