package mlone;

public class ProfitLoss {
	
	public static void main(String[] args) {
		
		int SE=1200;
		int CP=300;
		
		
		
		if(SE>CP) {
			int PR=SE-CP;
			System.out.println("Total profit is :"+PR);
		}
		else {
			int LS=CP-SE;
			System.out.println("Total Loss is :"+LS);
		}
		
	}

}
