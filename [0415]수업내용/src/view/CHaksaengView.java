package view;

import valueObject.VUser;

public class CHaksaengView extends CView {
	private VUser vUser;
	public CHaksaengView(VUser vUser){
		super("�л� ���θ޴�");
		this.vUser = vUser;
		this.add(new CSugangView());
		
	}
	
}
