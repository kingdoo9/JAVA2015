package DAOs;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

import Entity.CGwamok;

public class CGwamokDAO {
	public CGwamok read() { return null; }
	public void write(CGwamok gwamok){
		
		System.out.println("����ID : " + gwamok.getID()+"\n");
		System.out.println("�����: " + gwamok.getName()+"\n");
		
		//serialize
		try {
			ObjectOutputStream Out  = new ObjectOutputStream(new FileOutputStream("testOut"));
			Out.writeObject(gwamok);
			Out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
