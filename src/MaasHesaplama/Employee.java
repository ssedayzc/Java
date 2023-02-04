package MaasHesaplama;
public class Employee {
    String name;
    double salary;
    int workHours, hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear= hireYear;
    }

    double tax(){
        double tax;
        if(this.salary <= 1000){
            tax=0;
           // System.out.println("Tax : "+tax);
        }
        else{
            tax = this.salary * 0.03 ;
            //System.out.println("Tax : "+tax);
        }
        return tax;
    }

    double bonus(){
        double bonus;
        if(this.workHours >= 40){
            bonus = (this.workHours - 40) * 30 ;
           // System.out.println("Bonus : "+bonus);
        }
        else{
            bonus = 0;
           // System.out.println("Bonus : "+bonus);
        }
        return bonus;
    }

    double raiseSalary(){
        double artis ;
        if((2023 - this.hireYear) < 10){
            artis = this.salary * 0.05;
            //System.out.println("Maaş artışı : "+artis);
        }
        else if (((2023 - this.hireYear) > 9) && ((2023 - this.hireYear) < 20)){
            artis = this.salary * 0.10;
           // System.out.println("Maaş artışı : "+artis);
        }
        else {
            artis = this.salary * 0.15;
            //System.out.println("Maaş artışı : "+artis);
        }
        return artis;
    }

    public String toString(){
        return "Adı : "+this.name +"\nMaaşı : "+this.salary+
                "\nÇalışma Saati : "+this.workHours+"\nBaşlangıç Yılı : "+this.hireYear+
                "\nVergi : "+tax()+
                "\nBonus : "+bonus()+
                "\nMaaş Artışı : "+raiseSalary()+
                "\nVergi ve Bonuslar ile toplam maaş : "+(bonus()+this.salary - tax())+
                "\nToplam Maaş : "+(this.salary+bonus()+raiseSalary()-tax());
    }
}
