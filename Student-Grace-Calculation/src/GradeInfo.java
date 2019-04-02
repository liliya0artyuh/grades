
import org.json.*;

public class GradeInfo {
	
	static JSONArray gradeInfoArray = new JSONArray();
	JSONObject jsonObj = new JSONObject();
	
	GradeInfo(String grade, int min, int max) {
		storeGradeinfo(grade, min, max);
	}	
	
	private void storeGradeinfo(String grade, int min, int max) {
		
		try {
			jsonObj.put("Grade", grade);
			jsonObj.put("Min", min);
			jsonObj.put("Max", max);
			
			gradeInfoArray.put(jsonObj);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void printGradeInfo() {
		
		System.out.println("Your provided details for Grade Schema are like: \n");
		System.out.println("--------------------------");
		System.out.println("Grade | Minimum - Maximum");
		System.out.println("--------------------------");
		
		for (int i = 0; i < gradeInfoArray.length(); i++) {
			try {
				if(i%2==0)
				System.out.println(gradeInfoArray.getJSONObject(i).getString("Grade") + 
						"         " + gradeInfoArray.getJSONObject(i).getInt("Min") + 
						"   -  " + gradeInfoArray.getJSONObject(i).getInt("Max") + " % |");
				else
					System.out.println(gradeInfoArray.getJSONObject(i).getString("Grade") + 
							"          " + gradeInfoArray.getJSONObject(i).getInt("Min") + 
							"   -  " + gradeInfoArray.getJSONObject(i).getInt("Max") + " % |");
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("--------------------------");
	}
}
