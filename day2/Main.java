package day2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("######### ȸ������ #########");
		join();
		
	}
	public static void join() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" **** ȸ������ â ****");
		final String idInput = "���̵� �Է�";
		System.out.println(idInput);
		String id = sc.next();
		System.out.println("��� �Է�");
		String pw = sc.next();
		User u = new User();
		u.setId(id);
		u.setPw(pw);
		System.out.println("[���� ����] ID: "+u.getId()+", PW: "+u.getPw());
		login(u); 
	}
	public static void login(User u) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" **** �α��� â **** ");
		// System.out.println("���̵� �Է�");
		// System.out.println("��� �Է�");
		
		String id = u.getId();
		String pw = u.getPw();
		System.out.println("[���� ����] ID: "+id+", PW: "+pw);
	}
}
