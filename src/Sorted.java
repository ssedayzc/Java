import java.util.Arrays;
import java.util.Scanner;

public class Sorted {
    public static void main(String[] args){
        // küçükten büyüğe sıralama

        int boyut,n,min;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizi boyutu : ");
        boyut = scan.nextInt();
        int[] dizi = new int[boyut];

        for(int i =0; i< dizi.length;i++){
            System.out.println("Eleman giriniz : ");
            n= scan.nextInt();
            dizi[i] = n;
        }

        System.out.println("Sıralanmamış dizi : "+Arrays.toString(dizi));

        for(int i = 0; i < boyut; i++) {
            for(int j = i+1; j < boyut; j++) {
                if(dizi[j] < dizi[i]) {
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }

        System.out.println("Sıralı dizi : "+ Arrays.toString(dizi));







    }


}
