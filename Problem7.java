
public class Problem7 {

	
	public static void main(String[] args) {
		
		int prime = 2;
	
		for(int i=1; i < 10002; i++){
			
		prime = nextPrime(prime);
		
		System.out.println(i + ": " + prime);
			
		}
		
		
		
		

	}
	
private static int nextPrime(int prime) {
		
		
		
		int num = prime + 1;
		
		int count = 0;
		
		while(true){
		
		
		
		
		for(int i = 2; i < num; i++){
			
			if(num % i == 0){
				count++;
			}
			
			
			
		}
		
		if(count == 0){
			
			
			return num;
		}
		
		count = 0;
		
		num++;
		
		}
		
		
		
		
	}

}
