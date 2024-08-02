package entities;

public class Employee {
    public String name;
    public double GrossSalary;
    public double tax;

    public Employee(){

    }


    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        GrossSalary = grossSalary;
        this.tax = tax;
    }

    public double NetSalary(){
        return GrossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        GrossSalary += GrossSalary * percentage / 100;
    }

    @Override
    public String toString() {
        return ( name + " $ " + String.format("%.2f",NetSalary()));
    }
}
