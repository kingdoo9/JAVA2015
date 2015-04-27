package entity;

import java.io.BufferedWriter;
import java.io.Serializable;
import java.util.Scanner;

public class CUser extends CEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String password;
	private String name;

	public void setname(String name){this.name=name;}
	public String getname(){return this.name;}
	public void setPassword(String password){this.password=password;}
	public String getPassword(){return this.password;}


	public void read(Scanner scanner) {
		// TODO Auto-generated method stub
		ID = scanner.next();
		password = scanner.next();
		name = scanner.next();

	}

	public void write(BufferedWriter writer) {
		// TODO Auto-generated method stub
		
	}
}

