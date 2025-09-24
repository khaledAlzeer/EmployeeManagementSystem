
package employeemanagementsystem;

import java.util.Scanner;

public class Main {
    
    // The Scanner Class
    static Scanner in = new Scanner (System.in);
    
    // The Display welcome massage method
    public static void displayWelcomeMessage(){
        System.out.println("==============================================");
        System.out.println("Welcome to the syetem that manages employees");
        System.out.println("==============================================");
    }
    
    // The General draw menu method
    public static void drawMenu(){
        System.out.println("Select what do you want to do: ");
        System.out.println("1- Add new Employee.");
        System.out.println("2- Display the number of General Employees in company.");
        System.out.println("3- Display the number of Accountant Employees in company.");
        System.out.println("4- Display the number of Marketing Employees in company.");
        System.out.println("5- Dispaly the number of Administrative Employees in comapny.");
        System.out.println("6- Display the number of All Employees in Comapny.");
        System.out.println("7- Print the details Employees by department.");
        System.out.println("8- Print the details for all Employees in company.");
        System.out.println("9- Change Company details.");
        System.out.println("10- Print Company details.");
        System.out.println("0- Exist from the System.");
        System.out.println("Please enter Your choice: ");
    }
    
    // The Drwa add menu method
    public static void drawAddMenu(){
        System.out.println("Choose the type of employee you want to add: ");
        System.out.println("1- General Employee.");
        System.out.println("2- Accountant Employee.");
        System.out.println("3- Marketing Employee.");
        System.out.println("4- Administrative Employee.");
        System.out.println("Please enter employee type: ");
    }
    
    // The Add new employee method
    public static void addNewEmployee(Company C, int addChoice){
        switch(addChoice){
            case 1:
                System.out.println("===== Add a General Employee =====");
                Employee e = new Employee();
                System.out.println("Please enter the First Name: ");
                e.setFirstName(in.next());
                System.out.println("Please enter the Last Name: ");
                e.setLastName(in.next());
                System.out.println("Please enter the ID: ");
                e.setId(in.nextInt());
                System.out.println("Please enter the Position: ");
                e.setPosition(in.next());
                System.out.println("Please enter the salary: ");
                e.setSalary(in.nextDouble());
                System.out.println("Please enter the Departmen: ");
                e.setDepartment(in.next());
                System.out.println("Please enter the Joining Date as this format 'YYYY-MM-DD': ");
                e.setJoiningDate(in.next());
                C.employees.add(e);
                C.numberOfGeneralEmplyees++;
                System.out.println("=== The Employee is added! ===\n");
            break;
            case 2:
                System.out.println("===== Add a Accountant Employee =====");
                Accountant ac = new Accountant();
                System.out.println("Please enter the First Name: ");
                ac.setFirstName(in.next());
                System.out.println("Please enter the Last Name: ");
                ac.setLastName(in.next());
                System.out.println("Please enter the ID: ");
                ac.setId(in.nextInt());
                System.out.println("Please enter the Position: ");
                ac.setPosition(in.next());
                System.out.println("Please enter the salary: ");
                ac.setSalary(in.nextDouble());
                System.out.println("Please enter the Departmen: ");
                ac.setDepartment(in.next());
                System.out.println("Please enter the Joining Date as this format 'YYYY-MM-DD': ");
                ac.setJoiningDate(in.next());
                System.out.println("Please enter the Bame of the Bank where the accountant works: ");
                ac.setBankName(in.next());
                System.out.println("Please enter the Account Number managed by the accountant: ");
                ac.setAccountNumber(in.next());
                System.out.println("Please enter the Number of the Year of Experience the accountant has: ");
                ac.setYearsOfExperience(in.nextInt());
                C.accountants.add(ac);
                C.numberOfAccountants++;
                System.out.println("=== The Accountant is added! ===\n");
            break;
            case 3:
                System.out.println("===== Add a Marketing Employee =====");
                Marketing m = new Marketing();
                System.out.println("Please enter the First Name: ");
                m.setFirstName(in.next());
                System.out.println("Please enter the Last Name: ");
                m.setLastName(in.next());
                System.out.println("Please enter the ID: ");
                m.setId(in.nextInt());
                System.out.println("Please enter the Position: ");
                m.setPosition(in.next());
                System.out.println("Please enter the salary: ");
                m.setSalary(in.nextDouble());
                System.out.println("Please enter the Departmen: ");
                m.setDepartment(in.next());
                System.out.println("Please enter the Joining Date as this format 'YYYY-MM-DD': ");
                m.setJoiningDate(in.next());
                System.out.println("Please enter the number of Actual Aales made by the marketing: ");
                m.setActualSales(in.nextInt());
                System.out.println("Please enter the Commission Rate for the marketing: ");
                m.setCommissionRate(in.nextDouble());
                System.out.println("Please the Region area where the marketing works: ");
                m.setRegion(in.next());
                C.marketings.add(m);
                C.numberOfMarketings ++;
                System.out.println("=== The Marketing is added! ===\n");
            break;
            case 4:
                System.out.println("===== Add Administrative Employee =====");
                Administrative ad = new Administrative();
                System.out.println("Please enter the First Name: ");
                ad.setFirstName(in.next());
                System.out.println("Please enter the Last Name: ");
                ad.setLastName(in.next());
                System.out.println("Please enter the ID: ");
                ad.setId(in.nextInt());
                System.out.println("Please enter the Position: ");
                ad.setPosition(in.next());
                System.out.println("Please enter the salary: ");
                ad.setSalary(in.nextDouble());
                System.out.println("Please enter the Departmen: ");
                ad.setDepartment(in.next());
                System.out.println("Please enter the Joining Date as this format 'YYYY-MM-DD': ");
                ad.setJoiningDate(in.next());
                System.out.println("Please enter the Management Level for the administrative as 'SeniorManager' or 'ExecutiveDirector' or 'DepartmentManager': ");
                ad.setManagementLevel(in.next());
                System.out.println("Please enter the Number of Projects the manager manages: ");
                ad.setNumberOfProjects(in.nextInt());
                System.out.println("Please enter the Number of the Year of Experience the administraticet has: ");
                ad.setYearsOfExperience(in.nextInt());
                C.administratives.add(ad);
                C.numberOfAdministratives++;
                System.out.println("=== The Administrative is added! ===\n");
            break;
        }
    }
    
