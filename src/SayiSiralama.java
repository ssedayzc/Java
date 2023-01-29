import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args){

        int ilk,iki,uc ;
        int max=0,mid=0,min =0;
        Scanner scan= new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz : ");
        ilk = scan.nextInt();

        System.out.println("İkinci sayıyı giriniz : ");
        iki = scan.nextInt();

        System.out.println("Üçüncü sayıyı giriniz : ");
        uc = scan.nextInt();

       if ( ilk > iki && ilk > uc){
           max = ilk;

           if (iki > uc) {
               mid = iki;
               min = uc;
           }
           else{
               mid = uc;
               min= iki;
           }


       }else if (ilk < iki && ilk < uc){
           min = ilk;

           if (iki > uc) {
               max = iki;
               mid = uc;
           }
           else{
               max = uc;
               mid= iki;
           }

       }

        System.out.println("Sıralamadan önce : "+ilk+"-"+iki+"-"+uc);
        System.out.println("Sıralamadan sonra : "+min+"-"+mid+"-"+max);


    }
}
