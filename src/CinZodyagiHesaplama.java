import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args){

        int dogumTarihi,kosul ;
        String hayvan = null;

        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz : ");
        dogumTarihi = scan.nextInt();

        kosul = dogumTarihi % 12 ;

        switch (kosul){
            case 0:{
                hayvan = "Maymun";
                break;}
            case 1:{
                hayvan = "Horoz";
                break;}
            case 2:{
                hayvan = "Köpek";
                break;}
            case 3:{
                hayvan = "Domuz";
                break;}
            case 4:{
                hayvan = "Fare";
                break;}
            case 5:{
                hayvan = "Öküz";
                break;}
            case 6:{
                hayvan = "Kaplan";
                break;}
            case 7:{
                hayvan = "Tavşan";
                break;}
            case 8:{
                hayvan = "Ejderha";
                break;}
            case 9:{
                hayvan = "Yılan";
                break;}
            case 10:{
                hayvan = "At";
                break;}
            case 11:{
                hayvan = "Koyun";
                break;}
        }
        System.out.println("Çin zodyağı : "+hayvan);
    }
}
