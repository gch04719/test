package arraytest;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		//배열 설정
		for(int i = 0 ; i < a.length; i++) {
			
			a[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(a[i] == a[j]) {
					i--;
				}
			}
		}
		
	
		for(int i = 0 ; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	
	}

}
