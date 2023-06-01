
public class ChildClassDemo extends parentClassDemo {
	
	public void audioSystem () {
		System.out.println("New Audio Child System");
	}
	
	public void engine () {
		System.out.println("New Engine");
	}
	
	public void colour() {
		System.out.println(colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassDemo cd = new ChildClassDemo();
		cd.colour();
		cd.brakes();
		cd.audioSystem(); // Function overrinding - Both have method same name same signature, same parameters.
		cd.engine();
		cd.Gear();
		
	}

}
