
public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildEmirites c = new ChildEmirites();
		c.engine();
		c.safetyGuideLines();
		c.bodyColor();
		
		/* ParentAirCraft p = new ParentAirCraft(); NO puedo instanciar clases abstractas, pero puedo 
		extender las propiedades a otra clase, y llamarlas por instancias de otra clase.*/
		
		
		
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
