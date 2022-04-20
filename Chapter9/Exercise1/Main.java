package Chapter9.Exercise1;

public class Main {
    
    public static void main(String [] args) {
       UEmployee uemp = new UEmployee("Era",5000);
       System.out.println(uemp);
       System.out.println();

       Faculty faculty1 = new Faculty("IT Dept", "Aldrin", 7000);
       System.out.println(faculty1);
       System.out.println();
       
       Staff staff1 = new Staff("IT Support", "Aron", 9000);
       System.out.println(staff1);
        
    }
}
