package arraytest;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		//�迭 ����
		for(int i = 0 ; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100 + 1);
		}
		
		
		for(int i = 0 ; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		
		//�ݴ�� 
		for(int i = 0 ; i < (a.length / 2); i++) {
			int num = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = num;
		}
		
		
		for(int i = 0 ; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
