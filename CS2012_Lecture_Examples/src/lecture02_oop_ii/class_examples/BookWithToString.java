package lecture02_oop_ii.class_examples;

public class BookWithToString {
	//Data Fields or Class Member Variables
	public String title;
	public long isbn;
	public String author;
	public int pageNum = 1;

	//Constructors
	public BookWithToString() {
		this.title = "My Book";
		this.isbn = 0;
		this.author = "";
	}

	public BookWithToString(String title, long isbn, String author) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
	}

	//Other Methods
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void turnPageForward() {
		this.pageNum++;
	}

	public void turnPageBackward() {
		this.pageNum--;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result += "Title: " + this.title + "\n";
		result += "Author: " + this.author + "\n";
		result += "ISBN: " + this.isbn;
		
		return result;	
	}











}
