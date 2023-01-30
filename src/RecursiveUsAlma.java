import java.util.Scanner;

public class RecursiveUsAlma {

    static int usAlma(int taban ,int us){
        if( us == 0 || taban == 1)
            return 1;
        else
            return taban * usAlma(taban,us - 1);
    }

    public static void main(String[] args){

        int taban,us;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen taban sayısı giriniz :");
        taban = scan.nextInt();
        System.out.print("Lütfen üs giriniz :");
        us = scan.nextInt();

        System.out.println("Sonuç : "+usAlma(taban,us));

    }
}
