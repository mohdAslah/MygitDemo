package myDemo;

public class NormalCal extends Calcu {

	public static void main(String[] args) {
		
		NormalCal a= new NormalCal();
		
		a.Run();
		a.Slow();
		a.Sleep();
		a.go();
		a.stop();

		
	}

	
	public void Slow() {
		System.out.println("Need to Slow");
	}


	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Need to go");
		System.out.println("Need to gonow");


		
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Need to Stop");

		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Need to run");

		
	}

	
}
