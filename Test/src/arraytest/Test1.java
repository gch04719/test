package arraytest;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int a[] = new int[15];
		int b[] = {1,2,3};
		a.toString();
		
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		System.out.println(Arrays.toString(b));
		for(int i = 0; i < a.length; i++) {
			a[i] = i;
			System.out.println(a[i]);
		}
		
		
		
	}

}
