package interview;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TableIntPredicate {
	public static void main(String[] args) {

		IntPredicate fun = argument -> argument % 2 == 0;

		IntStream stream = IntStream.range(1, 22);
		List<Integer> list = stream.filter(fun).boxed().collect(Collectors.toList());
		System.out.println(list);

	}
}
