package NEWJAVA;

public class smalestandlorgestarry {

	public static void main(String[] args) {
		int numbers[]={10,20,15,01,23};
		int smalest =numbers[0];
		int largest= numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i]>largest){
				largest=numbers[i];
			}
			else if(numbers[i]<smalest){
				smalest=numbers[i];
			}
		}
                System.out.println("largest arry is ::"+largest);
                System.out.println("samlest arry is ::"+smalest);
	}

}
