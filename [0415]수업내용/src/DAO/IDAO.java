package DAO;

import java.io.IOException;

import entity.CEntity;

public interface IDAO {
	public void connect(String name, String mode) throws IOException;
	public void disconnect() throws IOException;
	public CEntity read(CEntity entity, String ID);
	public CEntity readNext(CEntity entity);
	public void write(CEntity entity);
	public boolean hasNext();

}
