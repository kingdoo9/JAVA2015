package DAOs;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

import Entity.CEntity;

public class TextDAO implements IDAO{  //file을 open 하고 쓰는것!
	//

	@Override
	public Object read(CEntity entity, String fileName) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner (new File(fileName));
				entity.read(scanner);
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
