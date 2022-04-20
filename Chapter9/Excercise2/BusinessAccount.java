package Chapter9.Excercise2;

public class BusinessAccount extends Account{

    public BusinessAccount(double bal, String fName, String lName, String str, String city, String st, String zip) {
        super(bal, fName, lName, str, city, st, zip);        

        if(bal < 500) { 
            bal -=10;
            System.out.println("Balance is below the required minimum.. Charged $10 on account...");
        }
    }
    
}
