package ifElse;

public class CharAt {
	
	private char ch;

	public void MyChar(char ch){
		this.ch =ch;
	}
	public boolean isChar(char ch) {
		if(ch>=97 && ch<=122)
			return true;
		if (ch >= 65 && ch <= 90)
			return true;
		return false;
	}

	public boolean isVowel(char ch) {
		if (ch =='a'|| ch == 'A'||ch =='e' || ch == 'E'||ch =='i' || ch  == 'I'|| ch =='o' || ch == 'O' ||ch =='u' || ch == 'U')
			return true;
		return false;
	}



	public boolean isDigit(char ch) {
		if(ch >= 48 && ch <=57)
			return true;
		return false;
	}
	public boolean isNotVowel(char ch) {
		if(isChar(ch) != isVowel(ch))
			return true;
		return false;
	}

}
