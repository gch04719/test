package control;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		for(int i = 0 ; i <= 10 ; i++) {
			for( int j = 0; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		//int i;
		for(int i = 0 ; i <= 10 ; i++) {
			for( int j = 10 ; j >= i ; j--) {
				System.out.print(" ");
			}
				for( int n= 1 ; n <= 2 * i ; n++) {
					System.out.print("*");
				
				}
			
			System.out.println();
		}
		
		for(int i = 0 ; i <= 10 ; i++) {
			for( int j = 0 ; j <= i ; j++) {
				System.out.print(" ");
			}  
			 for(int k=0 ; k<2 ; k++) {
				for( int n= 10 ; i <= n-1 ; n--) {
					System.out.print("*");
				
				}
			 }
			System.out.println();
		} 	
		 	
		

	}

}
