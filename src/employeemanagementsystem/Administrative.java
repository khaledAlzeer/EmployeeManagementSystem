
package employeemanagementsystem;

import java.util.Scanner;

public class Administrative extends Employee{
    
    // The Scanner Class
    Scanner in = new Scanner(System.in);
    
    // // The Data members Administrative
    private String managementLevel; // SeniorManager, ExecutiveDirector, DepartmentManager
    private int numberOfProjects;
    private int yearsOfExperience;

    // The Default constructor
    public Administrative() {
        super();
        // Override for the salary Data member
        this.salary = 1000;
        this.managementLevel = "Undefined";
        this.numberOfProjects = 0;
        this.yearsOfExperience = 0;
    }

    // The Parametrized constructor
    public Administrative(int id, String firstName, String lastName, String position, double salary, String department, String joiningDate, String managementLevel, int numberOfProjects, int yearsOfExperience) {
        super(id, firstName, lastName, position, salary, department, joiningDate);
        setManagementLevel(managementLevel);
        setNumberOfProjects(numberOfProjects);
        setYearsOfExperience(yearsOfExperience);
    }

    // The Get management level method
    public String getManagementLevel() {
        return managementLevel;
    }

    // The Set management level method
    public void setManagementLevel(String managementLevel) {
        if (managementLevel.equalsIgnoreCase("SeniorManager") || managementLevel.equalsIgnoreCase("ExecutiveDirector") || managementLevel.equalsIgnoreCase("DepartmentManager") || managementLevel != null){
            this.managementLevel = managementLevel;
        }else{
            System.out.println("Management Levet must be between (SeniorManager, ExecutiveDirector, DepartmentManager) and non-empty string. Please try again: ");
            setManagementLevel(in.next());
        }
    }

    // The Get number of projects method
    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    // // The Set number of projects method
    public void setNumberOfProjects(int numberOfProjects) {
        if (numberOfProjects >= 0){
            this.numberOfProjects = numberOfProjects;
        }else{
            System.out.println("Number of projects cannot be negative. Please try again: ");
            setNumberOfProjects(in.nextInt());
        }
    }

    // The Get years of experience
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    // The Set years of experience
    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience >= 0){
            this.yearsOfExperience = yearsOfExperience;
        }else{
            System.out.println("Invalid years of experience the years of experience must be at least 0. Please try again: ");
            setYearsOfExperience(in.nextInt());
        } 
    }

    // The Set salary method 
    @Override
    public void setSalary(double salary) {
        if (salary >= 1000){
            this.salary = salary;
        }else{ 
            System.out.println("Salary must be at least or equal 1000. Please try again : ");
        }
    }
    
    // The Get tax method
    private double getTax(){
        return (getSalary() * 0.25);
    }

    // The Get net tax salary (override)
    @Override
    public double getNetTax() {
        return (getSalary() - getTax());
    }

    // The Get details method (override)
    @Override
    public String getDetails() {
       String de = super.getDetails();
       de += "\nManagement Level: " + getManagementLevel();
       de += "\nNumber Of Projects: " + getNumberOfProjects();
       de += "\nYears Of Experience: " + getYearsOfExperience();
       return de;
    }
}