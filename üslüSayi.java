import java.util.Scanner;

public class üslüSayi {
    public static void main(String[] args) {
        int n,k = 1, total = 1;
        int i = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayıyı Giriniz: ");
        n = in.nextInt();
        System.out.print("Üs Olacak sayıyı Giriniz: ");
        k = in.nextInt();
     /*
      while (i <= k){
          total *= n;
          i++;
      }
      System.out.println("Sonuc : " + total);
   */
        for ( i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println("Sonuc : " + total);


    }
}
