package day19;

public class DieselWorkshop extends Mechanical {

	public void info() {

		System.out.print("It's a ");
		engine();
	}

	public static void main(String[] args) {

		DieselWorkshop obj = new DieselWorkshop();

		obj.info();

	}

}

/*
 * Instead of simply writing engine() in line 8, write super.engine(). Super
 * keyword refers to parent class. So super.engine() means call the engine()
 * method of parent class.
 * 
 * One more possible solution of this assignment can be you call engine() method
 * of Mechanical class through object, like obj.engine(). This way you can
 * invoke the method of parent class from within the child class through the
 * concept of Inheritance.
 */
