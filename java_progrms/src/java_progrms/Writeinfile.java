package java_progrms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writeinfile {

	public static void main(String[] args) throws IOException {

		String textToWrite = "I am learning Java from SoftwareTestingMaterial";
		// Import BufferedWriter and FileWriter classes
		/* BufferedWriter writes text to a character-output stream, buffering characters 
		so as to provide for the efficient writing of single characters, arrays, and strings. */
		//Import FileWriter and BufferedWriter class
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/dell/Desktop/en.txt"));
		writer.write(textToWrite);
	    // Close the BufferedWriter object to prevent memory leak
		writer.close();
	}
}