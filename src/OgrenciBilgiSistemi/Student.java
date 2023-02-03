package OgrenciBilgiSistemi;

public class Student {
    Course c1, c2, c3;
    String name, stdNo, classes;
    double avarage,generalAvg;
    boolean isPass;

    public Student(Course c1, Course c2, String name, String stdNo, String classes) {
        this.c1 = c1;
        this.c2 = c2;

        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.isPass = false;
    }

    void addBulkExamNote(int note1 ,int note2 ,int note3 ,int note4){

        System.out.println("------"+this.name+"------");
        if( (note1 >=0 && note1 <= 100) && (note2 >=0 && note2 <= 100) ){
            this.c1.Vnote = note1;
            this.c1.Fnote = note1;
        }
        if( (note3 >=0 && note3 <= 100) && (note4 >=0 && note4 <= 100) ){
            this.c2.Vnote = note3;
            this.c2.Fnote = note4;
        }

    }

    void isPassCourse(Course c, int note1,int note2){
        if ((c.prefix + c.code).equals("BIL201")){
            c.Vnote =  note1 * 0.40;
            c.Fnote =  note2 * 0.60;
            this.avarage =c.Vnote + c.Fnote  ;
            generalAvg += avarage;
        }
        if ((c.prefix + c.code).equals("EEM402")){
            c.Vnote = note1 * 0.40;
            c.Fnote = note2 * 0.60;
            this.avarage =c.Vnote + c.Fnote  ;
            generalAvg += avarage;
        }
        if ((c.prefix + c.code).equals("INM483")){
            c.Vnote = note1 * 0.45;
            c.Fnote = note2 * 0.55;
            this.avarage =c.Vnote + c.Fnote  ;
            generalAvg += avarage;
        }
        if ((c.prefix + c.code).equals("EAK207")){
            c.Vnote = note1 * 0.50;
            c.Fnote = note2 * 0.50;
            this.avarage =c.Vnote + c.Fnote  ;
            generalAvg += avarage;
        }
        if ((c.prefix + c.code).equals("EEM304")){
            c.Vnote = note1 * 0.40;
            c.Fnote = note2 * 0.60;
            this.avarage =c.Vnote + c.Fnote  ;
            generalAvg += avarage;
        }
        if ((c.prefix + c.code).equals("ENM401")){
            c.Vnote = note1 * 0.40;
            c.Fnote = note2 * 0.60;
            this.avarage =c.Vnote + c.Fnote  ;
            generalAvg += avarage;
        }

        if(this.avarage >= 50){
            System.out.println(c.name+" : Başarılı...");
            this.isPass = true;
        }
        else{
            System.out.println(c.name+" : Başarısız...");
            this.isPass = false;
        }
    }
    void isPassClass(Course c1, Course c2){
       this.generalAvg  /= 2 ;
        System.out.println(c1.name+" Vize Notu : "+c1.Vnote+" Final Notu : "+c1.Fnote);
        System.out.println(c2.name+" Vize Notu : "+c2.Vnote+" Final Notu : "+c2.Fnote);
        System.out.println("Genel Ortalama : "+this.generalAvg);

        if(this.generalAvg >= 50)
            System.out.println("Başarılı..");
        else
            System.out.println("Başarısız..");
    }
}
