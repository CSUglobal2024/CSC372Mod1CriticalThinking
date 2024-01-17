package fictionalPerson;
import java.util.Scanner;


public class fictionalPerson {

	public static void main(String[] args) {
		/*Pseudocode:
		 * The goal of this program is to print the following information for a fictional person to the console:
		 * 	First name
			Last name
			Street address
			City
			Zip code
		 * 
		 * 1. Prompt the user for their first name, use scanner to read the user input, and store the input in a descriptive String variable. 
		 * 2. Prompt the user for their last name, use scanner to read the user input, and store the input in a descriptive String variable.
		 * 3. Prompt the user for their street address, use scanner to read the user input, and store the input in a descriptive String variable.
		 * 4. Prompt the user for their city, use scanner to read the user input, and store the input in a descriptive String variable.  
		 * 5. Prompt the user for their zip code, use scanner to read the user input, and store the input in a descriptive String variable.
		 * 6. Print each variable value using println for each variable so that each is on its own line.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		//Requests for user input 
		System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your street address: ");
        String streetAddress = scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.print("Enter your zip code: ");
        String zipCode = scanner.nextLine();
        
        //Print inputs to console
        System.out.println("User Input:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);

        scanner.close();

	}

}
