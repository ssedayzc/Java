import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){

        int n ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Fibonacci serisinin eleman sayısını giriniz : ");
        n = scan.nextInt();

        int[] series = new int[n];
        series[0] = 0;
        series[1] = 1;


        for (int i = 2; i<n ;i++){
            series[i] = series[i-1] + series[i-2];
        }

        for (int j=0; j<n ;j++){
            System.out.print(series[j]+" ");
        }
    }
}
