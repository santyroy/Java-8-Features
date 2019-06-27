package javatechie.lambda.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public static List<Book> getBooksInSort() {
		List<Book> listOfBook = new BookDAO().getBooks();
		
		
//		Collections.sort(listOfBook, new MyComparator());
		
//		Collections.sort(listOfBook, new Comparator<Book>() {
//
//			@Override
//			public int compare(Book o1, Book o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		
		
		Collections.sort(listOfBook, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return listOfBook;
	}

	public static void main(String[] args) {

		System.out.println(getBooksInSort());
	}

}

/*
class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
*/