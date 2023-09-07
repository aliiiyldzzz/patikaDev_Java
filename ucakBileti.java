import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) {
        int distance,age,journey;
        double total,price,discount;
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Mesafeyi KM Cinsinden Giriniz: ");
        distance = input.nextInt();

        System.out.print("Lütfen Yaşınızı Giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk Tipinizi Giriniz: ");
        journey = input.nextInt();

        if ((distance > 0) && (journey == 1 )){

            if ((age > 24) && (age <= 65)){
                price = (distance * 0.10);
                total = price;

            } else if ((age >= 12) && (age <=24)) {
                price = (distance * 0.10);
                discount = price * 0.10;
                total = price - discount;

            } else if (age < 12) {
                price = (distance * 0.10);
                discount = price * 0.50;
                total = price - discount;
            } else  {
                price = (distance * 0.10);
                discount = price * 0.30;
                total = price - discount;
            }System.out.println("Toplam Tutar: "+ total);
        } else if ((distance > 0) && (journey == 2)) {
            double discountJourney;
            if ((age > 24) && (age <= 65)){
                price = (distance * 0.10);
                discount = price * 0.20;
                total = price - discount;

            } else if ((age >= 12) && (age <=24)) {
                price = (distance * 0.10);
                discount = price * 0.10;
                discountJourney = discount * 0.20;
                total = price-(discount + discountJourney);

            } else if (age < 12) {
                price = (distance * 0.10);
                discount = price * 0.50;
                discountJourney = discount * 0.20;
                total = price-(discount + discountJourney);
            } else{
                price = (distance * 0.10);
                discount = price * 0.30;
                discountJourney = discount * 0.20;
                total = price -(discount + discountJourney);
            }System.out.println("Toplam Tutar: "+ total);
        }
        else {
            System.out.println("Hatalı Bir Seçim Yaptınız...");
        }
    }

}