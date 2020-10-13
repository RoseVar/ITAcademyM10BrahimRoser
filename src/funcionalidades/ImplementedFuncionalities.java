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
	
	//Getter and setter of List of florist
	public static List<Florist> getMyFlorists() {
		return myFlorists;
	}	
	
	public static void setMyFlorists(List<Florist> myFlorists) {
		ImplementedFuncionalities.myFlorists = myFlorists;
	}
	
	//Get a florist by its position in arraylist
	public static Florist getFloristByIndex(int index) {
		return myFlorists.get(index);
	}


	//This method puts a new florist in our repository by name parameter
	public static Boolean createFloristAction(String floristName) {
		Boolean resp= false; 
		if (myFlorists.add(new Florist (floristName))) {
			resp=true;
		}
		return resp;
	}
	
	//This function creates a tree with the passed parameters and ads them to the repository
	public static void addTreeToFlorist(Florist myFlorist, String treeName, double treeHeight, double treePrice ) {
		Tree myTree = new Tree(treeName, treeHeight, treePrice);
		myFlorist.addTree(myTree);
	}
	
	//This function creates a decor with the passed parameters and ads them to the repository
	public static void addDecorToFlorist(Florist myFlorist, 
			String decorName, double decorPrice, Decor.Materials material) {
		Decor myDecor = new Decor(decorName, decorPrice, material);
		myFlorist.addDecor(myDecor);
	}
	
	//This funtion creates a flower with the passed parameters and ads them to the repository
	public static void addFlowerToFlorist(Florist myFlorist, String name, double flowerPrice, String flowerColor) {
		Flower myFlower = new Flower(name, flowerPrice, flowerColor);
		myFlorist.addFlower(myFlower);
	}
	
	//This function returns a String with all the stock a florist has
	public static String printStock(Florist myFlorist) {
		return myFlorist.toString();
	}

}








