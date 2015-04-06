package ����ó��;

import Control.CGangjwaControl;
import Control.CGwamokControl;
import Control.CLoginControl;
import DAOs.IDAO;
import DAOs.ObjectDAO;
import DAOs.TextDAO;
import Entity.CGangjwa;
import Entity.CGwamok;
import Entity.CMember;
import View.CGangjwaView;
import View.CGwamokView;
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
			member = (CMember) memberDAO.read(member.getClass(), "member.txt");
			
			// ���� ����
			CGwamokView gwamokView = new CGwamokView();
			CGwamok gwamok = gwamokView.getGwamok();	
/*
			CGwamokControl gwamokControl = new CGwamokControl();
			gwamok = gwamokControl.processGwamok(gwamok);
			IDAO gwamokDAO = new ObjectDAO();
			gwamokDAO.write(gwamok, "gwamok");
			gwamok = (CGwamok) gwamokDAO.read("gwamok"); // type casting ������ �ڽ� Ŭ������ ����.
			
			// ���� ����
			CGangjwaView GangjwaView = new CGangjwaView();
			CGangjwa Gangjwa = GangjwaView.getGangjwa();
			CGangjwaControl GangjwaControl = new CGangjwaControl();
			Gangjwa = GangjwaControl.processGangjwa(Gangjwa);
			IDAO GangjwaDAO = new ObjectDAO();
			GangjwaDAO.write(Gangjwa, "gangjwa");
			Gangjwa = (CGangjwa) GangjwaDAO.read("gangjwa");
*/			
			

		}

}
		
