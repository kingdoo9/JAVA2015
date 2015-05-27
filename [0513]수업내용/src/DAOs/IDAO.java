package DAOs;

import java.io.IOException;
import java.sql.SQLException;

import entity.CEntity;

public interface IDAO {
	public void connect(String name) throws IOException, SQLException;
	public void disconnect() throws IOException, SQLException;
	
	public void createAccount() throws SQLException;
	public void createDB() throws SQLException; 
	public void createTable() throws Exception;//create Account�� Directory�� ���� �ȿ� ���� ������ ������ ����
	public void insertData() throws Exception;//SQLException  �� �׳�  Exception���� ����,
	public void updataData() throws Exception;//�������̽��� �Ȱ����ؼ� File�� ������ �Ͷ�.
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
