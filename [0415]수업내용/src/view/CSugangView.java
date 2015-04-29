package view;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import control.CGangjwaControl;
import entity.CGangjwa;
import entity.CSugang;
import entity.VUser;
import exception.NoSuchGangjwaException;

public class CSugangView extends CView {
	
	public void sugangSincheong(VUser vUser){
		// TODO Auto-generated method stub
		// show Gangjwa List
		CGangjwaControl gangjwaControl = (CGangjwaControl)this.getControl();
		Vector<CGangjwa> gangjwaList;
		try {
				gangjwaList = gangjwaControl.getGangjwaList();
	
			for(CGangjwa gangjwa : gangjwaList){
				System.out.println("���� ID : "+ gangjwa.getID()+" "+gangjwa.getName() );
			}
			// ���� ��ȣ �Է�
			System.out.println("�����Ͻ� ���¸� �������ּ���.");
			Scanner scanner = new Scanner(System.in);
			String gangjwaID = scanner.next();
			// ���� ��ȣ�� ��ȿ�� Ȯ��
			for(CGangjwa gangjwa : gangjwaList){
				if(gangjwa.getID().equals(gangjwaID)){
					CSugang sugang = new CSugang(vUser.getUserID(), gangjwa.getID());
					gangjwaControl.sugangSincheong(sugang);
					return;
				}
			}
			throw new NoSuchGangjwaException();
			//throw new IOException("���� ���̵� ��ġ ���� �ʽ��ϴ�.")
		} catch (IOException | NoSuchGangjwaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// confirm sugnagnSingdcheong
		// show result

	}

}
