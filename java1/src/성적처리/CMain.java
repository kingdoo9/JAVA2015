package 己利贸府;

import Control.CLoginControl;
import DAOs.IDAO;
import DAOs.ObjectDAO;
import DAOs.TextDAO;
import Entity.CMember;
import View.CLoginView;

public class CMain {

		public static void main(String[] args){
			//create object
			CLoginView loginView = new CLoginView();	
			CLoginControl loginControl = new CLoginControl();
			IDAO dao = new TextDAO();
	
			//associates
			loginView.setControl(loginControl);
			loginControl.setDao(dao);
			
			//start login
			loginView.login();

			
		}

}
		
