package OgrenciBilgiSistemi;

public class Course {
    /* BIL ---> Bilgisayar Programlama 201
       EEm ---> Güç Sistemleri Analizi 402
       INM ---> Çelik Yapılar 483
       EAK ---> Modern Amerikan Edebiyatı 207
       EEM ---> Mikroişlemciler ve uygulamları 304
       ENM ---> Tedarik Zinciri Yönetimi 401
     */

    Teacher teacher ;

    String name ,code ,prefix;
    double  Vnote,Fnote;
    double Gecmenote = Vnote + Fnote;
    public Course(Teacher teacher, String name, String code, String prefix) {
        this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int Vnote, Fnote = 0;
    }
    void printTeacher(){
        this.teacher.print();
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix))
            this.teacher = teacher;
        else
            System.out.println("Öğretmen ve ders uyuşmuyor! ");
    }


}
