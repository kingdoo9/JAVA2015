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
				System.out.println("강좌 ID : "+ gangjwa.getID()+" "+gangjwa.getName() );
			}
			// 강좌 번호 입력
			System.out.println("수강하실 강좌를 선택해주세요.");
			Scanner scanner = new Scanner(System.in);
			String gangjwaID = scanner.next();
			// 강좌 번호의 유효성 확인
			for(CGangjwa gangjwa : gangjwaList){
				if(gangjwa.getID().equals(gangjwaID)){
					CSugang sugang = new CSugang(vUser.getUserID(), gangjwa.getID());
					gangjwaControl.sugangSincheong(sugang);
					return;
				}
			}
			throw new NoSuchGangjwaException();
			//throw new IOException("강좌 아이디가 일치 하지 않습니다.")
		} catch (IOException | NoSuchGangjwaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// confirm sugnagnSingdcheong
		// show result

	}

}
