package builderPattern;
import java.util.*;

public class ECommerceApplication {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("E-Commerce Application");
        System.out.println("Enter personal information" + "/n");

        //Getting user input to create a User object.
        System.out.print("Enter first name: ");
        String firstName;
        while ((firstName = userInput.nextLine().trim()).isEmpty()) {
            System.out.println("Invalid Input\nPlease enter your first name\n");
        }

        System.out.print("Enter last name: ");
        String lastName;
        while ((lastName = userInput.nextLine().trim()).isEmpty()){
            System.out.println("Invalid Input\nPlease enter your last name");
        }

        System.out.print("Enter email: ");
        String email;
        while ((email = userInput.nextLine().trim()).isEmpty()){
            System.out.println("Invalid Input\nPlease enter your email");
        }

        System.out.print("Enter address: ");
        String address;
        while ((address = userInput.nextLine().trim()).isEmpty()){
            System.out.println("Invalid Input\nPlease enter your address");
        }

        System.out.print("Enter phone number: ");
        String phone;
        while ((phone = userInput.nextLine().trim()).isEmpty()){
            System.out.println("Invalid Input\nPlease enter your phone number");
        }

        System.out.print("Enter age: ");
        int age;
        while (true) {
            try {
                age = Integer.parseInt(userInput.nextLine().trim());
                //Check if age is not negative.
                if (age >= 0) {
                    break;
                } else {
                    System.out.println("Invalid Input\nPlease enter a valid age.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input\nPlease enter a valid age (numeric value).");
            }
        }

        //Creating a User object using the Builder pattern
        User user = new User.UserBuilder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .address(address)
                .phone(phone)
                .age(age)
                .build();

        //Displaying the generated user information.
        System.out.println("\nUser Information:");
        System.out.println("First Name: " + user.firstName);
        System.out.println("Last Name: " + user.lastName);
        System.out.println("Email: " + user.email);
        System.out.println("Address: " + user.address);
        System.out.println("Phone: " + user.phone);
        System.out.println("Age: " + user.age);
    }
}