    // The Draw print menu method
    public static void drawPrintMenu(){
        System.out.println("Choice the type of employees you want to print his details: ");
        System.out.println("1- General Employees.");
        System.out.println("2- Accountant Employees.");
        System.out.println("3- Marketing Employees.");
        System.out.println("4- Administrative Employees.");
        System.out.println("Please enter employee type: ");
    }
    
    // The Get print table header method
   public static void getPrintTableHeader(){
       System.out.printf("%-15s%-15s%15s%15s%15s%n","FName", "LName", "ID", "Salary", "NetSalay");
   }
   
    // The Print details by dept method
    public static void  printDetailsByDept(Company C, int printChoice){
        switch(printChoice){
            case 1:
                System.out.println("===== Details for the General Employees =====");
                getPrintTableHeader();
                for (int i=0 ; i<C.employees.size() ; i++) {
                    System.out.printf("%-15s", C.employees.get(i).getFirstName());
                    System.out.printf("%-15s", C.employees.get(i).getLastName());
                    System.out.printf("%15d", C.employees.get(i).getId());
                    System.out.printf("%15.2f", C.employees.get(i).getSalary());
                    System.out.printf("%15.2f", C.employees.get(i).getNetTax());
                }
                System.out.println("\n");
            break;
            case 2:
                System.out.println("===== Details for the Accountant Employees =====");
                getPrintTableHeader();
                for (int i=0 ; i<C.accountants.size() ; i++) {
                    System.out.printf("%-15s", C.accountants.get(i).getFirstName());
                    System.out.printf("%-15s", C.accountants.get(i).getLastName());
                    System.out.printf("%15d", C.accountants.get(i).getId());
                    System.out.printf("%15.2f", C.accountants.get(i).getSalary());
                    System.out.printf("%15.2f", C.accountants.get(i).getNetTax());
                }
                System.out.println("\n");
            break;
            case 3:
                System.out.println("===== Details for the Marketing Employees =====");
                getPrintTableHeader();
                for (int i=0 ; i<C.marketings.size() ; i++) {   
                    System.out.printf("%-15s", C.marketings.get(i).getFirstName());
                    System.out.printf("%-15s", C.marketings.get(i).getLastName());
                    System.out.printf("%15d", C.marketings.get(i).getId());
                    System.out.printf("%15.2f", C.marketings.get(i).getSalary());
                    System.out.printf("%15.2f", C.marketings.get(i).getNetTax());
                }
                System.out.println("\n");
            break;
            case 4:
                System.out.println("===== Details for the Administrative Employees =====");
                getPrintTableHeader();
                for (int i=0 ; i<C.administratives.size() ; i++) {   
                    System.out.printf("%-15s", C.administratives.get(i).getFirstName());
                    System.out.printf("%-15s", C.administratives.get(i).getLastName());
                    System.out.printf("%15d", C.administratives.get(i).getId());
                    System.out.printf("%15.2f", C.administratives.get(i).getSalary());
                    System.out.printf("%15.2f", C.administratives.get(i).getNetTax());
                }
                System.out.println("\n");
            break;
        }
    }
    
