import java.util.Scanner;

public class kullanıcıGirisi {
    public static void main(String[] args) {

        Scanner pass = new Scanner(System.in);
        int sifre = 1234;
        int a,select,np;


        System.out.println("Şifrenizi giriniz:");
        a = pass.nextInt();

        if(sifre == a){
            System.out.println("Şifre doğru.");
        }else{
            System.out.println("Şifre yanlış.");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? 1:Y / 2:N");
            select = pass.nextInt();

            switch (select){
                case 1:
                    System.out.println("Yeni şifrenizi giriniz:");
                    np = pass.nextInt();
                    if (np == sifre){
                        System.out.println("Şifre oluşturulamadı.Lütfen başka şifre giriniz.");
                    }else {
                        System.out.println("Şifreniz başarıyla oluşturuldu.");
                    }
            }
        }


    }

}
