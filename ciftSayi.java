
import java.util.Scanner;

public class ciftSayi
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz: ");
        int k = scanner.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}