    // The Print details of all employees method
    public static void printDetailsOfAllEmployees(Company C){
        System.out.println("===== Details for the General Employees =====");
        getPrintTableHeader();
        for (int i=0 ; i<C.employees.size() ; i++) {
            System.out.printf("%-15s", C.employees.get(i).getFirstName());
            System.out.printf("%-15s", C.employees.get(i).getLastName());
            System.out.printf("%15d", C.employees.get(i).getId());
            System.out.printf("%15.2f", C.employees.get(i).getSalary());
            System.out.printf("%15.2f", C.employees.get(i).getNetTax());
        }
        System.out.println("\n");
        System.out.println("--------------------------------------------------------------");
        System.out.println("===== Details for the Accountant Employees =====");
        getPrintTableHeader();
        for (int i=0 ; i<C.accountants.size() ; i++) {
            System.out.printf("%-15s", C.accountants.get(i).getFirstName());
            System.out.printf("%-15s", C.accountants.get(i).getLastName());
            System.out.printf("%15d", C.accountants.get(i).getId());
            System.out.printf("%15.2f", C.accountants.get(i).getSalary());
            System.out.printf("%15.2f", C.accountants.get(i).getNetTax());
        }
        System.out.println("\n");
        System.out.println("--------------------------------------------------------------");
        System.out.println("===== Details for the Marketing Employees =====");
        getPrintTableHeader();
        for (int i=0 ; i<C.marketings.size() ; i++) {   
            System.out.printf("%-15s", C.marketings.get(i).getFirstName());
            System.out.printf("%-15s", C.marketings.get(i).getLastName());
            System.out.printf("%15d", C.marketings.get(i).getId());
            System.out.printf("%15.2f", C.marketings.get(i).getSalary());
            System.out.printf("%15.2f", C.marketings.get(i).getNetTax());
        }
        System.out.println("\n");
        System.out.println("--------------------------------------------------------------");
        System.out.println("===== Details for the Administrative Employees =====");
        getPrintTableHeader();
        for (int i=0 ; i<C.administratives.size() ; i++) {   
            System.out.printf("%-15s", C.administratives.get(i).getFirstName());
            System.out.printf("%-15s", C.administratives.get(i).getLastName());
            System.out.printf("%15d", C.administratives.get(i).getId());
            System.out.printf("%15.2f", C.administratives.get(i).getSalary());
            System.out.printf("%15.2f", C.administratives.get(i).getNetTax());
        }  
        System.out.println("\n");
    }
    
