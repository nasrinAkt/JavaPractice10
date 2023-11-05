package package1;

import java.util.ArrayList;

public class Class7 {

	public static void main(String[] args) {
		
		ArrayList<String> cars	= new ArrayList<String>();
		cars.add("Nissan");
		cars.add("Camero");
		cars.add("Mustang");
		cars.add("BMW");
		
		for(int i = 0; i<cars.size(); i++) {
			
			System.out.println(cars.get(i));
			
			
			for(String a:cars) {
			System.out.println(a);	
				
				
			}
			
			
		}
		
		
		
		
		
		
	}

}
