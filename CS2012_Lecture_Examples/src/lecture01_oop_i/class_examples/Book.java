package lecture01_oop_i.class_examples_mw;

public class Book {
	//Data Fields or Class Member Variables
	public String title;
	public long isbn;
	public String author;
	public int pageNum = 1;

	//Constructors
	public Book() {
		this.title = "My Book";
		this.isbn = 0;
		this.author = "";
	}
	
	public Book(String title, long isbn, String author) {
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
	
	
	
	
	
	
	
	
	
	
	

}
