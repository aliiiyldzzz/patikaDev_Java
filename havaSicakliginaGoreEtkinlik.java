import java.util.Scanner;

public class havaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner secim = new Scanner(System.in);

        int hava;

        System.out.println("1 = 5'den küçük 2 = 5 ile 15 arasında 3 = 15 ile 25 arasında 4 = 25'ten büyük");
        System.out.println("Seçinizi yapınız:");
        hava = secim.nextInt();

        switch (hava){
            case 1:
                System.out.println("Bugün kayağa gidebilirsiniz.");
                break;
            case 2:
                System.out.println("Bugün sinemaya gidebilirsiniz.");
                break;
            case 3:
                System.out.println("Bugün piknik yapmaya gidebilirsiniz.");
                break;
            case 4:
                System.out.println("Bugün yüzmeye gidebilirsiniz.");
                break;

            default:
                System.out.println("Farklı bir seçin yaptınız.");
        }
    }
}
