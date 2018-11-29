package day31;

import java.util.ArrayList;

public class Assignment2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> Vegetables = new ArrayList<>();
		
		Vegetables.add("Tomato");
		Vegetables.add("Potato");
		Vegetables.add("Karela");
		Vegetables.add("Brinjal");
		Vegetables.add("Raddish");
		
		ArrayList<String> Fruits = new ArrayList<>();
		
		Fruits.add("Apple");
		Fruits.add("Orange");
		Fruits.add("Banana");
		Fruits.add("Mango");
		Fruits.add("Kiwi");
		
		
		for(String t : Fruits) {
			
			Vegetables.add(t);
			
		}
		
		for(String P : Vegetables) {
		
				System.out.println(P);
		}
		
	}

}

