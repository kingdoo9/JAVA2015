package view;

import java.io.IOException;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView{
	public VUser login() throws UserIDNotFoundException, 
								PasswordNotMatchException
	{
//		Scanner scanner = new Scanner(System.in);
		VLogin vLogin = new VLogin();
//		String userID = scanner.next();
		vLogin.setUserID("id5");
		
//		String password = scanner.next();
		vLogin.setPassword("pw5");
		
		try {
			VUser vUser;
			vUser = (VUser) ((CLoginControl)this.getControl()).login(vLogin);
			System.out.println("login result : " + vUser.getname());
			return vUser;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return null;
	}
}
