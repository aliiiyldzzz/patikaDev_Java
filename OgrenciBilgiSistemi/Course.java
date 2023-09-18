package OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name, code, prefix;
    double note;

    Course( String name, String code, String prefix){
        this.name = name;
        this.code = code;
        int note = 0;
        this.prefix = prefix;

    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ve ders bölümleri oluşmuyor.");
        }

    }

    void printTeacher(){
        this.teacher.print();

    }
}

