package javaStuff;

public class StaticMethod {

	public static void main(String[] args) {

		String x = "10";
		String y = "15";
		
		System.out.println(x+y);
		System.out.println(Integer.parseInt(x)+Integer.parseInt(y));
		
		displayName();
		
		StaticMethod.displayName();
		
		CallingMethod callingMethod = new CallingMethod();
		callingMethod.myName();

	}
	
	int a = 10;
	
	public static void displayName() {
		System.out.println("Jayalingam");
		
	}
	
}