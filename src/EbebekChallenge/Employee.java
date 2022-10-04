package EbebekChallenge;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {
        setHireYear(hireYear);
        setName(name);
        setSalary(salary);
        setWorkHours(workHours);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    public double tax(){
        double tax=0;
        if (getSalary()>1000){
          return tax=getSalary()*0.03;
        }
       else ;
       return tax;


    }
    public double bonus() {
        double bonus = 0;
        if (getWorkHours() > 40) {
            return bonus = (getWorkHours() - 40) * 30;
        }
        else return bonus;

    }
    public double raiseSalary(int hireYear){
        double raiseSsalary=0;
        if (2021-getHireYear()<10) {
            raiseSsalary=(getSalary()-tax()+bonus())*0.05;
        }
        else if (9<2021-getHireYear() && 2021-getHireYear()<20) {
            raiseSsalary = (getSalary() - tax() + bonus()) * 0.1;
        }
        else {
            raiseSsalary = (getSalary() -tax() + bonus()) * 0.15;
        }
        return raiseSsalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + "\n" +
                ", Salary=" + getSalary() +" TL \n"+
                ", Work hours of week=" + getWorkHours() +" hours \n"+
                ", Hire year=" + getHireYear() +" years \n"+
                ", Tax =" + tax() + " TL \n"+
                ", Bonus=" +bonus() +" TL \n"+
                ", Salary raise ="+ raiseSalary(hireYear)+ " TL \n" +
                ", Salary after taxes and bonuses="+(getSalary()+bonus()-tax())+" TL \n"+
                ", Total salary=" +(getSalary()+bonus()+raiseSalary(hireYear)-tax()) +" TL \n"+

                '}';
    }
}
