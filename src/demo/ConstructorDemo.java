package demo;

public class ConstructorDemo {
	public ConstructorDemo() {
		System.out.println("Default Constructor get Called !!!");
	}

	public ConstructorDemo(int number) {
		System.out.println("Parameterized Constructor  in the Constructor Class !!!");
		System.out.println("Number is : " + number);
	}

	public ConstructorDemo(String msg) {
		System.out.println("Parameterized Constructor  in the Constructor Class !!!");
		System.out.println("Message is : " + msg);
	}

	public static void main(String[] args) {
		ConstructorDemo demo = new ConstructorDemo();
		demo = new ConstructorDemo(101);
		demo = new ConstructorDemo("Hello");
	}
}
