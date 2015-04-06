package 성적처리;

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
			//주석 추가
			CLoginView loginView = new CLoginView();
			CMember member = loginView.login();	
			CLoginControl loginControl = new CLoginControl();
			member = loginControl.login(member); //암호화를 시켜줌.
			IDAO memberDAO = new TextDAO(); // 키보드에서 읽고  ...... objectDAO로도 돌아가고 FileDAO로도 돌아가도록 만들자.
			//entity에 수퍼클라스를 만들어서 강자
			//reflaction 을 써서 object가 무슨타입인지를 
//			memberDAO.write(member, "member"); // 모니터에서 쓴다
//			CMember member = new CMember();
			member = (CMember) memberDAO.read(member.getClass(), "member.txt");
			
			// 과목 개설
			CGwamokView gwamokView = new CGwamokView();
			CGwamok gwamok = gwamokView.getGwamok();	
/*
			CGwamokControl gwamokControl = new CGwamokControl();
			gwamok = gwamokControl.processGwamok(gwamok);
			IDAO gwamokDAO = new ObjectDAO();
			gwamokDAO.write(gwamok, "gwamok");
			gwamok = (CGwamok) gwamokDAO.read("gwamok"); // type casting 강제로 자식 클래스로 변경.
			
			// 강좌 개설
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
		
