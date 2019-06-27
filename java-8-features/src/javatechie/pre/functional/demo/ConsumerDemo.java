package javatechie.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo /* implements Consumer<Integer> */ {

//	@Override
//	public void accept(Integer t) {
//		System.out.println("Result : " + t);
//	}

	public static void main(String[] args) {

		////////////////// Lambda Expression /////////////////////
		Consumer<Integer> consumer = t -> System.out.println("Result : " + t);
		consumer.accept(5);
		
		
		List<Integer> numbers = Arrays.asList(10,20,30);
		
		numbers.stream().forEach(t -> System.out.println("Result : " + t));
	}

}
