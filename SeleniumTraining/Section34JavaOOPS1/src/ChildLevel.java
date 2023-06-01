/*
 Function overloading.
 Either argument count should be different or 
 argument data type should be different. 
 */
public class ChildLevel extends ChildClassDemo{
	
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(int a, int b) {
		System.out.println(a + b);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildLevel cl = new ChildLevel();
		cl.audioSystem();
		cl.getData(2);
		cl.getData("Hello");
		cl.getData(7,3);
	}
	
}
