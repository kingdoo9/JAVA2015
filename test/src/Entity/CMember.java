package Entity;

import java.io.Serializable;
import java.util.Scanner;

//Entity Class or value Class
public class CMember extends CEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	private String userID, password;//이름, 주소, 주민번호.등등 attributes

	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

	public void read(Scanner scanner) {
		userID = scanner.next();
		password = scanner.next();
	};
	
	public void write() {
		
	};
}

