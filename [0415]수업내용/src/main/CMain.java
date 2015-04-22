package main;

import view.CLoginView;
import view.CSugnagView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CLoginControl;
import control.CSugangControl;
import entity.VUser;
import view.CExceptionView;

public class CMain {
	public static void main(String[] arg){

		//start program
		try {
			//component
			CLoginView loginView = new CLoginView();	
			CLoginControl loginControl = new CLoginControl();
			IDAO dao = new TextDAO();
			//association
			loginView.setControl(loginControl);
			loginControl.setDao(dao);
			//start
			VUser vUser = loginView.login();
			
			//component
			CSugnagView sugangView = new CSugnagView();
			CSugangControl sugangControl = new CSugangControl();
			//association
			sugangView.setControl(sugangControl);
			sugangControl.setDao(dao);
			//start
			sugangView.sugangSincheong(vUser);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}

	}
}
