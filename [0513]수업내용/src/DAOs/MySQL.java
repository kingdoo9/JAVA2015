package DAOs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import entity.CEntity;

public class MySQL implements IDAO{
	private final static String DRIVER = "com.mysql.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3306/javalms";
	private final static String ID = "java";
	private final static String PASSWORD = "mju12345";
	
	private Connection connection;
	private Statement statement;
	private PreparedStatement pStatement;
	private ResultSet resultset;
	private String tableName;

	public MySQL() throws ClassNotFoundException{
		Class.forName(DRIVER);
		
	}
	@Override
	public void createAccount() throws SQLException{
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/",
				"root", "mju12345");
		String sql = "grant all privileges on *.* to java@localhost " +
				"identified by 'mju12345' with grant option;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}

	@Override
	public void createDB() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/",
				ID, PASSWORD);
		String sql = "create database javalms;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}
	@Override
	public void createTable() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL,
				ID, PASSWORD);
		String sql = "CREATE TABLE user (ID varchar(10) NOT NULL,Password varchar(10) not null,name varchar(10) not null,PRIMARY KEY (ID));";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}
	@Override
	public void insertData() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL,
				ID, PASSWORD);
		String sql = "insert into user (id, password, name) "
				+ "values (?, ?, ?);";
		pStatement = (PreparedStatement) connection.prepareStatement(sql);
		
		pStatement.setString(1, "id0");
		pStatement.setString(2, "password0");
		pStatement.setString(3, "name0");
		pStatement.executeUpdate();
		pStatement.setString(1, "id1");
		pStatement.setString(2, "password1");
		pStatement.setString(3, "name1");
		pStatement.executeUpdate();
		pStatement.setString(1, "id2");
		pStatement.setString(2, "password2");
		pStatement.setString(3, "name2");
		pStatement.executeUpdate();
		pStatement.setString(1, "id3");
		pStatement.setString(2, "password3");
		pStatement.setString(3, "name3");
		pStatement.executeUpdate();
		pStatement.setString(1, "id4");
		pStatement.setString(2, "password4");
		pStatement.setString(3, "name4");
		pStatement.executeUpdate();
		
		connection.close();
		pStatement.close();
	}
	@Override
	public void updataData() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL,
				ID, PASSWORD);
		String sql = "update user set id='id5', password='password5', name='name5'"
				+ " where id='id0';";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}
	@Override
	public void selectData() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL,
				ID, PASSWORD);
		String sql = "select * from user;";
		statement = connection.createStatement();
		resultset = statement.executeQuery(sql);
		
		while(resultset.next()){
			String id = resultset.getString("id");
			String password = resultset.getString("password");
			String name = resultset.getString("name");
			System.out.println(id+" "+password+" "+name);

		}
		
		connection.close();
		statement.close();
		resultset.close();
	}
	
	@Override
	public void deleteData() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL,
				ID, PASSWORD);
		String sql = "delete from user where id='id5';";
		
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		
		connection.close();
		statement.close();
	}
	@Override
	public void droptable() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL,
				ID, PASSWORD);
		String sql = "drop table user;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}
	@Override
	public void dropDB() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL,
				ID, PASSWORD);
		String sql = "drop database javalms;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}
	@Override
	public void dropAccount() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/",
				"root", "mju12345");
		String sql = "drop user java@localhost";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
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
