/**
 * 
 */
package assignment1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * MyHealthDataTest is a class to get the patient health data from users
 */
public class MyHealthDataTest {

	public static void main(String[] args) {
	    /**
	     * Uses a Scanner to prompt the user to input their health data. 
		 * The input includes personal details like first name, last name, gender, 
		 * home address, education level, height, weight, and birth date. 
		 * These values are then stored in corresponding variables.
	     */
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Please enter your First Name: ");
		String firstName = input1.nextLine();
		
		System.out.println("Please enter your Last Name: ");
		String lastName = input1.nextLine();
		
		System.out.println("Please enter your gender: ");
		String gender = input1.nextLine();
		
		System.out.println("Please enter your Home Address: ");
		String address = input1.nextLine();
		
		System.out.println("Please enter your level if education: ");
		String education = input1.nextLine();
		
		System.out.println("Please enter your height(in inches): ");
		double height = input1.nextDouble();
		
		System.out.println("Please enter your weight(in pounds): ");
		double weight = input1.nextDouble();
		
		System.out.println("Please enter your birth year: ");
		int year = input1.nextInt();
		
		System.out.println("Please enter your birth month: ");
		int month = input1.nextInt();
		
		System.out.println("Please enter your birth day: ");
		int day = input1.nextInt();
		
		LocalDate birthDate = LocalDate.of(year, month, day);
		
		/**
		 * Instantiates a MyHealthData object and assigns user input to the instance variables 
		 * using setter methods. 
		 */
		MyHealthData health = new MyHealthData();
			health.setFirstName(firstName);
		    health.setLastName(lastName);
		    health.setGender(gender);
		    health.setAddress(address);
		    health.setEducation(education);
		    health.setHeight(height);
		    health.setWeight(weight);
		    health.setBirthDate(birthDate);
		    /**
		     * The instance's data is displayed by calling the displayMyHealthData method.
		     */
		    health.displayMyHealthData();
		    	
		    

	
	}
}
