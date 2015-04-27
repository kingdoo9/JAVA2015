package control;

import java.io.IOException;

import entity.CUser;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;
public class CLoginControl extends CControl{
	
	public VUser login(VLogin vLogin) throws UserIDNotFoundException  //vLogin = input, Vuser = output
, PasswordNotMatchException, IOException
	{
		VUser vUser = new VUser();

				CUser user = new CUser();

				this.getDao().connect("member.txt","r");
				user = (CUser)this.getDao().read(user, vLogin.getUserID());
				this.getDao().disconnect();

				//result  정리 필요.!!!!!!!!!!!!!!!!!!!!!!!
				if (user == null) throw new UserIDNotFoundException();{
				}
				if(!user.getPassword().equals(vLogin.getPassword()))
					throw new PasswordNotMatchException(); {
				}
				//result  정리 필요.!!!!!!!!!!!!!!!!!!!!!!!
				vUser.setname(user.getname());
				vUser.setUserID(user.getID());
				return vUser;


	}
	
	
}
