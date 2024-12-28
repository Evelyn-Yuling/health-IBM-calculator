package assignment1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * MyHealthDataBase is a base class to be extended for the digital Health Records System,
 * It contains a method to calculate BMI and will contain other methods.
 * @author Yuling Li
 * @version 1.1
 * @since 
 * @see MyHealthData
 */
public class MyHealthDataBase		{
	
	  /** 
	    * This method returns the calculated Body Mass Index (BMI) from data provided.
	    * @param weightParam Weight of the patient in pounds.
	    * @param heightParam Height of the patient in inches.
	    */
    public double calculateBMI(double weight, double height){
        return weight * 703 / (height * height);
     }
    
    /**
     * Utilizes the LocalDate and ChronoUnit classes to compute the number of days 
     * between the birth date and the current date.
     * @param birthDate
     * @return ageInDays as long value
     */
    public long calculateAgeInDays(LocalDate birthDate) {
   		LocalDate currentDate = LocalDate.now();
   		return ChronoUnit.DAYS.between(birthDate, currentDate);
	}
   	
	/**
	 * create a method to calculate maxHeartRate,which is (220-ageInYears)
	 * @param ageInDays
	 * @return maxHeartRate as a int value
	 */
   	public int calculateMaxHeartRate(int ageInDays) {
   		int ageInYears = (int)(ageInDays/365);
   		int maxHeartRate = 220 - ageInYears;
   		return maxHeartRate;
   	} 

   	/**
   	 * create a method to calculate maxtargetHeartRate(85% maxHeartRate) and mintargetHeartRate(50% maxHeartRate)
   	 * @param maxHeartRate
   	 * @return
   	 */
   	public double calculateTargetMax(int maxHeartRate) {
   		double targetMax = 0.85*maxHeartRate;
   		return targetMax;
   	}
   	public double calculateTargetMin(int maxHeartRate) {
   		double targetMin =0.5*maxHeartRate;
   		return targetMin;
	}
   	}


