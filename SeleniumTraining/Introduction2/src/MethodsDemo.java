
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo d = new MethodsDemo();
		String name = d.getData(); // Sin statics
		String name2 = getData2(); // Con static
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		getData2();
	}
	
	// Métodos afuera del main.
	// "Static" lo mueve a nivel de clase al método, es decir a MethodsDemo.
	public String getData() {
		System.out.println("Hello World");
		return "rahul shetty";
	}
	
	public static String getData2() {
		System.out.println("Hello World");
		return "rahul shetty";
	}


}
