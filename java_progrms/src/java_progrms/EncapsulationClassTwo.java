package java_progrms;

public class EncapsulationClassTwo {
	
	public static void main(String [] args){
		
		EncapsulationClassOne obj = new EncapsulationClassOne();
                // Setting values of the variables
		obj.setAge(27);
		obj.setName("Devaraj Gunjali");
		
		System.out.println("My name is "+ obj.getName());
		System.out.println("My age is "+ obj.getAge());
		
	}

}