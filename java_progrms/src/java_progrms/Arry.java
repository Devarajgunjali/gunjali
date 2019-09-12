package java_progrms;

public class Arry {
	
	public static void main (String args[]){
		int i [] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
			
			//double arry
			
			double d[]=new double[3];
			d[0]=2.3;
			d[1]=2.4;
			d[2]=2.5;
			System.out.println(d.length);
			
			//object arry
			Object ob[] = new Object[6];
			ob[1]="dev";
			
			
		}
	}

}
