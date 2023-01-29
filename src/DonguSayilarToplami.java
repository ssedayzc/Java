import java.util.Scanner;

public class DonguSayilarToplami {
    public static void main(String[] args){

        int n = 0,toplam=0;
        Scanner scan = new Scanner(System.in);


        while((n % 2) ==0){
            n= scan.nextInt();

            if ((n % 4) == 0)
                toplam += n ;
        }

        System.out.println("Toplam : "+toplam);
    }
}
