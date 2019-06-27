package javatechie.lambda.example;

public class Book {

	private int id;
	private String name;
	private int pages;

	public Book(int id, String name, int pages) {
		this.id = id;
		this.name = name;
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPages() {
		return pages;
	}

	@Override
	public String toString() {
		return "\nBook [id=" + id + ", name=" + name + ", pages=" + pages + "]";
	}
	
	

}
