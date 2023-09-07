import java.util.Scanner;

public class sayılarıKücüktenBüyügeSıralama {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);

        int a,b,c;

        System.out.println("İlk sayıyı giriniz:");
        a = sayi.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        b = sayi.nextInt();

        System.out.println("Üçüncü sayıyı giriniz:");
        c = sayi.nextInt();

        if (a>b){
            if (b>c){
                System.out.println("c<b<a");
            }else {
                System.out.println("b<c<a");
            }
        }else if (b>a){
            if (a>c){
                System.out.println("c<a<b");
            }else {
                System.out.println("a<c<b");
            }
        }else if (c>a){
            if (a>b){
                System.out.println("b<a<c");
            }else {
                System.out.println("a<b<c");
            }
        }
    }
}
