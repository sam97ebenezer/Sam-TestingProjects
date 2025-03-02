package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		
		// Declare an integer variable maxRange with value 10
        int maxRange = 10;

        // Use for loop to iterate from 1 to maxRange
        System.out.println("Odd numbers from 1 to " + maxRange + ":");
        for (int i = 1; i <= maxRange; i++) {
            // Check if the number is odd using the mod operator (%)
            if (i % 2 == 1) { // Remainder equals 1 means it's an odd number
                System.out.println(i);
            }
        }
    }
}
