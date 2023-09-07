import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) throws Exception {

        int yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Yil Giriniz :");
        yil = input.nextInt();

        boolean  artikYil  = yil  % 4 == 0 && ((yil % 100 != 0) || (yil % 400 == 0));

        if(artikYil == true){
            System.out.println(yil + "bir artik yildir");
        }else{
            System.out.println(yil + "bir artik yil degildir.");
        }

    }
}