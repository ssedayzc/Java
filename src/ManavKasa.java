import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args){

        double armut,elma ,domates, muz,patlican ;
        double tutar ;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo : ");
        armut = input.nextInt();
        armut *= 2.14;

        System.out.println("Elma kaç kilo : ");
        elma = input.nextInt();
        elma *= 3.67;

        System.out.println("Domates kaç kilo : ");
        domates = input.nextInt();
        domates *= 1.11;

        System.out.println("Muz kaç kilo : ");
        muz = input.nextInt();
        muz *= 0.95;

        System.out.println("Patlıcan kaç kilo : ");
        patlican = input.nextInt();
        patlican *= 5.00;

        tutar = armut + elma + domates + muz + patlican;
        System.out.println("Toplam Tutar : "+tutar+" TL");

    }
}
