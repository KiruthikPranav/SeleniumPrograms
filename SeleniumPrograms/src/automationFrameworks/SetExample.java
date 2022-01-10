package automationFrameworks;

import java.util.HashSet;

public class SetExample {
	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
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
