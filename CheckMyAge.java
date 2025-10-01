import java.util.Scanner;

// Main class to run the program
public class CheckMyAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckAge checker = new CheckAge();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checker.checkAge(age);  // call the check method
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage()); // display exception message
        } finally {
            System.out.println("Thank you for visiting the site.");
            scanner.close();
        }
    }
}
