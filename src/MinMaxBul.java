import java.util.Scanner;

public class MinMaxBul {
    public static void main(String[] args){

        int n,sayi ,max=0 ,min =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz : ");
        n = scan.nextInt();



        for(int i = 1 ; i <= n ; i++){

            System.out.println("Sayıyı girin : ");
            sayi = scan.nextInt();

            if( sayi > max)
                max = sayi ;
            else
                min = sayi;
        }
        System.out.println("MAX : "+max);
        System.out.println("MIN : "+min);

    }
}
