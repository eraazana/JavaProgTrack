package Chapter9.Excercise2;

public class Main {
    public static void main(String [] args) {
        
        Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road","Mytown", "FL", "33445");
        PersonalAccount eraPersonalAcct = new PersonalAccount(99, "Era", "Personal", "123 Prsonal Road","San Diego", "CA", "33445");

        System.out.println(eraPersonalAcct);
        System.out.println();
        BusinessAccount eraBusinessAcct = new BusinessAccount(499, "Era", "Business", "456 Buss Road","Dallas", "TX", "75228");
        System.out.println(eraBusinessAcct);
    }
    
}
