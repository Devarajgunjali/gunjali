package Dynamic_Table;

public class Countthevowls {
	public static void main(String[] args) {
		String line="devarajgunxjaliiovu";
		int vowels=0, constol=0;
	line =	line.toLowerCase();
	for(int i=0; i<line.length(); i++){
		char ch = line.charAt(i);
		
		if(ch=='a' || ch=='e' || ch =='i'|| ch=='o'|| ch=='u'){
			++vowels;
		}
		else if ((ch >= 'a'&& ch <= 'z')){
			++constol;
			
		}
	}
		
		
	System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + constol);	
		
		
		
	}

}
