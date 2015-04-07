package DAOs;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

import Entity.CEntity;
import Entity.CMember;

public class TextDAO implements IDAO{  //file을 open 하고 쓰는것!
	//

	@Override
	public CEntity[] read(CEntity[] entity, String fileName) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner (new File(fileName));
				for(int i = 0; i<10; i++){
					entity[i] = new CMember();
					entity[i].read(scanner);
				}
				return entity;
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void write(Object object, String fileName) {
		// TODO Auto-generated method stub
		Field[] fields = object.getClass().getDeclaredFields();
		
	}

}
