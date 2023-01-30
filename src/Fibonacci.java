import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n){
        if ( n == 1 || n == 2)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Fibonacci serisinin eleman sayısını giriniz : ");
        int n = scan.nextInt();

        int[] series = new int[n];
        series[0] = 0;
        series[1] = 1;


        for (int i = 2; i<n ;i++){
            series[i] = series[i-1] + series[i-2];
        }

        for (int j=0; j<n ;j++){
            System.out.print(series[j]+" ");
        }
        System.out.println();
        System.out.println("-----Recursive Çözüm-----");
        System.out.println(n+". eleman : "+Fibonacci.fib(n - 1));

    }
}
