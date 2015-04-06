package 성적처리;

import Control.CLoginControl;
import DAOs.IDAO;
import DAOs.ObjectDAO;
import DAOs.TextDAO;
import Entity.CMember;
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
			member = (CMember) memberDAO.read(member, "member.txt");

	

		}

}
		
