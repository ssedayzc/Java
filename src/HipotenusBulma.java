import java.util.Scanner;

/**
 * Üçgenin kenarları a,b ve c olsun
 * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
 * 𝑢 = (a+b+c) / 2
 * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 * */

public class HipotenusBulma {
    public static void main(String[] args){

        int a,b,c,u;
        double alan;
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin ilk (a) kenarını giriniz : ");
        a = input.nextInt();

        System.out.print("Üçgenin ikinci (b) kenarını giriniz : ");
        b = input.nextInt();

         c = (int) Math.sqrt((a*a) + (b*b));

        System.out.println("Üçgenin hipotenüsü (c) : "+c);

        u = (a + b+ c)/2 ;
        alan = Math.sqrt(u * (u - a)* (u - b) * (u - c)) ;

        System.out.println("Üçgenin alanı : "+alan);











    }
}
