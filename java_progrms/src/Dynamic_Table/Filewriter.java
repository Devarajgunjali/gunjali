package Dynamic_Table;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	public static void main(String args[]){    
		
		try {
			FileWriter  wr = new FileWriter ("C:/Users/dell/Desktop/automation.txt");
			wr.write("Welcome to eagle");
			wr.close();
		} catch (IOException e) {
			
			
		}
	}

}
