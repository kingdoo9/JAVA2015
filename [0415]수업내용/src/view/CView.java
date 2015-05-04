package view;

import java.util.Scanner;
import java.util.Vector;

import control.CControl;


public class CView {
	private String menuText;
	private Vector<CView> viewList;
	private CControl control;

	public String getMenuText() {return this.menuText;}
	public void add(CView view){ viewList.add(view);}
	public CControl getControl() {return control;}
	public void setControl(CControl control) {this.control = control;}
	
	
	public CView(String menuText){
		this.menuText = menuText;
		viewList = new Vector<CView>();
	}
	
	public void show(Scanner scanner){
		int selection = 0;
		while(selection != 9){
			for(int i=0; i<viewList.size(); i++){
				System.out.println(i+ " : "+ viewList.get(i).getMenuText());
				System.out.print("--selection Input : ");
			}
			selection = scanner.nextInt();
			viewList.get(selection).show(scanner);
		
	}
	
	}
}
