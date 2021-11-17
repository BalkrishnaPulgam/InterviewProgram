
public class LeftTrianglePascals {
	
	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=2*(num-i);j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=num-1;i++) {
			for(int j=1;j<=2*i;j++) {
				System.out.print(" ");
			}
			for(int k=num-1;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
				
	}

}
