import java.util.Scanner;

public class cinZodyagı {
    public static void main(String[] args) throws Exception {
        double yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Dogum yilinizi girin :");
        yil = input.nextDouble();

        double cinYili = yil % 12;

        if(cinYili == 0){
            System.out.println("Cin zodyagi burcunuz : Maymun");
        }else if(cinYili == 1){
            System.out.println("Cin zodyagi burcunuz : Horoz");
        }else if(cinYili == 2){
            System.out.println("Cin zodyagi burcunuz : Kopek");
        }else if(cinYili == 3){
            System.out.println("Cin zodyagi burcunuz : Domuz");
        }else if(cinYili == 4){
            System.out.println("Cin zodyagi burcunuz : Fare");
        }else if(cinYili == 5){
            System.out.println("Cin zodyagi burcunuz : Okuz");
        }else if(cinYili == 6){
            System.out.println("Cin zodyagi burcunuz : Kaplan");
        }else if(cinYili == 7){
            System.out.println("Cin zodyagi burcunuz : Tavsan");
        }else if(cinYili == 8){
            System.out.println("Cin zodyagi burcunuz : Ejderha");
        }else if(cinYili == 9){
            System.out.println("Cin zodyagi burcunuz : Yilan");
        }else if(cinYili == 10){
            System.out.println("Cin zodyagi burcunuz : At");
        }else if(cinYili == 11){
            System.out.println("Cin zodyagi burcunuz : Koyun");
        }
    }
}