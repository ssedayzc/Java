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


        // Liste elemanlarının harmonik serileri
        toplam =0;
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        double harmonikSeri=0;
        for (int i = 0; i < numbers.length; i++) {
            for (double j = 1; j <= i ; j++){
                toplam += (1 / i);
            }
            sum += numbers[i];
            harmonikSeri += toplam;
        }

        System.out.println("Elamanların ortalaması : "+sum / numbers.length);
        System.out.println("Elemanların harmonik ortalaması : "+ numbers.length / harmonikSeri);


    }
}
