package caseStudy;

import java.util.*;

public class CaseStudy1LibMng {

	// Book details as instance variables
	int bookId;
	String title;
	String author;
	boolean isAvailable;

	// Method to borrow the book
	void borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println(" Book '" + title + "' has been borrowed.");
		} else {
			System.out.println(" Book '" + title + "' is not available.");
		}
	}

	// Method to return the book
	void returnBook() {
		if (!isAvailable) {
			isAvailable = true;
			System.out.println("Book '" + title + "' has been returned.");
		} else {
			System.out.println(" Book was not borrowed.");
		}
	}

	// Method to display details
	void displayDetails() {
		System.out.println("Book ID   : " + bookId);
		System.out.println("Title     : " + title);
		System.out.println("Author    : " + author);
		System.out.println("Available : " + (isAvailable ? "Yes" : "No"));
		System.out.println("-----------------------------");
	}

	// Main method
	public static void main(String[] args) {

		// Create list of books
		List<CaseStudy1LibMng> books = new ArrayList<>();

		// Add first book
		CaseStudy1LibMng b1 = new CaseStudy1LibMng();
		b1.bookId = 101;
		b1.title = "Agni Siragugal";
		b1.author = "Dr. A.P.J Abdul Kalam";
		b1.isAvailable = true;
		books.add(b1);

		// Add second book
		CaseStudy1LibMng b2 = new CaseStudy1LibMng();
		b2.bookId = 102;
		b2.title = "Wings of Fire";
		b2.author = "Dr. A.P.J Abdul Kalam";
		b2.isAvailable = true;
		books.add(b2);

		// Display all books
		System.out.println("Available Books:");
		for (CaseStudy1LibMng book : books) {
			book.displayDetails();
		}

		// Borrow second book
		System.out.println(" Borrowing Book ID 102:");
		for (CaseStudy1LibMng book : books) {
			if (book.bookId == 102) {
				book.borrowBook();
			}
		}
		System.out.println("-------------------------------------------------");

		// Try borrowing again
		System.out.println("Trying again Book ID 102:");
		for (CaseStudy1LibMng book : books) {
			if (book.bookId == 102) {
				book.borrowBook();
			}
		}
		System.out.println("-------------------------------------------------");

		// Return the book
		System.out.println("Returning Book ID 102:");
		for (CaseStudy1LibMng book : books) {
			if (book.bookId == 102) {
				book.returnBook();
			}
		}
		System.out.println("-------------------------------------------------");

		// Final book list
		System.out.println(" Final Book List:");
		for (CaseStudy1LibMng book : books) {
			book.displayDetails();
		}
	}
}
