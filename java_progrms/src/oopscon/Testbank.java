package oopscon;

public class Testbank {

	public static void main(String[] args) {
		
		System.out.println(USBANK.mim_balance);
		HSBBank b = new HSBBank();
		
		b.credit();
		b.debit();
		b.edu();
		b.transfer();
		b.loaf();
		b.found();
		b.eaglemessaging();
		
		System.out.println("#@#@#@#@#@#@#@#");
		
USBANK bs = new	HSBBank();

bs.credit();
bs.debit();
bs.transfer();


	}

}
