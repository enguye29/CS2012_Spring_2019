package lecture01_oop_i.class_examples_mw;

public class BookTester {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("Hello World", 46374553645L, "John Smith");

		
		System.out.println(book2.title);
		System.out.println(book2.pageNum);
		
		System.out.println(book1.getTitle());
		System.out.println(book2.getTitle());
	}

}
