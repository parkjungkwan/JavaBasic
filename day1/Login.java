package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("�α��� â");// ID �Է�
	
		Scanner sc = new Scanner(System.in);

		System.out.println("ID�� �Է��Ͻÿ�:");
		String id = sc.next(); // �´� ���̵� kim
		System.out.println("�н����带 �Է��Ͻÿ�:");
		String pw = sc.next(); // �´� ��� 1
		final String WRONG = "Ʋ���ϴ�";
		
		
		if (id.equals("kim") && pw.equals("1")) {
			System.out.println("�α��� ����");
		} else if (!id.equals("kim") && pw.equals("1")) {
			System.out.println("ID�� " + WRONG);
		} else if (id.equals("kim") && !pw.equals("1")) {
			System.out.println("ID�� "+ WRONG);
		} else {
			System.out.println("ID PW "+ WRONG);
		}

	}
}
