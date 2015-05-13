package DAOs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.CEntity;

public class MySQL implements IDAO{
	private final static String DRIVER = "com.mysql.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3306";
	private final static String ID = "root";
	private final static String PASSWORD = "mju12345";
	
	private Connection connection;
	private Statement statement;
	private ResultSet resultset;
	private String tableName;

	public MySQL() throws ClassNotFoundException{
		Class.forName(DRIVER);
		
	}
	@Override
	public void create() throws SQLException{
		connection = DriverManager.getConnection(URL, ID, PASSWORD);
		String sql = "grant all privileges on *.* to java@localhost " +
				"identified by 'mju12345' with grant option;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		statement.close();
	}


	@Override
	public void connect(String name) throws IOException, SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL, ID, PASSWORD);
		this.tableName = name;
		statement = connection.createStatement();
		resultset = statement.executeQuery("select* from "+this.tableName);
	}

	@Override
	public void disconnect() throws IOException, SQLException {
		// TODO Auto-generated method stub
		if(connection == null){
			return;
		}
		connection.close();
		statement.close();
		resultset.close();
	}

	@Override
	public CEntity read(CEntity entity, String ID) throws SQLException {
		// TODO Auto-generated method stub
		while(resultset.next()){
			entity.DBRead(resultset);
			if(entity.getID().equals(ID)){
				return entity;
			}
		}
		return null;
	}

	@Override
	public CEntity readNext(CEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(CEntity entity) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

}
