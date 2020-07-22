package variable;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 연산을 하시겠습니까? 1.+  2.- 3.* 4./");
		String cal = sc.next();
		System.out.println("number 1 을 입력해 주세요");
		int num1=sc.nextInt();
		System.out.println("number 2 을 입력해 주세요");
		int num2=sc.nextInt();
		
		if(cal.equals("+")) {
			System.out.println("결과는 " + num1 + " + " + num2 + " = " + (num1+num2));
		} else if (cal.equals("-")) {
			System.out.println("결과는 "  + num1 + " - " + num2 + " = " + (num1-num2));
		} else if (cal.equals("*")) {
			System.out.println("결과는 " + num1 + " * " + num2 + " = " + (num1*num2));
		} else if (cal.equals("/")) {
			System.out.println("결과는 " + num1 + " / " + num2 + " = " + (num1/(double)num2));
		}
		
		//System.out.println("??");
		
		/*switch (cal) {
		case "+" : 
			System.out.println("결과는 " + num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case "-" :
			System.out.println("결과는 "  + num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case "*" :
			System.out.println("결과는 " + num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case "/" :
			System.out.println("결과는 " + num1 + " / " + num2 + " = " + (num1/num2));
			break;
			
		}*/
			
		
	}

}
