import java.util.Scanner;

public class PalindromSayi {

    public static boolean isPalindrom(int sayi){
        int temp = sayi,tersSayi = 0 ,basamak ;

        while( temp != 0){
            System.out.println("============");
            System.out.println("Sayı ----> "+temp);

            basamak = temp % 10;
            System.out.println("Son basamak ----> "+basamak);

            tersSayi = (tersSayi * 10) + basamak ;
            System.out.println("Yeni sayı ----> "+tersSayi);
            temp /= 10 ;
        }
        if(sayi == tersSayi){
            System.out.println(sayi+" bir palindrom sayıdır.");
            return true;
        }
        else{
            System.out.println(sayi+" bir palindrom sayı değildir.");
            return false;}
    }

    public static void main(String [] args){
         int sayi;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        sayi = scan.nextInt();

        PalindromSayi.isPalindrom(sayi);





    }
}
