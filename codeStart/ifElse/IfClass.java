package ifElse;

public class IfClass {
	public static void main(String[] args) {
		firstBlock();
		block2();
		block3();
		block4(11);
	}
	private static void firstBlock() {
		int i = 10;
		if (i == 10) {
			System.out.println("the given value is matched ");
		}
	}
	private static void block2() {
		int i = 10;
		if (i < 10) {
			System.out.println("the given value is matched ");
		}else {
			System.out.println("i value not matched in block 2");
		}	
	}
	private static void block3() {
		int i =5;
		if (i < 10) 
			System.out.println("the given value is matched ");
		if (i<=5)
			System.out.println("given value is matched with the above value");
		else 
			System.out.println("i value not matched in block 2");
		
	}

	private static void block4(int i) {
		if (i < 10) {
			System.out.println("the given value is matched ");
		} else if (i <= 5) {
			System.out.println("given value is matched with the above value");
		} else {
			System.out.println("i value not matched in block 4");

		}
		
	}



}
