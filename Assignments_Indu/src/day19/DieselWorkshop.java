package day19;

public class DieselWorkshop extends Mechanical{
	
public void info() {
		
		System.out.print("It's a " );
		engine();
	}

	public static void main(String[] args) {
		
		DieselWorkshop obj = new DieselWorkshop();
		
		obj.info();
		
		
	}

}
