package ifElse;

public class CharClass {
public static void main(String[] args) {
	CharAt c=	new CharAt();
	
	System.out.println(c.isChar('c'));
	System.out.println(c.isChar('0'));
	System.out.println(c.isDigit('9'));
	System.out.println(c.isVowel('b'));
	System.out.println(c.isVowel('i'));
	System.out.println(c.isNotVowel('a'));
	System.out.println(c.isNotVowel('b'));
	

	}
}
