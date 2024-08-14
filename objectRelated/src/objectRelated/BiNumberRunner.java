package objectRelated;

public class BiNumberRunner {
	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println(numbers.add());
		System.out.println(numbers.mu1ltiply());
		numbers.doubleValue();// to double the both numbers
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}

}
