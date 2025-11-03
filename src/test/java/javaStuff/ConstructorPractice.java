package javaStuff;

public class ConstructorPractice {
	
	int x;
	String abc;

	public static void main(String[] args) {
		ConstructorPractice con = new ConstructorPractice(123);
		con.display();
		ConstructorPractice cons = new ConstructorPractice(456, "Jayalingam");
		cons.display();
		

	}
	
	public ConstructorPractice(int x) {
		this.x = x;
		
	}
	
	public ConstructorPractice(int x, String abc) {
		this.x = x;
		this.abc = abc;
		
	}
	void display() {
		
		System.out.println("Integer : "+x);
		System.out.println("String : "+abc);
	}
	
	

}
