import java.util.Scanner;

public class DonguyleUsAlma {
    public static void main(String[] args){

        int us,taban ,sonuc = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Üssü alınacak sayıyı giriniz : ");
        taban = scan.nextInt();

        System.out.println("Üs giriniz : ");
        us = scan.nextInt();

        for( int i = 1; i <= us ;i++){
            sonuc *= taban ;
        }

        System.out.println(taban+"^"+us+" : "+sonuc);

    }
}
