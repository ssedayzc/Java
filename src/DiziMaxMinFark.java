import java.util.Arrays;
import java.util.Scanner;

public class DiziMaxMinFark {
    public static void main(String[] args) {

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int n ,nearestMin=0,nearestMax=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        n = scan.nextInt();
        System.out.println("Girilen sayı : "+n);
        int[] farklar = new int[list.length];

        for(int i = 0 ; i < list.length ; i++){
            farklar[i] = list[i] - n ;
            }

        System.out.println("Farklar : "+ Arrays.toString(farklar));

        int j=0;
        while(j < list.length){
            if(farklar[j] >= 0) {
                if (farklar[j] >= nearestMax)
                    nearestMax = farklar[j];

                //else nearestMin = farklar[j];
            }
            else {
                    if ((farklar[j] * -1) <= nearestMin)
                        nearestMin = farklar[j] * -1 ;
                    //else nearestMin = nearestMin;



                }



            j++;
            }




        System.out.println("max "+nearestMax);
        System.out.println("min" +nearestMin);

        }


}


