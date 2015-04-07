package View;

//import java.util.Scanner;

import java.util.Scanner;

import Entity.CMember;

public class CLoginView extends CView{
	
	public void login() {
		int login_or_error;
		Scanner scanner = new Scanner(System.in);
		
		//input from keyboard
		CMember[] member = new CMember[10];
		System.out.println("아이디를 입력하세요.\n");
		String userId = scanner.next();
		System.out.println("비밀번호를 입력하세요.\n");
	    String password = scanner.next();
		
		//close scanner
		scanner.close();
		
		login_or_error = this.getControl().process(member, userId, password);
		
		switch(login_or_error){
		case 1 : System.out.println("환영합니다.\n"); break;
		case 2 : System.out.println("패스워드가 틀렸습니다\n"); break;
		case 3 : System.out.println("해당 사용자 아이디가 없습니다\n"); break;
		}
	}

}
