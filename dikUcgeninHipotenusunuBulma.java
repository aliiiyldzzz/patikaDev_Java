import java.util.Scanner;

public class dikUcgeninHipotenusunuBulma {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);

        /*
        int a, b;
        double c;
        System.out.println("Üçgenin dik kenarını yazınız:");
        a = line.nextInt();
        System.out.println("Üçgenin dik kenarını yazınız:");
        b = line.nextInt();
        double hip = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        System.out.println("Hipotenüs ="+hip);
        */

        int a, b;

        System.out.println("Üçgenin dik kenarını yazınız:");
        a = line.nextInt();
        System.out.println("Üçgenin dik kenarını yazınız:");
        b = line.nextInt();

        double alan = (a*b)/2;
        System.out.println(alan);


    }

}
