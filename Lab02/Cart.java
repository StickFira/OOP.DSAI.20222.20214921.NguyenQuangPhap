package aims;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED =20;
	private DVD items_Ordered[]= new DVD[MAX_NUMBERS_ORDERED];
	int qty_Ordered=0;
	public void addDVD (DVD disc) {
		if (qty_Ordered<MAX_NUMBERS_ORDERED) {
			items_Ordered[qty_Ordered]=disc;
			qty_Ordered+=1;
			System.out.println("The disc has been added");
		}
		else {System.out.println("The cart is almost full");}
	}
	public void addDVD (DVD [] dvdList){
		for (int i=0; i<dvdList.length(); i++){
			addDVD(dvdList[i]);
		}
	}
	public void addDVD(DVD... dvd_tup) {
		for (DVD i: dvd_tup) {
			addDVD(i);
		}
	}
	public void remove(DVD disc) {
        for (int i=0; i< qty_Ordered; i++) {
            if (items_Ordered[i]== disc) {
                for (int j= i; j< qty_Ordered- 1; j++) {
                    items_Ordered[j]= items_Ordered[j+ 1];}
            }
        }		
	}
	public float total_Cost() {
		float Cost=0;
		for (int i=0; i< qty_Ordered; i++) {
			Cost+= items_Ordered[i].getCost();
		}
		return Cost;
	}
}