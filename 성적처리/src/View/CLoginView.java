package View;

import java.util.Scanner;

import Entity.CMember;

public class CLoginView {
	
	public CMember login() {

		Scanner scanner = new Scanner(System.in);
		
		//input from keyboard
		CMember member = new CMember();
		System.out.println("����� ���̵� �Է��ϼ��� : ");
//		String userId = scanner.next();
		member.setUserID("userId");
		
		System.out.println("��й�ȣ�� �Է����ּ���\n");
//	    String password = scanner.next();
		member.setPassword("password");
		
		//close scanner
		scanner.close();
		return member;
	}

}
