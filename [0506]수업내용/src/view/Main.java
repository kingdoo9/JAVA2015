package view;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CView mainView = new CView("����");
		CView hakseangView = new CView("�л��޴�");
		CView gyosuView = new CView("�����޴�");
		CView sugangsincheongView = new CView("������û");
		CView sugangNeayeokView = new CView("����������ȸ");
		CView seongjeokView = new CView("������ȸ");
		
		mainView.add(hakseangView);
		mainView.add(gyosuView);
		hakseangView.add(sugangsincheongView);
		hakseangView.add(sugangNeayeokView);
		hakseangView.add(seongjeokView);
		
		mainView.show();
	}

}
