package oopscon;

public class TestCar  {
public static void main(String args[]){
	BMW b = new BMW();
	b.start();
	b.fuel();// When same method is present in parent class as well as CHILD Class  with same name and same arguments , is called method overriding
 System.out.println("$$$$$$$$$$$$$$$");
Car cl = new Car();

cl.start();
cl.stop();
cl.fuel();
cl.engi();


}
}
