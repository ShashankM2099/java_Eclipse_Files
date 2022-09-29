package LearningJava;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jSonExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		JSONObject obj1 = new JSONObject();
		obj1.put("name", "Shashank");
		obj1.put("rollNum", (int)23);
		obj1.put("class", "Soph");
		PrintWriter pw = new PrintWriter("JSONExample.json");
        pw.write(obj1.toJSONString());
        pw.flush();
        pw.close();
			
	}

}
