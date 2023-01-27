import java.util.Scanner;

public class DaireninAlanıVeCevresi {
    public static void main(String[] args){
        double r,alan,cevre,aci,dilimAlani;
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçapı giriniz : ");
        r = input.nextDouble();

        System.out.println("Merkez açı ölçüsünü giriniz : ");
        aci = input.nextDouble();

        cevre = 2 * PI * r ;
        alan = PI * (r * r) ;
        dilimAlani = ( PI * (r*r) * aci) / 360 ;

        System.out.println("Dairenin çevresi: "+cevre);
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin diliminin alanı : "+dilimAlani);






    }
}
