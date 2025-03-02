package week1.day2;

public class LearnOperators {
    public static void main(String[] args) {
        // arithmetic operators
        int modResult = 11 % 2; // Modulus operator returns remainder (11 divided by 2 gives remainder 1)
        System.out.println(modResult);

        // assignment operators
        int a = 5, b = 10;
        a += 1; // a = a + 1 (increments a by 1, so a becomes 6)
        System.out.println(a);

        b -= 5; // b = b - 5 (decrements b by 5, so b becomes 5)
        System.out.println(b);

        // unary operators
        int x = 5;
        int preIncrement = ++x;  // Pre-increment: Increases x by 1 first, then assigns (x becomes 6)
        int preDecrement = --x;  // Pre-decrement: Decreases x by 1 first, then assigns (x becomes 5 again)
        int postIncrement = x++; // Post-increment: Assigns x first (5), then increases x to 6
        int postDecrement = x--; // Post-decrement: Assigns x first (6), then decreases x to 5

        System.out.println(preIncrement);  // Output: 6
        System.out.println(preDecrement);  // Output: 5
        System.out.println(postIncrement); // Output: 5 (but x is now 6)
        System.out.println(postDecrement); // Output: 6 (but x is now 5)

        // logical operators (using numbers for easier understanding)
        int num1 = 8, num2 = 5, num3 = 10;
        boolean andResult = (num1 > num2) && (num3 > num1); // (8 > 5) AND (10 > 8) → true AND true → true
        boolean orResult = (num1 < num2) || (num3 > num1);  // (8 < 5) OR (10 > 8) → false OR true → true
        boolean notResult = !(num1 == num3);                // NOT (8 == 10) → NOT false → true

        System.out.println(andResult); // Output: true
        System.out.println(orResult);  // Output: true
        System.out.println(notResult); // Output: true
    }
}