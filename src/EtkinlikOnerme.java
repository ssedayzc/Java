import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args){

        int sicaklik;

        Scanner scan = new Scanner(System.in);
        System.out.println("Hava sıcaklığı kaç derecedir? ");
        sicaklik= scan.nextInt();

        if (sicaklik < 5)
            System.out.println("Kayak yapabilirsiniz.");

        if (5 <= sicaklik && sicaklik <= 15)
            System.out.println("Sinemaya gidebilirsiniz.");

        if ( 15 <= sicaklik && sicaklik <= 25)
            System.out.println("Piknik yapabilirsiniz.");

        if ( 25 < sicaklik )
            System.out.println("Yüzmeye gidebilirsiniz.");
    }
}
