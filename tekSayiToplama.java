import java.util.Scanner;

public class tekSayiToplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int toplam = 0;

        do {
            System.out.println("Bir Sayi Giriniz: ");
            n = scanner.nextInt();

            if (n % 2 == 1) {
                toplam += n;
            }
        } while (n > 0);

        System.out.println("Toplam: " + toplam);

    }

}