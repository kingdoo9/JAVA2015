package ����ó��;

import Control.CLoginControl;
import DAOs.IDAO;
import DAOs.ObjectDAO;
import DAOs.TextDAO;
import Entity.CMember;
import View.CLoginView;

public class CMain {

		public static void main(String[] args){
			// Model-View_controller Pattern : 3-Tiers	
			//�ּ� �߰�
			CLoginView loginView = new CLoginView();
			CMember member = loginView.login();	
			CLoginControl loginControl = new CLoginControl();
			member = loginControl.login(member); //��ȣȭ�� ������.
			IDAO memberDAO = new TextDAO(); // Ű���忡�� �а�  ...... objectDAO�ε� ���ư��� FileDAO�ε� ���ư����� ������.
			//entity�� ����Ŭ�󽺸� ���� ����
			//reflaction �� �Ἥ object�� ����Ÿ�������� 
//			memberDAO.write(member, "member"); // ����Ϳ��� ����
//			CMember member = new CMember();
			member = (CMember) memberDAO.read(member, "member.txt");

	

		}

}
		
