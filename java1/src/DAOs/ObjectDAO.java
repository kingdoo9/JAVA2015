package DAOs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Entity.CEntity;

public class ObjectDAO implements IDAO {
	public CEntity[] read(CEntity[] entity, String fileName) {
		Object object = null;
		try {
			ObjectInputStream In;
			In = new ObjectInputStream(new FileInputStream(fileName));
			object = In.readObject();
			In.close();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return (CEntity[])object;
	}
	public void write(Object object, String fileName) {
			
		//serialize
		try {
			ObjectOutputStream Out  = 
					new ObjectOutputStream(new FileOutputStream(fileName));
			Out.writeObject(object);
			Out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
