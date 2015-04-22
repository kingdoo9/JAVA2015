package DAO;

import java.io.FileNotFoundException;
import java.util.Vector;

import entity.CEntity;

public interface IDAO {
	public void connect(String name) throws FileNotFoundException;
	public void disconnect();
	public CEntity read(CEntity entity, String ID);
	public Vector<CEntity> readAll();
	public void write(CEntity entity);
}
