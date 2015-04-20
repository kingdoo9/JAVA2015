package main;

import view.CExceptionView;
import view.CLoginView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CLoginControl;

public class CMain {
	public static void main(String[] arg){

		//start program
		try {
			CLoginView loginView = new CLoginView();	
			CLoginControl loginControl = new CLoginControl();
			IDAO dao = new TextDAO();

			loginView.setControl(loginControl);
			loginControl.setDao(dao);
			
			loginView.login();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}

	}
}
