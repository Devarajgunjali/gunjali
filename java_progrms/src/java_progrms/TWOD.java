package java_progrms;

public class TWOD {
	public static void main(String args[]){
		String y[][] = new String [3][5];
		System.out.println(y.length); //total rows
		System.out.println(y[0].length);// total colums
		
		y[0][0] ="A";
		y[0][1]="B";
		y[0][2]="C";
		y[0][3]="D";
		y[0][4]="E";
		
		y[1][0] ="A1";
		y[1][1]="B1";
		y[1][2]="C1";
		y[1][3]="D1";
		y[1][4]="E1";
		
		
		
		y[2][0] ="A2";
		y[2][1]="B2";
		y[2][2]="C2";
		y[2][3]="D2";
		y[2][4]="E2";
		
		
		for(int row=0;row<y.length;row++){
			for(int col=0;col<y[0].length;col++){
				System.out.println(y[row][col]);
				
			}
		}
	}

}
