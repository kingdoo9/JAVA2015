package view;

import java.util.Scanner;

import valueObject.VUser;

public class CMainView extends CView{
	private VUser vUser;
	private CHaksaengView haksaengView;
	Scanner scanner;
	
	public CMainView() {
		super("main view");
		scanner = new Scanner(System.in);
	}
	


	public void show() {
		// TODO Auto-generated method stub
		try {
			CLoginView loginView = new CLoginView();
			loginView.show(scanner);
			
			haksaengView = new CHaksaengView(vUser);
			haksaengView.show(scanner);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
