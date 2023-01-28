import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class NotOrtalamasıHesaplama {
  public static void main(String[] args){

      Map<String,Integer> dersler = new HashMap<>();


        double sonuc = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        dersler.put("mat",input.nextInt());

        System.out.print("Fizik notunuz :");
        dersler.put("fizik",input.nextInt());

        System.out.print("Kimya notunuz :");
        dersler.put("kimya",input.nextInt());

        System.out.print("Türkçe notunuz :");
        dersler.put("türkce",input.nextInt());

        System.out.print("Tarih notunuz :");
        dersler.put("tarih",input.nextInt());

        System.out.print("Müzik notunuz :");
        dersler.put("müzik",input.nextInt());


        for( Integer i : dersler.values()){

          if(0 <= i && i <= 100){
            sonuc += i ;
          }

        }


         sonuc = sonuc/6 ;

        System.out.println("Ortalamanız : "+sonuc);

        if(sonuc >= 55){
            System.out.println("Sınıfı geçtiniz..");

        }

        else{
            System.out.println("Sınıfta kaldınız..");

        }







    }
}
