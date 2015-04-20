package control;

import java.io.FileNotFoundException;
import entity.CUser;
import entity.VLogin;
import entity.VUser;
import entity.VUser.ELoginResult;
public class CLoginControl extends CControl{
	
	public VUser login(VLogin vLogin)  //vLogin = input, Vuser = output
	{
		VUser vUser = new VUser();

			try {
				CUser user = new CUser();

				this.getDao().connect("member.txt");
				user = (CUser)this.getDao().read(user, vLogin.getUserID());
				this.getDao().disconnect();

				//result  정리 필요.!!!!!!!!!!!!!!!!!!!!!!!
				if (user == null){
					vUser.seteLoginresult(ELoginResult.idError);
					return vUser;
				}
				if(!user.getPassword().equals(vLogin.getPassword())){
					vUser.seteLoginresult(ELoginResult.passwordError);
					return vUser;
				}
				vUser.seteLoginresult(ELoginResult.success);
				//result  정리 필요.!!!!!!!!!!!!!!!!!!!!!!!
				vUser.setname(user.getname());
				vUser.setUserID(user.getID());
				return vUser;

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				vUser.seteLoginresult(ELoginResult.fileNotFound);
				return vUser;
			}

	}
	
	
}
