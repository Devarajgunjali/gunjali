
package java_progrms;
 
public class NumberPattern {
 
 public static void main(String[] args) {
int []arry ={10,20,30,78,45};
int val = arry[0];
for(int i=0;i<arry.length;i++){
	if(arry [i] >val){
		val=arry[i];
		
	}

}
System.out.println(""+val);
}

}