package week1.day2;

public class LearnControlStatements {
	
    public static void main(String[] args) {
    	
        // Declare and initialize marks variable
        int marks = 60;

        // 1. Simple if statement (checks if marks are above 50)
        if (marks > 50) {
            System.out.println("Pass");
        }

        // 2. if-else statement (checks if marks are above 40, else it's a fail)
        if (marks >= 40) {
            System.out.println("Grade 1");
        } else {
            System.out.println("Fail");
        }

        // 3. Nested if statement (adding more grading levels)
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }

        // 4. Switch-case statement (alternative grading system)
        int grade = marks / 10; // Convert marks into grade levels
        switch (grade) {
            case 10: case 9:
                System.out.println("Excellent! A+ Grade");
                break;
            case 8:
                System.out.println("Very Good! A Grade");
                break;
            case 7:
                System.out.println("Good! B Grade");
                break;
            case 6:
                System.out.println("Satisfactory! C Grade");
                break;
            case 5:
                System.out.println("Pass! D Grade");
                break;
            default:
                System.out.println("Fail! Needs Improvement.");
        }

        // 5. Ternary operator (quick one-line decision for pass/fail)
        String result = (marks >= 50) ? "Pass" : "Fail";
        System.out.println(result);

        // 6. While loop (Prints "Studying..." until marks reach 100)
        while (marks < 100) {
            System.out.println("Studying...");
            marks += 10; // Increase marks to prevent infinite loop
        }

        // 7. For loop (Prints grades from 50 to 100)
        for (int i = 50; i <= 100; i += 10) {
            System.out.println("Current marks: " + i);
        }

        // 8. Do-while loop (Executes at least once)
        int retry = 0;
        do {
            System.out.println("Attempt: " + (retry + 1));
            retry++;
        } while (retry < 3);
    }
}