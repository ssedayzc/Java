import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args){

        double fiyat, kdvTutari , kdvliFiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Fiyat :");
        fiyat = input.nextDouble();


        if( fiyat>0 && fiyat<1000){

            kdvliFiyat = fiyat + ((fiyat*18) / 100) ;
            System.out.println("Kdv'li fiyat :"+kdvliFiyat);

        }else{

            kdvliFiyat = (fiyat*8) / 100 ;
            System.out.println("Kdv'li fiyat :"+kdvliFiyat);
        }

        kdvTutari = kdvliFiyat - fiyat ;
        System.out.println("Kdv tutarı :"+kdvTutari);



    }
}
