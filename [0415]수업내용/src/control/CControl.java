package control;

import DAO.IDAO;

public class CControl {
	private CLoginControl loginControl;
	protected IDAO dao;
	public IDAO getDao() {return dao;}
	public void setDao(IDAO dao) {this.dao = dao;}

	
	public CLoginControl getLoginControl() {return loginControl;}
	
}
