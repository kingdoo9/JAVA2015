package Entity;

import java.io.Serializable;
import java.util.Scanner;
import java.util.Vector;

public class CGangjwa extends CEntity {

	private static final long serialVersionUID = 1L;
	//attributes
	private int ID;
	private String name;
	private int sugamginwon;
	private Vector<String> times;  //vector == array docs.oracle.com/javase/8/docs/api/
	private int gyosuID;
	private int gwamokID;
	//setters & getters
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getSugamginwon() {return sugamginwon;}
	public void setSugamginwon(int sugamginwon) {this.sugamginwon = sugamginwon;}
	public Vector<String> getTimes() {return times;}
	public void setTimes(Vector<String> times) {this.times = times;}
	public int getGyosuID() {return gyosuID;}
	public void setGyosuID(int gyosuID) {this.gyosuID = gyosuID;}
	public int getGwamokID() {return gwamokID;}
	public void setGwamokID(int gwamokID) {this.gwamokID = gwamokID;}
	
	@Override  // 안에 알아서 적자
	public void read(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
