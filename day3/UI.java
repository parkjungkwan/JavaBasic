package day3;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȭ��ȣ �Է�");
		String ph = sc.next();
		System.out.println("���� �Է�");
		String msg = sc.next();
		System.out.println("�Է��� ���� : ��ȭ��ȣ ["+ph+"] ���� ["+msg+"]");
		System.out.println("���۹�ư Ŭ��");
		Kakao k = new Kakao();
		k.setPh(ph);
		k.setMsg(msg);
		System.out.println("���� ���� : ��ȭ��ȣ ["+k.getPh()+"] ���� ["+k.getMsg()+"]");
		
		
	}
}
