package javatechie.stream.example;

import java.util.List;
import java.util.stream.Collectors;

/*
 * If salary greater than 3000 then pay tax
 */
public class TaxService {

	public static List<Employee> evaluateTaxUsers(String typeOfUser) {
		
//		if (typeOfUser.equalsIgnoreCase("tax")) {
//			return EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() >= 3000)
//					.collect(Collectors.toList());
//		} else {
//			return EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() < 3000)
//					.collect(Collectors.toList());
//		}
		
		// OR USING TERNARY OPERATOR
		
		return (typeOfUser.equalsIgnoreCase("tax")) ? 
				EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() >= 3000).collect(Collectors.toList()) 
				:
				EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() < 3000).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println("TAX");
		for (Employee emp : evaluateTaxUsers("tax")) {
			System.out.println(emp);
		}

		System.out.println("NON TAX");
		for (Employee emp : evaluateTaxUsers("non tax")) {
			System.out.println(emp);
		}
	}
}
