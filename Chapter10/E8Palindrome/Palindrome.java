package Chapter10.E8Palindrome;

public class Palindrome {

    public static void main(String [] args) {

        System.out.println(palindrome("racecar"));
        
    }    

    public static boolean palindrome( String s ){
        if(s.length() <=1)
        return true;        
        int length = s.length() - 1;

        for(int i=0; i < length; i++) { 
            if(s.charAt(i) == s.charAt(length-i))
                continue;
            else
                return false;
        }
          
        return true;        
    }
    
}
