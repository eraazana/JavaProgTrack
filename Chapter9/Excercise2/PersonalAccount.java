package Chapter9.Excercise2;

public class PersonalAccount extends Account {

    public PersonalAccount(double bal, String fName, String lName, String str, String city, String st, String zip) {
        super(bal, fName, lName, str, city, st, zip);

        if(bal < 100) {
            bal -=2;
            System.out.println("Balance is below the required minimum.. Charged $2 on account...");
        }
    }
    
}
