package arraytest;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		
		//배열 설정
		for(int i = 0 ; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100 + 1);
			
		}
		
		for(int i = 0 ; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(int j=0; j < a.length; j++) {
			for(int i = 0 + j; i < a.length; i++) {
				if(a[i] <= a[j]) {
				   int num = a[j];
				   a[j] = a[i];
				   a[i] = num;
				}	
			}
		}
		
		
		/*for(int i = 0; i < (a.length-1); i++) {
			if(a[i] <= a[0]) {
			   int num = a[0];
				a[0] = a[i];
				a[i] = num;
			}	
		}
		for(int i = 0 + 1; i < (a.length-1); i++) {
			if(a[i] <= a[1]) {
				int num = a[1];
				a[1] = a[i];
				a[i] = num;
			}	
		}
		
		for(int i = 0 + 2; i < (a.length-1); i++) {
			if(a[i] <= a[2]) {
				int num = a[2];
				a[2] = a[i];
				a[i] = num;
			}	
		} */
		
	
		
		for(int i = 0 ; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		
		
	}

}
