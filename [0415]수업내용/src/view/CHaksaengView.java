package view;

import valueObject.VUser;

public class CHaksaengView extends CView {
	private VUser vUser;
	public CHaksaengView(VUser vUser){
		super("학생 메인메뉴");
		this.vUser = vUser;
		this.add(new CSugangView());
		
	}
	
}
