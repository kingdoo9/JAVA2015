package DAOs;

import java.io.IOException;
import java.sql.SQLException;

import entity.CEntity;

public interface IDAO {
	public void connect(String name) throws IOException, SQLException;
	public void disconnect() throws IOException, SQLException;
	
	public void createAccount() throws SQLException;
	public void createDB() throws SQLException; 
	public void createTable() throws Exception;//create Account는 Directory를 만들어서 안에 여러 파일이 들어가도록 설계
	public void insertData() throws Exception;//SQLException  을 그냥  Exception으로 빼고,
	public void updataData() throws Exception;//인터페이스는 똑같이해서 File을 구현해 와라.
	public void selectData() throws Exception;
	public void deleteData() throws Exception;
	public void droptable() throws Exception;
	public void dropDB() throws SQLException;
	public void dropAccount() throws SQLException;
	
	public CEntity read(CEntity entity, String ID) throws SQLException;
	public CEntity readNext(CEntity entity);
	public void write(CEntity entity) throws IOException;
	public boolean hasNext();
}
