package day4;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� �Է�");
		String name = sc.next();
		System.out.println("���� �Է�");
		int age = sc.nextInt();
		System.out.println("�̸��� �Է�");
		String email = sc.next();
		Member m = new Member();
		m.setName(name);
		m.setAge(age);
		m.setEmail(email);
		System.out.println("��ϵ� ����\n"
				+ " [�̸�] "+m.getName()+"\n"
				+ " [����] "+m.getAge()+"\n"
				+ " [�̸���] "+m.getEmail());
	}
}
