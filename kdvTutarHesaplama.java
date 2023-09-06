import java.util.Scanner;

public class kdvTutarHesaplama {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        double tutar, kdv, kdvliTutar;
        System.out.print("Tutarı giriniz : ");
        tutar = input.nextDouble();
        kdv = tutar > 1000 ? 0.18 : 0.08;
        kdvliTutar = tutar + tutar * kdv;
        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV'li Fiyat = " + kdvliTutar);
        System.out.println("KDV tutarı = " + kdv);

    }
}
