
package employeemanagementsystem;

import java.util.Scanner;


public class Marketing extends Employee{
    
    // The Scanner Class
    Scanner in = new Scanner(System.in);
    
    // The Data members for Accountant
    protected int actualSales;
    protected double commissionRate;
    protected String region;

    // The Default constructor
    public Marketing() {
        super();
        // Override for the salary Data member
        this.salary = 800;
        this.actualSales = 0;
        this.commissionRate = 0.0;
        this.region = "Not Assigned";
    }

    // The Parametrized constructor
    public Marketing(int id, String firstName, String lastName, String position, double salary, String department, String joiningDate, int actualSales, double commissionRate, String region) {
        super(id, firstName, lastName, position, salary, department, joiningDate);
        setActualSales(actualSales);
        setCommissionRate(commissionRate);
        setRegion(region);
    } 

    // The Get actual sales method
    public double getActualSales() {
        return actualSales;
    }

    // The Set actual sales method
    public void setActualSales(int actualSales) {
        if (actualSales >= 0) { 
            this.actualSales = actualSales;
        }else{
            System.out.println("Invalid actual sales the actual sales must be at least or equal 0. Please etry again: ");
            setActualSales(in.nextInt());
        }
    }

    // The Get commission rate method
    public double getCommissionRate() {
        return commissionRate;
    }

    // The Set commission rate method
    public void setCommissionRate(double commissionRate) {
        if (commissionRate >= 0 && commissionRate <= 100) { 
            this.commissionRate = commissionRate;
        }else{
            System.out.println("Invalid commission rate it must be between 0 and 100. Please try again: ");
            setCommissionRate(in.nextDouble());
        }
    }

    // The Get region method
    public String getRegion() {
        return region;
    }

    // The Set region method
    public void setRegion(String region) {
        if (region != null) { // Ensure the region is not null or empty
            this.region = region.trim(); // Remove leading/trailing spaces
        }else{
            System.out.println("Invalid region. It must be non-empty. Please try again: ");
            setRegion(in.next());
        }
    }

    // The Set salary method (override)
    @Override
    public void setSalary(double salary) {
        if (salary >= 800){
            this.salary = salary;
        }else{
            System.out.println("Salary must be at least or equal 800. Please try again : ");
            setSalary(in.nextDouble());
        }
    }

    // The Get tax method
    private double getTax(){
        return (getSalary() * 0.2);
    }
    
    // The get net tax method (override)
    @Override    
    public double getNetTax() {
        return (getSalary() - getTax());
    }    

    // The Get salary aftre commission method
    public double getSalaryAftreCommission(){
        return (getSalary() + (getActualSales() * (getCommissionRate()/100)));
    }
    
    // The Get details method (override)
    @Override
    public String getDetails() {
        String de = super.getDetails();
        de += "\nActual Sales: " + getActualSales();
        de += "\nCommission Rate: " + getCommissionRate();
        de += "\nRegion: " + getRegion();
        return de;
    }    
}