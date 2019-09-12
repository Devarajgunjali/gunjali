package java_progrms;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readfromexcel {
	
	public static void main(String [] args) throws IOException {
	
		/*FileReader is meant for reading streams of characters. 
		For reading streams of raw bytes, consider using a FileInputStream.*/
	    FileReader fileReader = new FileReader("C:/Users/dell/Desktop/en.txt"); 
	    /*BufferedReader reads text from a character-input stream, buffering characters 
	    so as to provide for the efficient reading of characters, arrays, and lines. */
	    BufferedReader bufferReader = new BufferedReader(fileReader);

	    String textfromfile = null; //
	    // Using while loop to read the file until there are no more lines
	    while( (textfromfile = bufferReader.readLine()) != null ){
	      System.out.println(textfromfile);
	       
	       
	    }
	    fileReader.close();
	    //Close the BufferedReader object to prevent memory leak
	    bufferReader.close();
	}
}
