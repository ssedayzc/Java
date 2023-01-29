import java.util.Scanner;

public class CiftleriYazdir {
    public static void main(String[] args){

        int n ,sayac = 0,ort =0;
        System.out.println("Sayıyı giriniz : ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for(int i =0; i<n ;i++){
            if((i % 2) == 0)
                System.out.print(i+",");

            if( ((i%3)==0) && ((i%4)==0)){
                ort += i;
                sayac++;
            }


        }

        System.out.println("\nOrtalama : "+ort/sayac);
    }
}
