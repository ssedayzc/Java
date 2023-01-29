import java.util.Scanner;

public class SayiyaKadarUsler {
    public static void main(String[] args) {

        int n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        n = scan.nextInt();

        for (int i = 0; i<n ; i++){

            if( (Math.pow(4,i)) < n);
            System.out.println("4^"+i+" : "+(Math.pow(4,i)));

            if( (Math.pow(5,i)) < n);
            System.out.println("5^"+i+" : "+(Math.pow(5,i)));

        }

    }
}