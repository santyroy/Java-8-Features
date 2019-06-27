package javatechie.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {

		////////////////////////////////////////////// FOR EACH METHOD /////////////////////////////////////////////////////
		List<String> list = new ArrayList<>();
		list.add("Mike");
		list.add("Peter");
		list.add("Henry");
		list.add("Venesa");
		list.add("Annie");

		System.out.println("/////////////////// Traditional Way ////////////////////////");
		long start = System.nanoTime();
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("Time : " + (System.nanoTime() - start));

		System.out.println("//////////////////////// Stream API ///////////////////////////");
		start = System.nanoTime();
		list.stream().forEach(t -> System.out.println(t));
		System.out.println("Time : " + (System.nanoTime() - start));

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");

		map.forEach((key, value) -> System.out.println(key + " : " + value));
		map.entrySet().stream().forEach(obj -> System.out.println(obj));

		/*
		 * Internal working of forEach() in stream API
		 * 
		 * Consumer<String> consumer = t -> System.out.println(t); 
		 * for (String s : list)
		 * { 
		 * 		consumer.accept(s); 
		 * }
		 */
		
		
		
		////////////////////////////////////////////// FILTER METHOD /////////////////////////////////////////////////////
		// Filter method is used for conditional check
		System.out.println("/////////////////// Traditional Way ////////////////////////");
		List<String> names = new ArrayList<>();
		names.add("Mike");
		names.add("Henry");
		names.add("Matt");
		names.add("Michael");
		names.add("David");
		
		for (String s : names) {
			if (s.startsWith("M")) {
				System.out.println(s);
			}
		}
		System.out.println("/////////////////// Filter Method ////////////////////////");
		names.stream().filter(t -> t.startsWith("M")).forEach(t -> System.out.println(t));
		
		
		map.entrySet().stream().filter(k -> (k.getKey()) % 2 == 0)
				.forEach(t -> System.out.println(t.getKey() + " : " + t.getValue()));
		
	}
}
