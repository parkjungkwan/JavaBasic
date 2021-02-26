package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("로그인 창");// ID 입력
	
		Scanner sc = new Scanner(System.in);

		System.out.println("ID를 입력하시오:");
		String id = sc.next(); // 맞는 아이디 kim
		System.out.println("패스워드를 입력하시오:");
		String pw = sc.next(); // 맞는 비번 1
		final String WRONG = "틀립니다";
		
		
		if (id.equals("kim") && pw.equals("1")) {
			System.out.println("로그인 성공");
		} else if (!id.equals("kim") && pw.equals("1")) {
			System.out.println("ID가 " + WRONG);
		} else if (id.equals("kim") && !pw.equals("1")) {
			System.out.println("ID가 "+ WRONG);
		} else {
			System.out.println("ID PW "+ WRONG);
		}

	}
}
