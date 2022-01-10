package automationFrameworks;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Kiruthik");
		name.add("Karthigeyan");
		name.add("Vasanthi");
		name.add("Pranav");
		name.add("Java");
		name.add("Java");		
		for(String i:name) {
			System.out.println(i);
		}
		
		
	}
}
