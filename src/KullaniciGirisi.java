import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args){
        String name = "admin";
        String password = "1234";

        String userName,userPassword ,degisiklik;
        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz : ");
        userName = scan.nextLine();

        System.out.println("Şifrenizi giriniz : ");
        userPassword = scan.nextLine();

        if(userName.equals(name)  ){

            if(password.equals(userPassword.toLowerCase()))    // kullanıcı adı doğru,şifre doğru
                System.out.println("HOŞGELDİNİZ..");

            else{                                              // kullanıcı adı doğru,şifre yanlış
                System.out.println("Şifreniz yanlış, değiştirmek ister misiniz ?");
                degisiklik = scan.nextLine();

                if(degisiklik.toLowerCase().equals("evet")){

                    while(userPassword.toLowerCase() != password){
                        System.out.println("Yeni şifre giriniz : ");
                        userPassword = scan.nextLine();

                        if(userPassword.toLowerCase().equals(password))
                            System.out.println("Yeni şifre eskisi ile aynı olamaz..");

                        else System.out.println("Şifre oluşturuldu..");
                        password = userPassword ;
                        break;
                    }
                }

            }

        }


        else if ( !(userName.equals(name))){

            if(password.equals(userPassword.toLowerCase()))              // kullanıcı adı yanlış şifre doğru
                System.out.println("Kullanıcı adınız yanlış..");

            else{                                                        // kullanıcı adı yanlış şifre yanlış
                System.out.println("Kullanıcı adınız ve şifreniz yanlış, yeniden deneyin..");

                System.out.println("Kullanıcı adınızı giriniz : ");
                userName = scan.nextLine();

                System.out.println("Şifrenizi giriniz : ");
                userPassword = scan.nextLine();

            }


        }

    }
}
