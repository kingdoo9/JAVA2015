package DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entity.CEntity;



public class TextDAO implements IDAO{
	private Scanner scanner;
	private BufferedWriter writer;
	private String mode;
	@Override
	public void connect(String name, String mode) throws IOException {
		// TODO Auto-generated method stub
		this.mode = mode;
		if(this.mode.equals("r")){
			this.scanner = new Scanner (new File(name));
		}else if(this.mode.equals("w")){
			this.writer = new BufferedWriter(new FileWriter(name, true));
		}else if( this.mode.equals("w+")){
			this.writer = new BufferedWriter(new FileWriter(name, false));

		}
	}
	
	@Override
	public void disconnect() throws IOException {
		// TODO Auto-generated method stub
		if(this.mode.equals("r")){
			this.scanner.close();
		}else{
			this.writer.close();
		}
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return scanner.hasNext();
	}
	
	@Override
	public CEntity readNext(CEntity entity) {
		// TODO Auto-generated method stub
		if(scanner.hasNext()){
			entity.read(scanner);
			return entity;
		}
		return null;
	}

	@Override
	public CEntity read(CEntity entity, String ID){
		while(scanner.hasNext()){
			entity.read(scanner);
			if(entity.getID().equals(ID))
				return entity;
		}
		return null;
	}
	
	 @Override
	public void write(CEntity entity)
	{
		entity.write(writer);
	}
	 


}
