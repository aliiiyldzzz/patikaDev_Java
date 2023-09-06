import java.util.Scanner;

public class daireninAlanıVeCevresi {
    public static void main(String[] args) {

        Scanner daire = new Scanner(System.in);

        double pi = 3.14, r;
        int a;

        System.out.println("Dairenin r giriniz:");
        r = daire.nextDouble();
        System.out.println("Dairenin a giriniz:");
        a = daire.nextInt();
        double cevre = 2* pi * r;
        double alan = pi * Math.pow(r,2);
        double dilimAlanı = (pi * Math.pow(r,2)*a)/360 ;

        System.out.println("Dairenin Alanı ="+ alan);
        System.out.println("Dairenin Çevresi ="+ cevre);
        System.out.println("Merkezi açısı a olan daire diliminin alanı ="+ dilimAlanı);


    }
}
