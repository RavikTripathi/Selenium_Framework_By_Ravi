package seleniumbyRavi;

import java.util.ArrayList;

public class Stream_Program {

		public void regular() {
	ArrayList<String> name = new ArrayList<String>();
	
	
	name.add("Ravi");
	name.add("tripathi");
	name.add("don");
	name.add("adam");
	name.add("Ram");
	
	int count =0;
	
	for(int i =0;i<name.size();i++) {
		String actual = name.get(i);
		if(actual.startsWith("A")) {
			
			count++;
			
		}
	
	}
	System.out.println(count);
		}
	  
}
