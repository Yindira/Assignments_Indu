package day31;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<>();
		boolean isContained = false;
		Scanner k = new Scanner(System.in);

		for (int i = 1; i < 4; i++) {

			System.out.println("Enter a car name");
			String carUsersEntered = k.nextLine();
			cars.add(carUsersEntered);

		}

		for (String t : cars) {
			if (t.equals("BMW")) {
				isContained = true;
			}
		//} - prints only once
		

		if (isContained) {
			System.out.println("Yes it is there");

		} else {
			System.out.println("No,it is not there");
		}

	}

}
}
//This is not working correctly, after asking for 3 times, it prints the output thrice.
