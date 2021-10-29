package interview;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*without loop print 1 to 100*/

public class IntPredicateEx {

	public static void main(String[] args) {

		IntPredicate fun = argument -> argument % 5 == 0;

		IntStream stream = IntStream.range(1, 55);

		IntStream list = stream.filter(fun);
		
		list.forEach(System.out::println);
		
		

		// IntStream.range(1, 101).forEach(System.out::println);

	}
}
