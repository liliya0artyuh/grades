import java.util.Scanner;

/**
 * 
 */

/**
 * @author harsh
 *
 */
public class GradeSchemaCalculator {

	static int min, max;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Greeting
		System.out.println("Hello Student, \n Here you will find out about your current progress, "
				+ "\n how much you required to pass and what assignment you can skip (*If you wish).\n");
		
		//Information
		System.out.println("Before proceed, \n You have to give your school schema to calculate your progress. \n"
				+ "For Example: Grade: A+, Range for Grade: 90 - 100%.");
		
		//Static Grade Array
		String[] grades = {"A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};
		
		
		//Ask For Information
		//User have to provide the range for the grade
		
		Scanner scan = new Scanner(System.in);
		
		//For loop for change grade Letter
		for (int i = 0; i < grades.length; i++) {
			
			System.out.println("\nEnter Range for Grade '"+grades[i]+"':");
			
			System.out.println("Minimum Range: ");
			min = scan.nextInt();
			
			System.out.println("Maximum Range: ");
			max = scan.nextInt();
			
			GradeInfo gradeinfo = new GradeInfo(grades[i], min, max);
			
		}
		
		GradeInfo.printGradeInfo();
	}

}
