import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[] args) {

        Scanner body = new Scanner(System.in);

        double kilo, boy, vki;

        System.out.println("Kilonuzu giriniz:");
        kilo = body.nextDouble();

        System.out.println("Boyunuzu giriniz:");
        boy = body.nextDouble();

        vki= kilo / (boy * boy);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz : "+ boy);
        System.out.println("Lütfen kilonuzu giriniz : "+ kilo);
        System.out.println("Vücut Kitle İndeksiniz : "+ vki);


    }
}
