package main;

import valueObject.VUser;
import view.CExceptionView;
import view.CMainView;
import view.CSugangView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CGangjwaControl;
import control.CLoginControl;

public class CMain {
	public static void main(String[] arg){

		//start program
		try {
			/*
			//component
	
			CLoginControl loginControl = new CLoginControl();
			IDAO dao = new TextDAO();
			//association
			mainView.setControl(loginControl);
			loginControl.setDao(dao);
			//start

			
			//component
			CSugangView sugangView = new CSugangView();
			CGangjwaControl sugangControl = new CGangjwaControl();
			//association
			sugangView.setControl(sugangControl);
			sugangControl.setDao(dao);
			//start
			
			*/
			CMainView mainView = new CMainView();
			mainView.show();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}

	}
}
