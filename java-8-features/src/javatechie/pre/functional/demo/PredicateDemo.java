package javatechie.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo /* implements Predicate<Integer> */ {

//	@Override
//	public boolean test(Integer t) {
//		return t % 2 == 0;
//	}

	public static void main(String[] args) {

		Predicate<Integer> predicate = t -> t % 2 == 0;
		System.out.println("isEven : " + predicate.test(4));
		
		
		List<Integer> numbers = Arrays.asList(30, 25, 46, 81);
		numbers.stream().filter(predicate).forEach(t -> System.out.println(t + " is even."));
	}

}
