package view;

import java.io.IOException;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView{
	public VUser login() throws UserIDNotFoundException, 
								PasswordNotMatchException, IOException
	{
//		Scanner scanner = new Scanner(System.in);
		VLogin vLogin = new VLogin();
//		String userID = scanner.next();
		vLogin.setUserID("id5");
		
//		String password = scanner.next();
		vLogin.setPassword("pw5");
		
		VUser vUser = (VUser) ((CLoginControl)this.getControl()).login(vLogin);
		System.out.println("login result : " + vUser.getname());

		return vUser;
	}
}
