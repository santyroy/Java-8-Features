package javatechie.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "Harry Potter and the Sorcerer Stone", 1000));
		books.add(new Book(2, "Harry Potter and the Chamber of Secrets", 2000));
		books.add(new Book(3, "Harry Potter and the Prisoner of Askaban", 3000));
		books.add(new Book(4, "Harry Potter and the Goblet of Fire", 4000));
		books.add(new Book(5, "Harry Potter and the Half Blood Prince", 5000));
		books.add(new Book(6, "Harry Potter and the Order of the Phoenix", 6000));
		books.add(new Book(7, "Harry Potter and the Deathly Hallows", 7000));
		return books;
	}
}
