package entity;


public class VUser {


	public static enum ELoginResult { success, idError, passwordError, fileNotFound };
	private ELoginResult eLoginresult;
	private String userID;
	private String name;
	
	public void setUserID(String userID){this.userID=userID;}
	public String getUserID(){return this.userID;}
	public void setname(String name){this.name=name;}
	public String getname(){return this.name;}

	public ELoginResult geteLoginresult() {return eLoginresult;}
	public void seteLoginresult(ELoginResult eLoginresult) {this.eLoginresult = eLoginresult;}
}
