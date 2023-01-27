import java.util.Scanner;

public class NotOrtalamasıHesaplama {
  public static void main(String[] args){

        int mat,fizik,kimya,turkce,tarih,muzik;
        double sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        mat = input.nextInt();

        System.out.print("Fizik notunuz :");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz :");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz :");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz :");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz :");
        muzik = input.nextInt();

        sonuc = (mat + fizik + kimya + turkce + tarih + muzik)/6 ;

        System.out.println("Ortalamanız : "+sonuc);

        while(sonuc >= 60){
            System.out.println("Sınıfı geçtiniz..");
            break;
        }

        while(sonuc < 60){
            System.out.println("Sınıfta kaldınız..");
            break;
        }







    }
}
