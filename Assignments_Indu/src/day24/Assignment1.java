package day24;

import java.util.ArrayList;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println("Total number of items in the ArrayList is "+ numbers.size());
		
		System.out.println("Index of the last number 5 is "+ numbers.indexOf(5));
		
		//System.out.println(numbers.lastIndexOf(numbers));
	}

}
//Perfect