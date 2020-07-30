package challenge;

import java.util.Scanner;

public class Baseball {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ball = 0;
		int strike = 0;
		int a[] = new int[4];
		//배열 설정
		for(int i = 0 ; i < a.length; i++) {
			
			a[i] = (int)(Math.random() * 10 );
			if(a[0] == 0) {
				i--;
			}
			
			for(int j = 0; j < i; j++) {
				if(a[i] == a[j]) {
					i--;
				}
			}
		
		}
	
		while (strike < 4) {
			strike = 0;
			ball = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			int total[] = new int[4];
			total[0] =   num / 1000 ; //천의자리
			total[1] = (num  % 1000) / 100 ; //백의자리
			total[2] = (num % 100) / 10;  //십의자리
			total[3] = (num % 10); //일의자리
			
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a.length; j++) {
					if(a[i] == total[j]) {
						ball++;
					}
				}
			}
			
			for(int i = 0; i < a.length; i++) {
					if(a[i] == total[i]) {
						strike++;
					}
				}
				
			System.out.print(strike + "S ");
			System.out.println(ball-strike + "B");
			if( ball == 0) {
				System.out.println("아웃입니다");
			}
		}
		
		System.out.print("홈런입니다");
		
		
	}	
	

}
