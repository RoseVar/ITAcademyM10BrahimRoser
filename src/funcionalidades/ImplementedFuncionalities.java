package funcionalidades;

import java.util.ArrayList;
import java.util.List;

import articles.Decor;
import articles.Flower;
import articles.Tree;
import florist.Florist;


/**
 * @author Brahim + Roser
 */

public class ImplementedFuncionalities {
	
	private static List<Florist> myFlorists;
	
	public ImplementedFuncionalities() {
		myFlorists = new ArrayList<Florist>();
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
		myFlorists.add(flo1);
		
		Florist flo2= new Florist("Floristeria Luis");
		flo2.addTree(new Tree("Pino", 10.0, 1.5));
		flo2.addFlower(new Flower("Calendula", 2.5, "Amarilla"));
		flo2.addDecor(new Decor("Banco", 225.25, Decor.Materials.wood));
		myFlorists.add(flo2);		
	}

	//Getter of List of florist
	public List<Florist> getMyFlorists() {
		return myFlorists;
	}
	
	//This method puts a new florist in our repository by name parameter
	public Boolean createFloristAction(String floristName) {
		Boolean resp= false; 
		if (myFlorists.add(new Florist (floristName))) {
			resp=true;
		}
		return resp;
	}
	
	//This function creates a tree with the passed parameters and ads them to the repository
	static void addTreeToFlorist(Florist myFlorist, String treeName, double treeHeight, double treePrice ) {
		Tree myTree = new Tree(treeName, treeHeight, treePrice);
		myFlorist.addTree(myTree);
	}
	
	//This function creates a decor with the passed parameters and ads them to the repository
	static void addDecorToFlorist(Florist myFlorist, 
			String decorName, double decorPrice, Decor.Materials material) {
		Decor myDecor = new Decor(decorName, decorPrice, material);
		myFlorist.addDecor(myDecor);
	}
	
	//This funtion creates a flower with the passed parameters and ads them to the repository
	static void addFlowerToFlorist(Florist myFlorist, String name, double flowerPrice, String flowerColor) {
		Flower myFlower = new Flower(name, flowerPrice, flowerColor);
		myFlorist.addFlower(myFlower);
	}
	
	//This function returns a String with all the stock a florist has
	static String printStock(Florist myFlorist) {
		return myFlorist.toString();
	}

}








