package javatechie.stream.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javatechie.stream.example.Employee;

public class SortMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		map.put("five", 5);

//		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
//		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				return o1.getKey().compareTo(o2.getKey());
//			}
//		});
//
//		for (Entry<String, Integer> entry : entries) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
//
//		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//		for (Entry<String, Integer> entry : entries) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}

		// Using Stream API
		map.entrySet().stream().sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
				.forEach(t -> System.out.println(t));

		// OR

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(t -> System.out.println(t));

		Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));

		employeeMap.put(new Employee(1, "Harry Potter", "Griffendor", 4040), 60);
		employeeMap.put(new Employee(2, "Hamoini Gringer", "Griffendor", 2360), 34);
		employeeMap.put(new Employee(3, "Ronald Weesely", "Griffendor", 1820), 20);
		employeeMap.put(new Employee(4, "Draco Malfoy", "Slytherin", 4100), 100);
		employeeMap.put(new Employee(5, "Rubinus Hagrid", "Gate Keeper", 5009), 120);

		System.out.println(employeeMap);

		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println); // Ascending

		employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
				.forEach(System.out::println); // descending

		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	}
}
