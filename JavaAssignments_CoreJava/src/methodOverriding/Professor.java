package methodOverriding;

public class Professor extends Person{
	private int booksPublished;

	public int getBooksPublished() {
		return booksPublished;
	}

	public void setBooksPublished(int booksPublished) {
		this.booksPublished = booksPublished;
	}

	public Professor() {
		
	}
	
	public Professor(String name, int booksPublished) {
		super(name);
		this.booksPublished = booksPublished;
	}
	
	public void print() {
		System.out.println("Professor [booksPublished=" + booksPublished
				+ ", getBooksPublished()=" + getBooksPublished()
				+ ", isOutstanding()=" + isOutstanding() + ", getName()="
				+ getName() + "]");
	}

	public boolean isOutstanding() {
		if(this.getBooksPublished() > 4){
			return true;
		}
		return false;
	}
	
}
