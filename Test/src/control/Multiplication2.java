package control;

public class Multiplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for( int i = 1 ; i <= 9 ; i++) { 
			if ( i == 9) {
				for(int j = 1 ; j <= 9 ; j++) {
					System.out.print(i + " * " + j + " = " + i * j +"\t");
					System.out.println();
				}
			} else if( i % 2 != 0) {
		
				for(int j = 1 ; j <= 9 ; j++) {
					System.out.print(i + " * " + j + " = " + i * j +"\t");
					System.out.print((i + 1) + " * " + (j ) + " = " + (i + 1) * (j ) );
					System.out.println();
			
				}
			System.out.println();
			}
		}
	   
		/*for( int i =1 ; i <=9 ; i++) {
			int num = 9;
			System.out.println(num + " * " + i  + " = " + num*i );
		}*/
	
	}
	
	
	/*
	 * 1 2
	 * 3 4
	 * 5 6
	 * 7 8
	 * 9
	 */

}

 //조건문 쓰기  i =2 이면 print 쓰고 
 //  i=3이면 println