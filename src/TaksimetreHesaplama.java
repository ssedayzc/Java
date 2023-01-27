import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args){
        double tutar = 10;
        int km;
        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz : ");
        km = input.nextInt();

        tutar+= km * 2.20;

        if(tutar<20)
            tutar = 20 ;

        System.out.println("Tutar : "+tutar);


    }
}
