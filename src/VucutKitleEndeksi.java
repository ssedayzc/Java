import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args){

        double boy,kilo ,sonuc;
        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu metre cinsinden giriniz : ");
        boy = input.nextDouble();

        System.out.println("Kilonuzu kg cinsinden giriniz : ");
        kilo = input.nextDouble();

        sonuc =  kilo / (boy * boy) ;

        System.out.println("Vücut kitle endeksiniz : "+sonuc);

        if ( sonuc <= 18.46)
            System.out.println("İdeal kilonun altındasınız..");
        else if (sonuc >= 18.5 && sonuc <= 24.49)
            System.out.println("İdeal kilodasınız..");
        else if ( sonuc >= 25 && sonuc <= 29.99)
            System.out.println("İdeal kilonun biraz üzerindesiniz..");
        else if ( sonuc >= 30 )
            System.out.println("Obezitesiniz,bir hekimden yardım almalısınız..");


    }
}
