package view;

import java.util.Scanner;
import java.util.Vector;

public class CView {
	private String title;
	private Vector<CView> childList;
	private Scanner scanner;
	private int selection;
	
	private String getTitle() {return title;}
	public CView(String title){
		this.title = title;
		childList = new Vector<CView>();
		scanner = new Scanner(System.in);
		selection = -1;
	}
	public void add(CView View) {
		childList.add(View);
		
	}
	public void show(){
		// 화면 표시
		// 데이터 입력
		// 명령 입력
		
		for (int i=0; i<childList.size(); i++){
			System.out.println(i + " : " + childList.get(i).getTitle());
		}
		selection = scanner.nextInt();
		if(selection >=0 && selection<childList.size()){
			childList.get(selection).show();
		}
		
	}


}
