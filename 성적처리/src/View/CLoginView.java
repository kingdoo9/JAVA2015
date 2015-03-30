package View;

import java.util.Scanner;

import Entity.CMember;

public class CLoginView {
	
	public CMember login() {

		Scanner scanner = new Scanner(System.in);
		
		//input from keyboard
		CMember member = new CMember();
		System.out.println("사용자 아이디를 입력하세요 : ");
//		String userId = scanner.next();
		member.setUserID("userId");
		
		System.out.println("비밀번호를 입력해주세요\n");
//	    String password = scanner.next();
		member.setPassword("password");
		
		//close scanner
		scanner.close();
		return member;
	}

}
