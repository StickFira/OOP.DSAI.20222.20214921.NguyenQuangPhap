package aims;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	DVD jungleDvd= new DVD("Jungle");
	DVD cinderellaDvd= new DVD("Cinderella");
	swap(jungleDvd, cinderellaDvd);
	System.out.println("jungle title: "+jungleDvd.getTitle());
	System.out.println("cinderella title: "+cinderellaDvd.getTitle());
	}
	public static void swap(Object o1, Object o2) {
		Object tmp=o1;
		o1=o2;
		o2=tmp;
	}
	public static void changeTile(DVD dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DVD(oldTitle);
	}
}
