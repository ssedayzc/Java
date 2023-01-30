import java.util.Scanner;

public class AsalmiRec {

    public static boolean asalMi(int sayi, int i) {
        if (sayi <= 1) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (sayi % i == 0) {
            return false;
        }
        return asalMi(sayi, i - 1);
    }

    public static void main(String[] args) {

        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        sayi = scan.nextInt();
        int i = sayi / 2;

        if (asalMi(sayi, i)) {
            System.out.println(sayi + " asal sayıdır .");
        } else {
            System.out.println(sayi + " asal değildir.");
        }


    }
}
