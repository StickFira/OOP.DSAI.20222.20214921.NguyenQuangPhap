package aims;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	Cart anOrder=new Cart();	
    	DVD dvd1=new DVD("The Lion King","Animation","Roger Aller",87,19.95f);
    	// anOrder.addDVD(dvd1);
    	DVD dvd2=new DVD("Star Wars","Science Fiction","George Lucas",87,24.95f);
    	// anOrder.addDVD(dvd2);
    	DVD dvd3=new DVD("Aladin","Animation",18.99f);
    	// anOrder.addDVD(dvd3);
    	// anOrder.remove(dvd1);
		anOrder.addDVD(dvd1,dvd2,dvd3);
    	System.out.println("Total Cost is:");
    	System.out.println(anOrder.total_Cost());
	}
}