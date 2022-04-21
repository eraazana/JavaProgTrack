package Chapter10;

import java.util.ArrayList;
import java.util.Random;

public class EvenAndOdds {

    public static void main(String [] args) {

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        Random r = new Random();
        for(int i=0; i<25; i++) {
            int q = r.nextInt(100);

            if(q%2==0)
                even.add(q);
            else
                odd.add(q);

        }

        System.out.println("Even: ");
        even.forEach((e) -> System.out.print(e+", "));

        System.out.println("\n");
        System.out.println("Odd: ");
        odd.forEach((e) -> System.out.print(e+", "));
        
    }
    
}
