package week1.day2;

public class Library {
	
	String addBook(String bookTitle) {
		System.out.println("Book Added Successfully...");
		return bookTitle;
	}
	
	void issueBook() {
		System.out.println("Book issued successfully...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library l1= new Library();
		System.out.println(l1.addBook("Python"));
		l1.issueBook();

	}

}
