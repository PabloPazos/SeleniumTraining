
public class AutralianTraffic implements CentralTraffic, ContinentTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AutralianTraffic();
		
		a.greenGo();
		a.redStop();
		a.flashYellow();
		
		AutralianTraffic at = new AutralianTraffic();
		at.walkonsymbol();
		
		ContinentTraffic ct = new AutralianTraffic();
		ct.TrainSymbol();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green go implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Redstop implementation");
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow flash implementation");
		
	}
	
	public void walkonsymbol() {
		System.out.println("Walking");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train symbols");
		
	}

}
