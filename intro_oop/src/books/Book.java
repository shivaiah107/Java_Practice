package books;

public class Book {
public static void main(String[] args) {
	Bookname art_Of_Computer_Programming = new Bookname(100);
	Bookname effective_Java = new Bookname(1);
	Bookname clean_code = new Bookname(245);
	System.out.println(art_Of_Computer_Programming.getNoOfCopies());
	System.out.println(effective_Java.getNoOfCopies());
	System.out.println(clean_code.getNoOfCopies());
//	art_Of_Computer_Programming.read();
//	effective_Java.read();
//	clean_code.read();
//	
	art_Of_Computer_Programming.setNoOfCopies(2);
	effective_Java.setNoOfCopies(25);
	clean_code.setNoOfCopies(-10);
	System.out.println(art_Of_Computer_Programming.getNoOfCopies());
	System.out.println(effective_Java.getNoOfCopies());
	System.out.println(clean_code.getNoOfCopies());
	art_Of_Computer_Programming.increaseNoOfCopies(30);
	effective_Java.increaseNoOfCopies(20);
	clean_code.increaseNoOfCopies(35);
	System.out.println(art_Of_Computer_Programming.getNoOfCopies());
	System.out.println(effective_Java.getNoOfCopies());
	System.out.println(clean_code.getNoOfCopies());
	art_Of_Computer_Programming.decreaseNoOfCopies(1);
	effective_Java.decreaseNoOfCopies(5);
	clean_code.decreaseNoOfCopies(36);
	System.out.println(art_Of_Computer_Programming.getNoOfCopies());
	System.out.println(effective_Java.getNoOfCopies());
	System.out.println(clean_code.getNoOfCopies());
	
	
	
//	System.out.println(art_Of_Computer_Programming.getNoOfCopies());
	
	
}
}
