
import java.util.Scanner;

public class Odevseti10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;

        do {
            System.out.print("1: Bir sayinin karesini hesapla." + "\n" + "2: Bir sayinin kupunu hesapla." + "\n" + "3: Bir sayinin tek veya cift oldugunu kontrol et." + "\n" + "4: Bir sayinin pozitif, negatif veya sifir oldugunu belirle." + "\n" + "5: Programdan cik." + "\n" + "Seciminiz: ");
            c = sc.nextInt();

            switch (c) {
                case 1:
                    System.out.print("Sayiyi giriniz: ");
                    double n1 = sc.nextDouble();
                    System.out.println("Sonuc: " + (n1 * n1));
                    break;
                case 2:
                    System.out.print("Sayiyi giriniz: ");
                    double n2 = sc.nextDouble();
                    System.out.println("Sonuc: " + (n2 * n2 * n2));
                    break;
                case 3:
                    System.out.print("Tam sayiyi giriniz: ");
                    int n3 = sc.nextInt();
                    if (n3 % 2 == 0) {
                        System.out.println("Sayiniz cifttir.");
                    } else {
                        System.out.println("Sayiniz tektir.");
                    }
                    break;
                case 4:
                    System.out.print("Sayiyi giriniz: ");
                    double n4 = sc.nextDouble();
                    if (n4 > 0) {
                        System.out.println("Sayi pozitifdir.");
                    } else if (n4 < 0) {
                        System.out.println("Sayi negatifdir.");
                    } else {
                        System.out.println("Sayi sifirdir.");
                    }
                    break;
                case 5:
                    System.out.println("Cikis yapiyom");
                    break;
                default:
                    System.out.println("Gecersiz secim.");
            }
            System.out.println();
        } while (c != 5);

 
    }
}