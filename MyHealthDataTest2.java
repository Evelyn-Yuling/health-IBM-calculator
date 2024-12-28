/**
 * 
 */
package assignment1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class MyHealthDataTest2 {
	 
/**
 * Instantiate MyHealthDataBase.class and call the method to calculate BMI and ageInDays
 */
	MyHealthDataBase base = new MyHealthDataBase();
	
	/**
	 * Test method for the BMI calculation.
	 * This test is designed to fail since the expected value (10) is intentionally incorrect.
	 * Expected: Failure (Red bar)
	 */
	@Test
	void testCalculateBMI() {
		double calculateBMI = base.calculateBMI(180,72);
		assertEquals(10, base.calculateBMI(180,72), 0.01, "BMI calculation failed");
	}
	
	/**
	 * Test method for the age calculation in days.
	 * This test verifies that the calculateAgeInDays method correctly calculates the number of days 
	 * between the provided birth date (January 1, 1990) and the current date
	 * Expected: Success (Green bar)
	 */
	@Test
	void testCalculateAgeInDays() {
        long calculateAgeInDays = base.calculateAgeInDays(LocalDate.of(1990, 1, 1));
        assertEquals(calculateAgeInDays,base.calculateAgeInDays(LocalDate.of(1990, 1, 1)), "Age calculation failed");
	}

}
