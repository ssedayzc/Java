package BoksingMatch;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("----1. oyuncunun bilgilerini giriniz----\nName : \nDamage : \nWeight : \nDodge : ");
        String name1= scan1.nextLine();
        int damage1= scan1.nextInt();
        int weight1 = scan1.nextInt();
        double dodge1 = scan1.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("----2. oyuncunun bilgilerini giriniz----\nName : \nDamage : \nWeight : \nDodge : ");
        String name2= scan2.nextLine();
        int damage2 = scan2.nextInt();
        int weight2 = scan2.nextInt();
        double dodge2 = scan2.nextDouble();

        Fighter f1 = new Fighter(name1 , damage1, weight1,dodge1);
        Fighter f2 = new Fighter(name2 ,damage2 , weight2, dodge2);


        Random rand = new Random();
        int secim = (int) (rand.nextInt(3) + 1) ;
        Ring r;
        if(secim == 1){
            r = new Ring(f1, f2, 90, 100);
        }
        else{
            r = new Ring(f2, f1, 90, 100);
        }
        r.run();
    }
}
