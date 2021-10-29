package interview;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNUmberUsingIntPredicate {
	public static void main(String[] args) {
		
	IntStream range=IntStream.range(1, 20);
		
		
	}
	
	public static boolean isPrime(int i) {
		IntPredicate isDivisible=index->i%index==0;
		return i>2?(!IntStream.range(2, i).anyMatch(isDivisible)):true;
	}

}
