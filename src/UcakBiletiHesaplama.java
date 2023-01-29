import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args){

        int mesafe,yas,yolculukTipi ;
        double normalTutar, yasIndirimi = 0, indirimliTutar,gidişDonusIndirimi,total = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Mesafeyi giriniz : ");
        mesafe = scan.nextInt();
        if( !(mesafe > 0))
            System.out.println("Hatalı Veri Girdiniz !");


        System.out.println("Yaşınızı giriniz : ");
        yas = scan.nextInt();
        if( !(yas > 0))
            System.out.println("Hatalı Veri Girdiniz !");



        System.out.println("Yolculuk tipini giriniz :\n1-Tek Yön\n2-Gidiş-Dönüş");
        yolculukTipi = scan.nextInt();
        if( !(yolculukTipi == 1 || yolculukTipi == 2))
            System.out.println("Hatalı Veri Girdiniz !");

        switch (yolculukTipi){
            case 1 :{
                normalTutar = mesafe * 0.10;
                if(yas < 12)
                    yasIndirimi =normalTutar * 0.50 ;
                else if ( yas >= 12 && yas <= 24 )
                    yasIndirimi = normalTutar * 0.10;
                else if ( yas >= 65)
                    yasIndirimi = normalTutar * 0.30;

                indirimliTutar = normalTutar - yasIndirimi;

                total = indirimliTutar;

                break;
            }
            case 2 :{
                normalTutar = mesafe * 0.10;
                if(yas < 12)
                    yasIndirimi =normalTutar * 0.50 ;
                else if ( yas >= 12 && yas <= 24 )
                    yasIndirimi = normalTutar * 0.10;
                else if ( yas >= 65)
                    yasIndirimi = normalTutar * 0.30;

                indirimliTutar = normalTutar - yasIndirimi;
                gidişDonusIndirimi = indirimliTutar * 0.20;
                total =  (indirimliTutar - gidişDonusIndirimi) * 2;


                break;
            }
        }

        System.out.println("Toplam Tutar : "+total+" TL");





    }
}
