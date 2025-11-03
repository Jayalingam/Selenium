package javaStuff;

public class StaticVariables {
	
	int a = 0;
	static int b = 0;

	public static void main(String[] args) {
		StaticVariables abc = new StaticVariables();
		StaticVariables abcd = new StaticVariables();
		StaticVariables abcde= new StaticVariables();
		
		abc.counter();
		abc.counter();
		abcd.counter();
		abcd.counter();
		abcde.counter();

	}
	
	
		void counter() {
			a++; b++;
			System.out.println("Non-Static : "+a+" Static : "+b);
	}

}
