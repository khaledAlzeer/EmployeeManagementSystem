
package employeemanagementsystem;

import java.util.Scanner;

public class Accountant extends Employee{
    
    // The Scanner Class
    Scanner in = new Scanner(System.in);
    
    // The Data members for Accountant
    private String bankName;
    private String accountNumber;
    private int yearsOfExperience;
    

    // The Default constructor
    public Accountant() {
        super();
        // Override for the salary Data member
        this.salary = 600;
        this.bankName = "Unknown";
        this.accountNumber = "000000";
        this.yearsOfExperience = 0;
    }

    // The Parametrized constructor
    public Accountant(int id, String firstName, String lastName, String position, double salary, String department, String joiningDate, String bankName,  int yearsOfExperience, String accountNumber) {
        super(id, firstName, lastName, position, salary, department, joiningDate);
        setBankName(bankName);
        setYearsOfExperience(yearsOfExperience);
        setAccountNumber(accountNumber);
    }

    // The Get bank name method
    public String getBankName() {
        return bankName;
    }

    // The Set bank name method
    public void setBankName(String bankName) {
        if (bankName != null){
            this.bankName = bankName;
        }else{
            System.out.println("Bank Name must be non-empty. Please try again: ");
            setBankName(in.next());
        }
    }

    // The Get account number 
    public String getAccountNumber() {
        return accountNumber;
    }

    // The Set account number 
    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && accountNumber.matches("\\d{6,}")) { 
            this.accountNumber = accountNumber;
        }else{
            System.out.println("Invalid account number the account number must contain at least 6 digitor more. Please try again: ");
            setAccountNumber(in.next());
        }
    }

    // The Get years of experience
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    // The Set years of experience
    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience >= 0) { 
            this.yearsOfExperience = yearsOfExperience;
        }else{
            System.out.println("Invalid years of experience the years of experience must be at least 1. Please try again: ");
            setYearsOfExperience(in.nextInt());
        }
    }

    // The Set salaey method (override)
    @Override
    public void setSalary(double salary) {
        if (salary >= 600){
            this.salary = salary;
        }else{
            System.out.println("Salary must be at least or equal 600. Please try again: ");
            setSalary(in.nextDouble());
        }
    }
    
    // The Get tax method
    private double getTax(){
        return (getSalary() * 0.15);
    }

    // The get net tax method (override)
    @Override
    public double getNetTax() {
        return (getSalary() - getTax());
    }
    
    // The Get details method (override)
    @Override
    public String getDetails() {
        String de  = super.getDetails();
        de += "\nBank Name: " + getBankName();
        de += "\nAccount Number: " + getAccountNumber();
        de += "\n Years of experience: " + getYearsOfExperience();
        return de;
    }
}