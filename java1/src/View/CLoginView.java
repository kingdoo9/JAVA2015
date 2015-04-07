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
		System.out.println("���̵� �Է��ϼ���.\n");
		String userId = scanner.next();
		System.out.println("��й�ȣ�� �Է��ϼ���.\n");
	    String password = scanner.next();
		
		//close scanner
		scanner.close();
		
		login_or_error = this.getControl().process(member, userId, password);
		
		switch(login_or_error){
		case 1 : System.out.println("ȯ���մϴ�.\n"); break;
		case 2 : System.out.println("�н����尡 Ʋ�Ƚ��ϴ�\n"); break;
		case 3 : System.out.println("�ش� ����� ���̵� �����ϴ�\n"); break;
		}
	}

}
