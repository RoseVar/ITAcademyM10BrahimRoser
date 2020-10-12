package florist.shops;

import java.util.ArrayList;
import java.util.List;
import articles.Decor;
import articles.Flower;
import articles.Tree;
import florist.Florist;

/**
 * @author Roser
 */

public class Shops {
	//Attributes
	List<Florist> myShops;
	
	//Constructor
	public Shops() {
		myShops= new ArrayList<Florist>();
		loadTestData();		
	}

	/**
	 * Method for creating test data
	 * so we can check the usability of our app
	 */
	private void loadTestData() {
		Florist flo1= new Florist("Floristeria Ana");
		flo1.addTree(new Tree("Roble", 12.5, 2));
		flo1.addFlower(new Flower("Magnolia", 4.5, "Blanca"));
		flo1.addDecor(new Decor("Maceta", 5.5, Decor.Materials.plastic));
		myShops.add(flo1);
		
		Florist flo2= new Florist("Floristeria Luis");
		flo2.addTree(new Tree("Pino", 10.0, 1.5));
		flo2.addFlower(new Flower("Calendula", 2.5, "Amarilla"));
		flo2.addDecor(new Decor("Banco", 225.25, Decor.Materials.wood));
		myShops.add(flo2);		
	}

	//Getter of List of florist
	public List<Florist> getMyShops() {
		return myShops;
	}
	
	/**
	 * Method for add a new shop to the list
	 * @param flo Florist to add
	 * @return true if added, false if don't
	 */
	public Boolean addNewFlorist(Florist flo) {
		Boolean resp= false; 
		if (myShops.add(flo)) {
			resp=true;
		}
		return resp;
		
	}
	
	

}
