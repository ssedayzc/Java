import java.util.Scanner;

public class RecursiveDesen {

    
    static void recDesen(int sayi){
        final int start = sayi ;

        if(sayi <= 0){
            if(sayi == start)
                System.out.print(sayi+",");
            else {

                System.out.print((sayi + 5 )+",");
                recDesen(sayi + 5);
            }
        }
        else{
             System.out.print(sayi+",");
             recDesen(sayi - 5);
        }

    };

    public static void main(String[] args) {

        int  sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        sayi = scan.nextInt();

        recDesen(sayi);

    }
}
