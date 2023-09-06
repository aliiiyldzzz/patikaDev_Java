import java.util.Scanner;

public class notOrtalamasıPratik {
    public static void main(String[] args) {
        int mat, fiz, tur, tar,muz;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fiz = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz:");
        tur = input.nextInt();

        System.out.println("Tarih notunuzu giriniz:");
        tar = input.nextInt();

        System.out.println("Müzik notunuzu giriniz:");
        muz = input.nextInt();

        double avg = (mat+fiz+tur+tar+muz)/5;
        System.out.println("Not Ortalamanız ="+ avg);




    }
}
