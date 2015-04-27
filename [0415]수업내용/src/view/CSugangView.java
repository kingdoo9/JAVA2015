package view;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import control.CGangjwaControl;
import entity.CGangjwa;
import entity.CSugang;
import entity.VUser;

public class CSugangView extends CView {

	public void sugangSincheong(VUser vUser) throws IOException {
		// TODO Auto-generated method stub
		// show Gangjwa List
		CGangjwaControl gangjwaControl = (CGangjwaControl)this.getControl();
		Vector<CGangjwa> gangjwaList = gangjwaControl.getGangjwaList();
		for(CGangjwa gangjwa : gangjwaList){
			System.out.println("���� ID : "+ gangjwa.getID()+" "+gangjwa.getName() );
		}
		// select Gangjwa
		System.out.println("�����Ͻ� ���¸� �������ּ���.");
		Scanner scanner = new Scanner(System.in);
		String gangjwaID = scanner.next();
		
		for(CGangjwa gangjwa : gangjwaList){
			if(gangjwa.getID().equals(gangjwaID)){
				CSugang sugang = new CSugang(vUser.getUserID(), gangjwa.getID());
				gangjwaControl.sugangSincheong(sugang);
			}
		}


		// confirm sugnagnSingdcheong
		// show result
		scanner.close();
	}

}
