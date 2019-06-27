package javatechie.stream.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javatechie.stream.example.Employee;
import javatechie.stream.example.EmployeeDAO;

public class SortListDemo {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(41);
		numbers.add(34);
		numbers.add(400);
		numbers.add(14);

		System.out.println("====================== TRADITIONAL APPROACH =====================");
		Collections.sort(numbers); // this will sort in natural order (ascending order)
		Collections.reverse(numbers); // descending order
		System.out.println(numbers);

		System.out.println("====================== STREAM API =====================");
		numbers = new ArrayList<>();
		numbers.add(7);
		numbers.add(21);
		numbers.add(54);
		numbers.add(340);
		numbers.add(2);
		numbers.stream().sorted().forEach(t -> System.out.println(t));
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));

		List<Employee> employees = EmployeeDAO.getEmployees();
		/*
		 * Collections.sort(employees, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) { return (int)
		 * (o1.getSalary() - o2.getSalary()); } });
		 */

		// 1.
		// Collections.sort(employees, (e1, e2) -> (int) (e1.getSalary() -
		// e2.getSalary()));
		// System.out.println(employees);

		//2.
//		employees.stream().sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()))
//				.forEach(t -> System.out.println(t));

		// OR

		//3.
		// employees.stream().sorted(Comparator.comparing((emp ->
		// emp.getSalary()))).forEach(t -> System.out.println(t));

		// OR
		//4.
		employees.stream().sorted(Comparator.comparing((Employee::getName))).forEach(t -> System.out.println(t));
	}
}
