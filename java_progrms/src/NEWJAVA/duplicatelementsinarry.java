package NEWJAVA;

import java.util.HashSet;
import java.util.Set;

public class duplicatelementsinarry {
	public static void main(String[] args) {
		
		
		String names[]={"devaraj","gunjali","devarj"};
		
		Set<String> store = new HashSet<String>();
		for(String name1:names){
			if(store.add(name1)==false){
				System.out.println("duplicat element is::" + name1);
				
			}
		}
	}
	
	

}
