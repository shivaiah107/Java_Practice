package codeStart;

public class MethodCreate {
	public static void main(String[] args) {
		sayHelloWorld();
		sayHellowNoOfTimes(10);
		
	}

	public static void sayHelloWorld() {
		System.out.println("welcome to the program world shiva");
		System.out.println("welcome to the program world shiva");
		System.out.println("welcome to the program world shiva");
	}
	static void sayHellowNoOfTimes(int numberOfTimes) {
		for (int i = 1; i <= numberOfTimes; i++) {
			System.out.println(i+" you are great my lord Shiva");			
		}
		
	}

}
