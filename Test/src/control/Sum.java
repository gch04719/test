package control;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1 ; i <= 1000 ; i++) {
			sum += i ;
			
		}
		System.out.println(sum);
		
		sum = 0;
		
		int i = 1;
		while(true)
		{
			sum += i;
			i++;
			if(i > 1000) {
				break;
			}
		}
		System.out.println(sum);
		
		
	}
}
