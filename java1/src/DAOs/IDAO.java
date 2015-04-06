package DAOs;

import Entity.CEntity;

public interface IDAO {

	public CEntity read(CEntity entity, String fileName);
	public void write(Object object, String fileName);
}
