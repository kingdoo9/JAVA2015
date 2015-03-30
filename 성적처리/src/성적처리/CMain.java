package ����ó��;

import Control.CGangjwaControl;
import Control.CGwamokControl;
import Control.CLoginControl;
import DAOs.CGangjwaDAO;
import DAOs.CGwamokDAO;
import DAOs.CMemberDAO;
import Entity.CGangjwa;
import Entity.CGwamok;
import Entity.CMember;
import View.CGangjwaView;
import View.CGwamokView;
import View.CLoginView;

public class CMain {

		public static void main(String[] args){
			// Model-View_controller Pattern : 3-Tiers	
			//hh
			CLoginView loginView = new CLoginView();
			CMember member = loginView.login();	
			CLoginControl loginControl = new CLoginControl();
			member = loginControl.login(member); //��ȣȭ�� ������.
			CMemberDAO memberDAO = new CMemberDAO(); // Ű���忡�� �а�
			memberDAO.write(member); // ����Ϳ��� ����
			
			// ���� ����
			CGwamokView gwamokView = new CGwamokView();
			CGwamok gwamok = gwamokView.getGwamok();
			CGwamokControl gwamokControl = new CGwamokControl();
			gwamok = gwamokControl.processGwamok(gwamok);
			CGwamokDAO gwamokDAO = new CGwamokDAO();
			gwamokDAO.write(gwamok);
			
			// ���� ����
			CGangjwaView GangjwaView = new CGangjwaView();
			CGangjwa Gangjwa = GangjwaView.getGangjwa();
			CGangjwaControl GangjwaControl = new CGangjwaControl();
			Gangjwa = GangjwaControl.processGangjwa(Gangjwa);
			CGangjwaDAO GangjwaDAO = new CGangjwaDAO();
			GangjwaDAO.write(Gangjwa);
			
			

		}
}
