
import java.util.Scanner;

public class Odevseti2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("bir sayi giriniz:");

        int sayi = sc.nextInt();

        int i = 1;
        int tek = 0;
        int cift = 0;

        while (sayi >= i) {

            if (i % 2 == 0) {

                cift = cift + i;
            } else {
                tek = tek + i;
            }

            i++;

        }

        System.out.println("teklerin toplami=" + tek + ",ciftlerin toplami=" + cift);

    }
}
