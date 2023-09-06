import java.util.Scanner;

public class taksimetreProgramı {
    public static void main(String[] args) {

        Scanner mesafe = new Scanner(System.in);

        double km, kmFiyat = 2.20;
        int acilisUcret = 10;

        System.out.println("Gidilen mesafe =");
        km = mesafe.nextInt();

        double toplam = (km*kmFiyat)+acilisUcret;
        toplam = toplam < 20 ? 20 : toplam;

        System.out.println(toplam);



    }
}
