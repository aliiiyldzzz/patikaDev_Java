package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ali Hoca","5523131973","MTK");
        Teacher t2 = new Teacher("Muammer Hoca","5389762326","TRH");
        Teacher t3 = new Teacher("Betül Hoca","55555555","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t2);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course bio = new Course("Biyoloji","102","BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","1234","4",tarih,fizik,bio);
        s1.addBulExample(40,70,50);
        s1.isPass();




    }
}
