package OgrenciBilgiSistemi;

public class TestObs {

    public static void main(String[] args){

        Teacher t1 = new Teacher("Seda Yazıcı","53957842157","BIL");
        Course java = new Course(t1,"Java","201","BIL");
        java.printTeacher();

        Teacher t2 = new Teacher("Doğukan Yazıcı","5326849506","EEM");
        Course guc = new Course(t2,"Güç Sistemleri Analizi","402","EEM");
        guc.printTeacher();

        Teacher t3 = new Teacher("Abdullah Çiloğlu","5382945869","INM");
        Course celik = new Course(t3,"Çelik Yapılar","483","INM");
        celik.printTeacher();

        Teacher t4 = new Teacher("Fidaye Kurt","53493460872","EAK");
        Course amerikanE = new Course(t4,"Modern Amerikan Edebiyatı","207","EAK");
        amerikanE.printTeacher();

        Teacher t5 = new Teacher("Gürcan Çiftçi","5473894562","EEM");
        Course mikroislemci = new Course(t5,"Mikroişlemciler ve Uygulamaları","304","EEM");
        mikroislemci.printTeacher();

        Teacher t6 = new Teacher("Okan Ulaş Yazıcı","5485735478","ENM");
        Course tedarik = new Course(t6,"Tedarik Zinciri Yönetimi","401","ENM");
        tedarik.printTeacher();

        Student std1 = new Student(celik,amerikanE,"Ahmet Furkan Aslan","200303045","4");
        std1.addBulkExamNote(70,82,56,72);
        //std1.printNote();
        std1.isPassCourse(celik,20,53);
        System.out.println();
        std1.isPassClass(celik,amerikanE);


    }

}
