package week1.day2;

public class LearnMethods {
    
    // Method to perform addition
    public void add() { 
        int a = 5; // Declare and initialize variable 'a'
        int b = 5; // Declare and initialize variable 'b'
        System.out.println(a + b); // Print sum of 'a' and 'b'
    }

    // Method to perform subtraction
    public void sub() { 
        int a = 8; // Declare and initialize variable 'a'
        int b = 9; // Declare and initialize variable 'b'
        System.out.println(a - b); // Print difference of 'a' and 'b'
    }

    // Main method to execute the program
    public static void main(String[] args) { 
        // Creating an object of the class
    	LearnMethods lm = new LearnMethods(); 

        // Calling methods using the object
        lm.add(); 
        lm.sub();
    }
}