    // The Change comapny details
    public static void changeCompanyDetails(Company C){
        boolean following = true;
        while(following){
            System.out.println("What do you want to change: ");
            System.out.println("1- Company Name.");
            System.out.println("2- Company ID.");
            System.out.println("3- Company Adderss.");
            System.out.println("4- Company Established Year.");
            System.out.println("5- Company CEO.");
            System.out.println("6- Company Country.");
            System.out.println("Please enter your choice: ");
            int changeChoice = in.nextInt();
            switch(changeChoice){
                case 1:
                    System.out.println("=== Change company Name ===");
                    System.out.println("Please enter the new Name: ");
                    C.setCompanyName(in.next());
                break;
                case 2:
                    System.out.println("=== Change comaony ID ====");
                    System.out.println("Please enter the new ID: ");
                    C.setCompanyID(in.nextInt());
                break;
                case 3:
                    System.out.println("=== Change company Address ===");
                    System.out.println("Please enter the new Address: ");
                    C.setAdderss(in.next());
                break;
                case 4:
                    System.out.println("=== Change company Established Year ===");
                    System.out.println("Please enter the new Established Year: ");
                    C.setEstablishedYear(in.nextInt());
                break;
                case 5:
                    System.out.println("=== Change company CEO ===");
                    System.out.println("Please enter the new CEO: ");
                    C.setCEO(in.next());
                break;
                case 6:
                    System.out.println("=== Change company Country ===");
                    System.out.println("Please enter the new Country: ");
                    C.setCountry(in.next());
                break;
            }
            System.out.println("You want to change another details 'Y' for Yes, 'N' for No: ");
            char answer = in.next().charAt(0);
            if (answer == 'Y' || answer == 'y'){
                following = true;
            }else{
                following = false;
            }
        }
    }
    
    // The main method
    public static void main(String[] args) {
        displayWelcomeMessage();
        Company C = new Company();
        System.out.println("\nPlease enter the company details: ");
        System.out.println("~Please enter the Company Name: ");
        C.setCompanyName(in.next());
        System.out.println("~Please enter the Comapny ID: ");
        C.setCompanyID(in.nextInt());
        System.out.println("~Please enter the Company Address: ");
        C.setAdderss(in.next());
        System.out.println("~Please enter the Year Established of the Company: ");
        C.setEstablishedYear(in.nextInt());
        System.out.println("~Please enter the CEO Name: ");
        C.setCEO(in.next());
        System.out.println("~Please enter the Country where the company is located: ");
        C.setCountry(in.next());
        System.out.println("==============================================");
        System.out.println(C.getDetails());
        System.out.println("Company details have been successfully entered.");
        System.out.println("==============================================\n");
        int choice = -1;
        do{
            drawMenu();
            choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("===== Add new Employee =====");
                    drawAddMenu();
                    int addChoice = in.nextInt();
                    addNewEmployee(C, addChoice);
                break;
                case 2:
                    System.out.println("===== Display the number of General Employees in company =====");
                    System.out.println("The number of the General Employees in company: " + C.getNumberOfGeneralEmplyees());
                break;
                case 3:
                    System.out.println("===== Display the number of Accountant Employees in company =====");
                    System.out.println("The number of the Accountnat Employees in company: " + C.getNumberOfAccountants());
                break;
                case 4:
                    System.out.println("===== Display the number of Marketing Employees in company =====");
                    System.out.println("The number of the Marketing Employees in comany: " + C.getNumberOfMarketings());
                break;
                case 5:    
                    System.out.println("===== Dispaly the number of Administrative Employees in comapny =====");
                    System.out.println("The number of the Aministrative Employees in comapany: " + C.getNumberOfAdministratives());
                break;
                case 6:
                    System.out.println("===== Display the number of All Employees in Comapny ======");
                    System.out.println("The number of the All Employees  in Comapny: " + C.getNumberOfAllEmpolyeesInCompany());
                break;
                case 7:
                    System.out.println("===== Print the details Employees by department =====");
                    drawPrintMenu();
                    int printChoice = in.nextInt();
                    printDetailsByDept(C, printChoice);
                break;
                case 8:
                    System.out.println("===== Print the details for all Employees in company =====");
                    printDetailsOfAllEmployees(C);
                break;
                case 9:
                    System.out.println("===== Change Company details ====");
                    changeCompanyDetails(C);         
                break;
                case 10:
                    System.out.println("===== Print Company  details =====");
                    System.out.println(C.getDetails());
                case 0:
                    System.out.println("===== Thank you for using the system. Goodbye! =====");
                break;
                default:
                    System.out.println("No such choice. Please enter the valid choice: ");
            }
        }while(choice != 0); 
    }
}
