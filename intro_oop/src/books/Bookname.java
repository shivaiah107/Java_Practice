package books;

public class Bookname {
	private int noOfCopies;
	Bookname(int noOfCopies){
		this.noOfCopies = noOfCopies;
	}
		public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies >0) {
			this.noOfCopies = noOfCopies;
			}
	}
	public void increaseNoOfCopies(int value) {
		setNoOfCopies(this.noOfCopies + value);
	}
	public void decreaseNoOfCopies(int value) {
		setNoOfCopies(this.noOfCopies - value);
			}
	
	
		void read() {
		System.out.println("please read first page first");
	}
}
