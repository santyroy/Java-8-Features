package javatechie.stream.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Harry Potter", "Griffendor", 4040));
		employees.add(new Employee(2, "Hamoini Gringer", "Griffendor", 2360));
		employees.add(new Employee(3, "Ronald Weesely", "Griffendor", 1820));
		employees.add(new Employee(4, "Draco Malfoy", "Slytherin", 4100));
		employees.add(new Employee(5, "Rubinus Hagrid", "Gate Keeper", 5009));
		return employees;
	}
}
