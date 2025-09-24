
package employeemanagementsystem;

import java.util.Scanner;

public class Employee {
   
    // The Scanner class
    Scanner in = new Scanner(System.in);
    
    // The Data members for the Employee
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String position;
    protected double salary;
    protected String department;
    protected String joiningDate;

    // The Default constructor
    public Employee() {
        this.id = 0;
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.position = "Unassigned";
        this.salary = 400;
        this.department = "Unknown";
        this.joiningDate = "Not Set";
    }

    // The Parametrized constructor
    public Employee(int id, String firstName, String lastName, String position, double salary, String department, String joiningDate) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setPosition(position);
        setSalary(salary);
        setDepartment(department);
        setJoiningDate(joiningDate);
    }

    // The Get id method
    public int getId() {
        return id;
    }

    // The Set id method
    public void setId(int id) {
        if (id > 0){
            this.id = id;
        }else{
            System.out.println("ID must be a positive number. Please try again: ");
            setId(in.nextInt());
        }
    }

    // The Get first name method
    public String getFirstName() {
        return firstName;
    }

    // The Set first name method
    public void setFirstName(String firstName) {
        if (firstName != null && firstName.matches("[a-zA-Z]+")){
            this.firstName = firstName;
        }else{
            System.out.println("First Name must be a non-empty string and containing only letters. Please try again: ");
            setFirstName(in.next());
        }
    }

    // The get last name method
    public String getLastName() {
        return lastName;
    }

    // The Set last name method
    public void setLastName(String lastName) {
        if (lastName != null && lastName.matches("[a-zA-Z]+")){
            this.lastName = lastName;
        }else{
            System.out.println("Last Name must be a non-empty string and containing only letters. Please try again: ");
            setLastName(in.next());
        }
    }

    // The Get position method
    public String getPosition() {
        return position;
    }

    // The Set position meethod
    public void setPosition(String position) {
        if (position != null){
            this.position = position;
        }else{
            System.out.println("Position cannot be empty. Please try again: ");
            setPosition(in.next());
        }
    }

    // The get salary method
    public double getSalary() {
        return salary;
    }

    // The Set salary method
    public void setSalary(double salary) {
        if (salary >= 400){
            this.salary = salary;
        }else{
            System.out.println("Salary must be at least or equal 400. Please try again: ");
            setSalary(in.nextDouble());
        }
    }
    
    // The Get department method
    public String getDepartment() {
        return department;
    }

    // The Set department method
    public void setDepartment(String department) {
        if (department != null){
            this.department = department;
        }else{
            System.out.println("Department cannot be empty. Please try again: ");
            setDepartment(in.next());
        }
    }

    // The Get joining date method
    public String getJoiningDate() {
        return joiningDate;
    }

    // The Set joining date method
    public void setJoiningDate(String joiningDate) {
        if (joiningDate != null && joiningDate.matches("\\d{4}-\\d{2}-\\d{2}")){
            this.joiningDate = joiningDate;
        }else{
            System.out.println("Invalid date format. Please try again with like format YYYY-MM-DD: ");
            setDepartment(in.next());
        } 
    }
    
    // The Get tax method
    private double getTax(){
        return (getSalary() * 0.1);
    }
    
    // The Get net tax
    public double getNetTax(){
        return (getSalary() - getTax());
    }
      
    // The Get details method
    public String getDetails(){
        String de = "";
        de += "ID: " + id;
        de += "\nFirst Name: " + firstName;
        de += "\nLast Name: " + lastName;
        de += "\nPosition: " + position;
        de += "\nSalary: " + salary;
        de += "\nDepartment: " + department;
        de += "\nJoining Date: " + joiningDate;
        return de;
    }
}
