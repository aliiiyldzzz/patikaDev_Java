import java.util.Scanner;

public class yilizlarUcgen {
    public static void main (String [] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of steps: ");
        int n= sc.nextInt();

        for (int i=1; i <= n ; i++){
            for (int k = 0; k < (n-i); k++ )
            {
                System.out.print(" ");
            }

            for (int j=1; j<= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a= n-1; a >= 0; a--)
        {
            for (int b=0; b < n-a; b++)
            {
                System.out.print(" ");
            }

            for (int c=1; c<=(2*a-1); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}