package View;

//import java.util.Scanner;

import Entity.CMember;

public class CLoginView extends CView{
	
	public void login() {

//		Scanner scanner = new Scanner(System.in);
		
		//input from keyboard
		CMember member = new CMember();
//		String userId = scanner.next();
		member.setUserID("userId");
		
//	    String password = scanner.next();
		member.setPassword("password");
		
		//close scanner
//		scanner.close();
		member = (CMember) this.getControl().process(member);
	}

}
