package view;

import java.util.Scanner;

import valueObject.VLogin;

public class CLoginView extends CView {

	public CLoginView() {
		super("�α��� ȭ��");
		// TODO Auto-generated constructor stub
	}

	public void show(Scanner scanner){
	
		VLogin vLogin = new VLogin();
		//String userID = scanner.next();
		vLogin.setUserID("id5");
		
		//String password = scanner.next();
		vLogin.setPassword("pw5");
		
//		VUser vUser = (VUser) ((CLoginControl)this.getControl()).login(vLogin);
		System.out.println("login result : " + vLogin.getUserID());
	}
}
