import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args){

        int n ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        n = scan.nextInt();

        for (int i = n-1; i >= 0  ; i--) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
