import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args){

        int n;
        double toplam = 0.0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        n = scan.nextInt();

        for (double i = 1; i <= n ; i++){
            toplam += (1 / i);
        }

        System.out.println("Harmonik Toplam : "+toplam);
    }
}
