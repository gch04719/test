package arraytest;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int max;
		int min;
		
		int a[] = new int[10];
		
		//배열 설정
		for(int i = 0 ; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100 + 1);
		}
		
		//총합
		for(int i =0; i<a.length; i++) {
			sum = sum + a[i];
		}
		
		//최대 최소
		
		max = a[0];
		min = a[0];
		
		for(int i = 0 ; i < a.length ; i++) {
			
			if(max <= a[i]) {
				max = a[i];
				
			}
			
			if(a[i] <= min) {
				min = a[i];
				
			}
		}
			
			
		
		
		for(int i = 0 ; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("총합은 " + sum + "입니다.");
		System.out.println("평균은 " + (double)sum/a.length + "입니다.");
		System.out.println(max);
		System.out.println(min);
		
		
		//int c = (int)(Math.random() * 100 + 1);
	
	}

}
