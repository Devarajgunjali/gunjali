package NEWJAVA;

public class Missarry {

	public static void main(String[] args) {
	
		int a[] ={1,2,4,5,6,7,8};
		
		int sum = 0;
		int len=a.length;
		for(int i=0;i<len;i++){
			sum=sum+a[i];//33
		}
		System.out.println(sum);



	int sum2=0;
	for(int j=1;j<=8; j++){
		sum2=sum2+j;//36
	}
	System.out.println(sum2);
	System.out.println("missing number is::"+(sum2-sum));//36-33=3
	
}

}
