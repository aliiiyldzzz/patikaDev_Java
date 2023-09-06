import java.util.Scanner;

public class manavKasaProgramı {
    public static void main(String[] args) {

        Scanner ürün = new Scanner(System.in);

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlıcan=5.00;
        double ar, el,dom,mu,pat, toplam;

        System.out.println("Lütfen Armut kg giriniz : ");
        ar = ürün.nextDouble();
        System.out.println("Lütfen Elma kg giriniz : ");
        el = ürün.nextDouble();
        System.out.println("Lütfen Domates kg giriniz : ");
        dom = ürün.nextDouble();
        System.out.println("Lütfen Muz kg giriniz : ");
        mu = ürün.nextDouble();
        System.out.println("Lütfen Patlıcan kg giriniz : ");
        pat = ürün.nextDouble();

        toplam = (ar*armut)+(el*elma)+(dom*domates)+(mu*muz)+(pat*patlıcan);

        System.out.println("Armut Kaç Kilo :"+ ar);
        System.out.println("Elma Kaç Kilo :"+ el);
        System.out.println("Domates Kaç Kilo :"+ dom);
        System.out.println("Muz Kaç Kilo :"+ mu);
        System.out.println("Patlıcan Kaç Kilo :"+ pat);
        System.out.println("Toplam Tutar :"+ toplam);
    }
}
