package javatechie.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {
		return "HI Java Teckie";
	}

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hi Java Teckie";
		System.out.println(supplier.get());
		
		
//		List<String> numbers = Arrays.asList("A", "B", "C");
		List<String> numbers = Arrays.asList();
		System.out.println(numbers.stream().findAny().orElseGet(() -> "Hi Java Teckie"));
	}

}
