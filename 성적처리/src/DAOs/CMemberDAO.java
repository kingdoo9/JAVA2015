package DAOs;

import Entity.CMember;



public class CMemberDAO {
	// Data Access Object : Read or Write data from persistent storage
	public CMember read() { return null; }
	public void write(CMember member){
		
		System.out.println("�����ID : " + member.getUserID()+"\n");
		System.out.println("��й�ȣ : " + member.getPassword()+"\n");
	}; // printout
}
