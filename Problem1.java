import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Problem1 {

	public static int MAX_NUM = 20;
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) {
		
    
	while(true){	
    System.out.print("Please enter a positive integer: ");
    MAX_NUM = Integer.parseInt(readInput());
    //System.out.println("");
		
		
		
		
	 System.out.print("Sum of all multiples of 3 or 5 below " + MAX_NUM + " is: " );
	 long sum = returnSum();
		
	 System.out.println(sum);
	}
		
	}

	public static long returnSum(){
		long sum = 0;
		
		for(long i= 0; i < MAX_NUM; i++){
			
			if(i % 3 == 0 || i % 5 == 0){
				sum = sum + i;
			}
			
		}
		
		
		
		
		
		return sum;
	}
	
	 public static String readInput() {
		  try {
		   String input = in.readLine();
		   
		    //System.out.println(input);
		   
		   return input;
		  } catch (IOException e) {
		   System.err.println("An error has occurred in the Keyboard.readInput() method.");
		   e.printStackTrace();
		   System.exit(-1);
		  }
		  return null;
		 
		}
	
}
