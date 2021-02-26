package day4;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("나이 입력");
		int age = sc.nextInt();
		System.out.println("이메일 입력");
		String email = sc.next();
		Member m = new Member();
		m.setName(name);
		m.setAge(age);
		m.setEmail(email);
		System.out.println("등록된 정보\n"
				+ " [이름] "+m.getName()+"\n"
				+ " [나이] "+m.getAge()+"\n"
				+ " [이메일] "+m.getEmail());
	}
}
