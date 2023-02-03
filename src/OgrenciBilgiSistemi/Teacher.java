package OgrenciBilgiSistemi;

public class Teacher {
    String name, mpno, branch ;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void print() {
        System.out.println("Adı : "+this.name);
        System.out.println("Telefon : "+this.mpno);
        System.out.println("Bölümü : "+this.branch);
        System.out.println();
    }
}
