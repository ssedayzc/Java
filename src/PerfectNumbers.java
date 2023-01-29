import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args){

        int n ,toplam=0 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        n = scan.nextInt();

        for(int i =1; i<n ; i++){
            if (n % i == 0)
                toplam += i ;
        }

        if(toplam == n)
            System.out.println(n+" bir mükemmel sayıdır.");
        else
            System.out.println(n+" bir mükemmel sayı değildir.");
    }
}
