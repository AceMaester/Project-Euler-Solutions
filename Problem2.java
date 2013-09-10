
public class Problem2 {

	
	private static int MAXNUM = 4000000;
	
	
	public static void main(String[] args) {
		
		
		int sum = 0;
		int  fib1 = 1;
		int fib2 = 2;
		int temp = 0;
		
		while(fib1 < MAXNUM){
			
			if(fib1 % 2 == 0){
				
				sum = sum + fib1;
				
				
				
			}
			
			temp = fib1 + fib2;
			fib1 = fib2;
			fib2 = temp;
			
			
			
		
		}
		
		System.out.println(sum);

	}

}
