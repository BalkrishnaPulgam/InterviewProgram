package interview;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int num=123;
		
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		
		sb.reverse();
		
		System.out.println(sb);
		
		
		Integer ReverseNum=Integer.parseInt(String.valueOf(sb));
		
		System.out.println(ReverseNum);

	}
}
