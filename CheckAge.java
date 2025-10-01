// Class that contains the method to check age
public class CheckAge {
    public void checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Access Denied: You must be at least 18 years old to enter. Your age: " + age);
        } else {
            System.out.println("Access Granted: Welcome to the site!");
        }
    }
}
