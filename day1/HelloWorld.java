package day1;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("����");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next(); // + - * /
		int c = sc.nextInt();
		int result = 0; // �ʱ�ȭ���� ����ϴ� ����Ʈ��
		if(b.equals("+")) { result = a + c;}
		if(b.equals("-")) { result = a - c;}
		if(b.equals("*")) { result = a * c;}
		if(b.equals("/")) { result = a / c;}
		System.out.println(a + b + c +"="+result);
		 
	}
}





