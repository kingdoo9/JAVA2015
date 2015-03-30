package ����ó��;

import Control.CGangjwaControl;
import Control.CGwamokControl;
import Control.CLoginControl;
import DAOs.DAO;
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
			DAO memberDAO = new DAO(); // Ű���忡�� �а�
			memberDAO.write(member, "member"); // ����Ϳ��� ����
			member = (CMember) memberDAO.read("member");
			
			// ���� ����
			CGwamokView gwamokView = new CGwamokView();
			CGwamok gwamok = gwamokView.getGwamok();	
			CGwamokControl gwamokControl = new CGwamokControl();
			gwamok = gwamokControl.processGwamok(gwamok);
			DAO gwamokDAO = new DAO();
			gwamokDAO.write(gwamok, "gwamok");
			gwamok = (CGwamok) gwamokDAO.read("gwamok"); // type casting ������ �ڽ� Ŭ������ ����.
			
			// ���� ����
			CGangjwaView GangjwaView = new CGangjwaView();
			CGangjwa Gangjwa = GangjwaView.getGangjwa();
			CGangjwaControl GangjwaControl = new CGangjwaControl();
			Gangjwa = GangjwaControl.processGangjwa(Gangjwa);
			DAO GangjwaDAO = new DAO();
			GangjwaDAO.write(Gangjwa, "gangjwa");
			Gangjwa = (CGangjwa) GangjwaDAO.read("gangjwa");
			
			

		}
}
