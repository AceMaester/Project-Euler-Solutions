
public class Problem3 {

	
	
	
	
	public static void main(String[] args) {
		
	long largeNum = 600851475143L;
	int root = (int) Math.sqrt(largeNum);
	int prime = 2;
	
	int largestPrime = 0;
	
	
	while(prime < (int) Math.sqrt(largeNum)){
		
		if(largeNum % prime == 0){
			largestPrime = prime;
			largeNum = largeNum / prime;
		}
		
		
		
		prime = nextPrime(prime);
		
		
		
	}

	System.out.println(largeNum);
	System.out.println(prime);
	
	
	
	
		
		
		
		
		

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
			
			System.out.println(num);
			return num;
		}
		
		count = 0;
		
		num++;
		
		}
		
		
		
		
	}

}
