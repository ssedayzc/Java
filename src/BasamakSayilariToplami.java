import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args){

        int n , temp,basamak ,sayac = 0,toplam = 0 ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        n = scan.nextInt();

        temp = n;

        do{
            if((temp > 10))
                basamak = temp % 10 ;
            else
                basamak = temp ;
            toplam += basamak;
            sayac++ ;
            temp = temp / 10 ;

        }while ( temp != 0  );

        System.out.println("Girilen sayı "+sayac+" basamaklıdır.\nBasamakları toplamı "+toplam+" 'dır.");
    }
}
