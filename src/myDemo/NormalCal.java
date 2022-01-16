package myDemo;

public class NormalCal extends Calcu {

	public static void main(String[] args) {
		
		NormalCal a= new NormalCal();
		
		a.Run();
		a.Slow();

		
	}

	
	public void Slow() {
		System.out.println("Need to Slow");
	}


	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Need to go");

		
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Need to Stop");

		
	}

	
}
