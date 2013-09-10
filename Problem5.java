
public class Problem5 {

	
	public static void main(String[] args) {
		int num = 1; 
		
		while(true){
			if(correct(num)){
				break;
			}
			
			num++;
		}

		System.out.println(num);
		
	}

	private static boolean correct(int num) {
		
		for(int i = 1; i < 20; i++){
			if(num%i != 0){
				return false;
			}
		}
		
		return true;
	}

}
