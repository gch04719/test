package arraytest;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int max;
		int min;
		
		int a[] = new int[10];
		
		//�迭 ����
		for(int i = 0 ; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100 + 1);
		}
		
		//����
		for(int i =0; i<a.length; i++) {
			sum = sum + a[i];
		}
		
		//�ִ� �ּ�
		
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
		System.out.println("������ " + sum + "�Դϴ�.");
		System.out.println("����� " + (double)sum/a.length + "�Դϴ�.");
		System.out.println(max);
		System.out.println(min);
		
		
		//int c = (int)(Math.random() * 100 + 1);
	
	}

}
