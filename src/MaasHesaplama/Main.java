package MaasHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String name ;
        double salary;
        int workHours, hireYear;

        Scanner scan = new Scanner(System.in);
        System.out.print("İsminiz : ");
        name = scan.nextLine();
        System.out.print("Maaşınız : ");
        salary = scan.nextDouble();
        System.out.print("Haftada kaç saat çalışıyorsunuz : ");
        workHours = scan.nextInt();
        System.out.print("İşe giriş yılınız : ");
        hireYear = scan.nextInt();

        Employee emp = new Employee(name,salary,workHours,hireYear);
        System.out.println(emp.toString());

    }
}
