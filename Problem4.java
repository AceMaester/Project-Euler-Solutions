
public class Problem4 {

	
	public static void main(String[] args) {
		
		
	int product = 0;	
	int largestP = 0;

	for(int i = 100; i<999; i++){
		for(int j = 100; j<999; j++){
			
		product = i*j;
		
		
		
		if(product > largestP){
			if(isPalindrome("" + product)) {
				largestP = product;
				System.out.println(product);
			}
		}
			
			
		}
	}
	
	System.out.print(largestP);
		
		
	}

	private static boolean isPalindrome(String num) {
		
		String backwards = "";
		
		for(int i = 0; i < num.length(); i++){
			backwards = backwards + num.charAt(num.length() - 1 - i);
		}
		
		//System.out.println(backwards);
		if(backwards.equals(num)){
			return true;
		}else{
		
		return false;
		}
	}

	
	
	
}
