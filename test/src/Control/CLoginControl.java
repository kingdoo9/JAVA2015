package Control;

import Entity.CMember;

public class CLoginControl {
	private CMember member;

	public CMember login(CMember member) {
		// TODO Auto-generated method stub
		member = (CMember)this.getDao().read(member,"member.txt");
		return this.member;
	}
	
}
