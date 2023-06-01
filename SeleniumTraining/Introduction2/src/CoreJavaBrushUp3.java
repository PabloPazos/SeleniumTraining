
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String is an object - String literal		
		String s1 = "Rahul Shetty Academy";
		
		// New 
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Rahul Shetty Academy";
		
		String[] splitterString = s.split("Shetty");
		
		System.out.println(splitterString[0]);
		System.out.println(splitterString[1]);
		System.out.println(splitterString[1].trim()); // trim() saca los espacios al principio y al final
		
		// Split letter by letter var.
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println("**************************");
		
		// Split letter by letter var starting from the end.
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
