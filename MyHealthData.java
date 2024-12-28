package assignment1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * This class declares and initialize all patients' basic information instance
 * variables Provide no-args constructor provide setter and getter method for
 * these private variables
 * 
 * @author Yuling Li 041124113
 */
public class MyHealthData {
	/**
	 * declare variables with private Access Modifier to make sure data safety
	 */
	private String firstName;
	private String lastName;
	private String gender;
	private String address;
	private String education;
	private double height;
	private double weight;
	private LocalDate birthDate;

	/**
	 * this is a no-args constructor
	 */
	public MyHealthData() {

	}

	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * lastName getter and setter
	 * 
	 * @return lastName
	 * 
	 */
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * gender getter and setter
	 * 
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * address getter and setter
	 * 
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * education getter and setter
	 * 
	 * @return education
	 */
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * height getter and setter
	 * 
	 * @return height
	 */
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * weight getter and setter
	 * 
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * birthDate getter and setter
	 * 
	 * @return birthDate
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Instantiate MyHealthDataBase and call the method to calculate ageInDays,
	 * maxHeartrate targetHeartRate range
	 */
	MyHealthDataBase base = new MyHealthDataBase();

	/**
	 * create a method: displayMyHealthData to print the patient get the value:
	 * calculate ageInDays, BMI, MaxHeartRate and heartRate range by using the
	 * methods, which are provided by MyHealthDataBase.class
	 */
	public void displayMyHealthData() {

		System.out.printf("First Name: %s%n", getFirstName());
		System.out.printf("Last Name: %s%n", getLastName());
		System.out.printf("Gender: %s%n", getGender());
		System.out.printf("Home Address: %s%n", getAddress());
		System.out.printf("Level of Education: %s%n", getEducation());
		System.out.printf("Bith date is: %s%n", getBirthDate());
		System.out.printf("Height: %.2f inches%n", getHeight());
		System.out.printf("Weight: %.2f pounds%n", getWeight());
		System.out.printf(
				"Age in days:%s, BMI: %.2f, max heart rate: %d%n" + "target hear rate is from: %.0f to %.0f%n",
				base.calculateAgeInDays(birthDate), base.calculateBMI(weight, height),
				base.calculateMaxHeartRate((int) base.calculateAgeInDays(birthDate)),
				base.calculateTargetMin(base.calculateMaxHeartRate((int) base.calculateAgeInDays(birthDate))),
				base.calculateTargetMax(base.calculateMaxHeartRate((int) base.calculateAgeInDays(birthDate))));

		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
	}

}