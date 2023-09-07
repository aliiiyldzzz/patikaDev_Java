import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        Scanner sayi = new Scanner(System.in);

        double a, b;
        int secim;

        System.out.println("İlk sayıyı giriniz : ");
        a = sayi.nextDouble();

        System.out.println("İkinci sayıyı giriniz :");
        b = sayi.nextDouble();

        System.out.println("Seçim yapınız: 1:toplama - 2:çıkarma - 3:çarpma - 4:bölme");
        secim = sayi.nextInt();

        switch (secim){
            case 1:
                System.out.println("Sonuç ="+ a+b);
                break;
            case 2:
                System.out.println( a-b);
                break;
            case 3:
                System.out.println("Sonuç ="+ a*b);
                break;
            case 4:
                System.out.println("Sonuç ="+ a/b);
                break;

            default:
                System.out.println("Yanlış bir seçim yaptınız.");
        }
    }
}
