import java.util.Iterator;
import java.util.Scanner;

public class faktöriyelHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyel Sayisi: ");
        int n = scanner.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        System.out.println(n + ". Faktoriyel : " + total);

    }

}