package Entity;

import java.io.Serializable;

//Entity Class or value Class
public class CMember implements Serializable{

	private static final long serialVersionUID = 1L;
	private String userID, password;//�̸�, �ּ�, �ֹι�ȣ.��� attributes

	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

}

