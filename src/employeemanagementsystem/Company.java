
package employeemanagementsystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Company {
    
    // The Scanner class
    Scanner in = new Scanner(System.in);
    
    // The Data members for the Company
    private String companyName;
    private int companyID;
    private String adderss;
    private int establishedYear;
    private String CEO;
    private String country;
    public int numberOfGeneralEmplyees = 0;
    public int numberOfAccountants = 0;
    public int numberOfMarketings = 0; 
    public int numberOfAdministratives = 0;
    public int numberOfAllEmpolyeesInCompany;
    public ArrayList <Employee> employees = new ArrayList <> ();
    public ArrayList <Accountant> accountants = new ArrayList <> ();
    public ArrayList <Marketing> marketings = new ArrayList<>();
    public ArrayList <Administrative> administratives = new ArrayList<>();
    
    // The Default constructor
    public Company() {
        this.companyName = "Unknown Company";
        this.companyID = 0;
        this.adderss = "Unknown Address";
        this.establishedYear = 0;
        this.CEO = "Unknown CEO";
        this.country = "Unknown Country";
    }

    // The Parametrized constructor
    public Company(String companyName, int companyID, String adderss, int establishedYear, String CEO, String country) {
        setCompanyName(companyName);
        setCompanyID(companyID);
        setAdderss(adderss);
        setEstablishedYear(establishedYear);
        setCEO(CEO);
        setCountry(country);
    }

    // The Get company name 
    public String getCompanyName() {
        return companyName;
    }

    // The Set company name
    public void setCompanyName(String companyName) {
        if (companyName != null){
            this.companyName = companyName;
        }else{
            System.out.println("Company Name must be a non-empty string. Please try again: ");
            setCompanyName(in.next());
        }
    }

    // The Get company id
    public int getCompanyID() {
        return companyID;
    }

    // The Set company id
    public void setCompanyID(int companyID) {
        if (companyID > 0){
            this.companyID = companyID;
        }else{
            System.out.println("Comoany ID must be a positive integer number and greater than 0. Please try again: ");
            setCompanyID(in.nextInt());
        }
    }

    // The Get address
    public String getAdderss() {
        return adderss;
    }

    // The Set address
    public void setAdderss(String adderss) {
        if (adderss != null){
            this.adderss = adderss;
        }else{
            System.out.println("Address must be a non-empty string. Please try again: ");
            setAdderss(in.next());
            
        }
    }

    // The Get estiablished year
    public int getEstablishedYear() {
        return establishedYear;
    }

    // The Set estiablished year
    public void setEstablishedYear(int establishedYear) {
        if (establishedYear >= 1900 && establishedYear <= Calendar.getInstance().get(Calendar.YEAR)){
            this.establishedYear = establishedYear;
        }else{
            System.out.println("Established year must be between 1900 and 2025. Please try again: ");
            setEstablishedYear(in.nextInt());
        }
    }

    // The Get ceo
    public String getCEO() {
        return CEO;
    }

    // The Set ceo
    public void setCEO(String CEO) {
        if (CEO != null && CEO.matches("[a-zA-Z]+")){
            this.CEO = CEO;
        }else{
            System.out.println("CEO name must be non-empty string and containing only letters. Please try again: ");
            setCEO(in.next());
        }
    }

    // The Get country
    public String getCountry() {
        return country;
    }

    // The Set country
    public void setCountry(String country) {
        if (country != null){
            this.country = country;
        }else{
            System.out.println("Country must be non-empty String. Please try again: ");
        }
    }  

    // The Get number of general employees method
    public int getNumberOfGeneralEmplyees() {
        return numberOfGeneralEmplyees;
    }

    // The Get number of accountants method
    public int getNumberOfAccountants() {
        return numberOfAccountants;
    }

    // The Get number of marketings method
    public int getNumberOfMarketings() {
        return numberOfMarketings;
    }

    // The get number of administratives method
    public int getNumberOfAdministratives() {
        return numberOfAdministratives;
    }

    // The Get number of all employess in company
    public int getNumberOfAllEmpolyeesInCompany() {
        return (getNumberOfAccountants() + getNumberOfGeneralEmplyees() + getNumberOfMarketings() + getNumberOfAdministratives());
    }
    
    // The Get details method (override)
    public String getDetails(){
        String de = "";
        de += "\n~Company Name: " + getCompanyName();
        de += "\n~Company ID: " + getCompanyID();
        de += "\n~Address: " + getAdderss();
        de += "\n~Established Year: " + getEstablishedYear();
        de += "\n~CEO: " + getCEO();
        de += "\n~Country: " + getCountry();
        return de;
    }
}
