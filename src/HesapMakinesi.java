import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args ){

        int n1, n2 ,secim = 0;
        double sonuc ;
        boolean flag = true;

        Scanner input = new Scanner(System.in);

        while(flag ) {
            System.out.println("*********İşlemi seçiniz*********\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5- Çıkış");
            secim = input.nextInt();


            switch (secim) {
                case 1: {
                    System.out.println("İlk sayıyı giriniz : ");
                    n1 = input.nextInt();
                    System.out.println("İkinci sayıyı giriniz : ");
                    n2 = input.nextInt();
                    sonuc = n1 + n2;
                    System.out.println("Toplam = " + sonuc);
                    break;
                }
                case 2: {
                    System.out.println("İlk sayıyı giriniz : ");
                    n1 = input.nextInt();
                    System.out.println("İkinci sayıyı giriniz : ");
                    n2 = input.nextInt();
                    sonuc = n1 - n2;
                    System.out.println("Fark = " + sonuc);
                    break;
                }
                case 3: {
                    System.out.println("İlk sayıyı giriniz : ");
                    n1 = input.nextInt();
                    System.out.println("İkinci sayıyı giriniz : ");
                    n2 = input.nextInt();
                    sonuc = n1 * n2;
                    System.out.println("Çarpım = " + sonuc);
                    break;
                }
                case 4: {
                    System.out.println("İlk sayıyı giriniz : ");
                    n1 = input.nextInt();
                    System.out.println("İkinci sayıyı giriniz : ");
                    n2 = input.nextInt();
                    sonuc = n1 / n2;
                    System.out.println("Bölüm = " + sonuc);
                    break;

                }
                case 5: {
                    System.out.println("Çıkış yapıldı..");
                    flag = false;
                    break;
                }
            }
        }


    }
}
