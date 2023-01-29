import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args){

        int n1, n2 ,sinir ,ebob ,ekok;
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayıyı girin : ");
        n1 = scan.nextInt();
        System.out.println("İkinci sayıyı girin : ");
        n2 = scan.nextInt();

        if(n1 > n2)
            sinir = n2;
        else
            sinir = n1;

        int i = sinir;
        while(i >= 1){
            if( (n1 % i) == 0  &&  (n2 % i) == 0) {
                ebob = i;
                System.out.println("Ebob : "+ebob);
                break;
            }
            i--;
        }

        int j = 1;
        while (j <= (n1 * n2)){
            if( (j % n1) == 0  &&  (j % n2) == 0) {
                ekok = j;
                System.out.println("Ekok : "+ekok);
                break;
            }
            j++;
        }

/*
        for( int i = sinir ; i >= 1 ; i-- ){
            if( (n1 % i) == 0  &&  (n2 % i) == 0) {
                ebob = i;
                System.out.println("Ebob : "+ebob);
                break;
            }
        }



        for (int j = 1 ; j <= (n1 * n2) ; j++){
            if( (j % n1) == 0  &&  (j % n2) == 0) {
                ekok = j;
                System.out.println("Ekok : "+ekok);
                break;
            }
        } */

        // Veya bu formülü kullanabliriz ekok = (n1*n2) / ebob

    }
}
