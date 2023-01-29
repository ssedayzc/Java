import java.util.Scanner;

public class Kombinasyon {
    public static long fact (int n){
        if(n < 0){
            return -1;}
        long sonuc = 1;
        for( int i =0; i<n ; i++){
            sonuc *= i + 1;
        }
        return sonuc;
    }

    public static long permutasyon(int n,int r){
        return fact(n) / fact (n -r);
    }

    public static long kombinasyon(int n, int r){
        return permutasyon(n,r) / fact(r);
    }
    public static void main(String[] args){

        int n,r;
        Scanner scan = new Scanner(System.in);
        System.out.print("n : ");
        n = scan.nextInt();
        System.out.println("r : ");
        r = scan.nextInt();

        System.out.println("C("+n+","+r+") : "+kombinasyon(n,r));


    }
}
