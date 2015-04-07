package Control;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import DAOs.IDAO;
import Entity.CEntity;
import Entity.CMember;


public class CControl {
	Method[] methods = CMember.class.getMethods();
	Method getUserID = null , getPassword = null;
	//association
	int login_or_error=0;
	private IDAO dao;
	public IDAO getDao() {return dao;}
	public void setDao(IDAO dao) {this.dao = dao;}

	public int process(CEntity[] entity, String scanID, String scanPassword) {
		// TODO Auto-generated method stub
		
		for(Method m : methods ) {
			  if("getUserID".equals(m.getName())) {getUserID = m;}
			  else if("getPassword".equals(m.getName())) {getPassword = m;}
		}
		
		entity = dao.read(entity, "member.txt");
		for(int i = 0; i<10; i++){
			try {
				if(getUserID.invoke(entity[i]).equals(scanID)){
					if(getPassword.invoke(entity[i]).equals(scanPassword)){ login_or_error = 1;
					break;
					}
					else{ login_or_error = 2; break;}
				}else login_or_error = 3;
			} catch (IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
		return login_or_error;
	}
}
