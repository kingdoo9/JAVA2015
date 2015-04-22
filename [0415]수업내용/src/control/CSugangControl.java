package control;

import java.io.FileNotFoundException;
import java.util.Vector;

import entity.CEntity;
import entity.CGangjwa;

public class CSugangControl extends CControl {

	public Vector<CGangjwa> getGangjwaList() throws FileNotFoundException {
		// read entity list
		this.getDao().connect("gangjwa.txt");
		Vector<CEntity> entityList = this.getDao().readAll();
		this.getDao().disconnect();
		//typecast
		Vector<CGangjwa> gangjwaList = new Vector<CGangjwa>();
		for(CEntity entity: entityList){
			gangjwaList.add((CGangjwa)entity);
		}

		return gangjwaList;
	}

}
