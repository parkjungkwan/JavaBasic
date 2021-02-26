package day1;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("계산기");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next(); // + - * /
		int c = sc.nextInt();
		int result = 0; // 초기화에서 사용하는 디폴트값
		if(b.equals("+")) { result = a + c;}
		if(b.equals("-")) { result = a - c;}
		if(b.equals("*")) { result = a * c;}
		if(b.equals("/")) { result = a / c;}
		System.out.println(a + b + c +"="+result);
		 
	}
}





