package main;

import java.sql.SQLException;

import view.CLoginView;
import DAOs.IDAO;
import DAOs.MySQL;
import DAOs.TextDAO;
import control.CLoginControl;
import entity.VUser;

public class CMain {

	public static void main(String[] args){
		IDAO dao;
//		try {
			dao = new TextDAO();
			try {
//				dao.createAccount();
//				dao.createDB();
				dao.createTable();
				dao.insertData();
				dao.updataData();
				dao.selectData();
				dao.deleteData();
				dao.droptable();
//				dao.dropDB();
//				dao.dropAccount();
			} catch ( Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
		

		
/*		
		try {
			dao = new MySQL();
		// components
		CLoginView loginView = new CLoginView();
		CLoginControl  loginControl = new CLoginControl();
		// association
		loginView.setControl(loginControl);
		loginControl.setDao(dao);
		// start
			VUser vUser = loginView.login();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	}
}
