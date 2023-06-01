import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> a = new ArrayList<String>();
		a.add("Leblanc");
		a.add("Camile");
		a.add("Warwick");
		a.add("Urgot");
		a.add("Blitzcrank");
		a.remove(3);
		
		for(String j: a) {
			System.out.println(j);
		}
		
		System.out.println("**************************");
		
		String[] name = {"rahul", "shetty", "Selenium"};
		List<String> nameArrayList = Arrays.asList(name);
		
		System.out.println(nameArrayList.contains("Selenium"));
	}

}
