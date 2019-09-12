package java_progrms;

public class StringSubstringExample { 
    public static void main(String args[]) 
    { 
  
        // Initializing String 
        String mysourcestring = new String("http://localhost:88"); 
  
        // Printing original string 
        System.out.print("The original string  is : "); 
        System.out.println(mysourcestring); 
  
        // using substring() to extract substring 
        // returns 1000 
        String substr=mysourcestring.substring(mysourcestring.indexOf("http://localhost:88") + 1);
        System.out.print("The extracted substring  is : "+mysourcestring); 
        //System.out.println(mysourcestring.substring(mysourcestring)); 
    } 
} 