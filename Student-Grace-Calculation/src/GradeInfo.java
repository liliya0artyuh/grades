/**
 * 
 */

/**
 * @author harsh
 *
 */
public class GradeInfo {

	private String Grade;
	private int min;
	private int max;
	
	public GradeInfo(String grade, int min, int max) {
		super();
		Grade = grade;
		this.min = min;
		this.max = max;
	}
	
	public GradeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return Grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		Grade = grade;
	}

	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}
	
}
