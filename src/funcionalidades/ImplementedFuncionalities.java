package funcionalidades;

import java.util.ArrayList;

import florist.*;
import articles.*;



public class ImplementedFuncionalities {
	
	private static ArrayList<Florist> myFlorists = new ArrayList<Florist>();

	public static void main(String[] args) {
		
		//Here I have an example of how to execute to execute all the functionalities needes in my app
		ImplementedFuncionalities.createFloristAction("Floristeria Pepa");//I create a florist shop
		//I add a decor with its characteristics to my florist
		ImplementedFuncionalities.addDecorToFlorist(ImplementedFuncionalities.myFlorists.get(0), 
				"Jarrón chino", 3.23, Decor.Materials.plastic);
		//Do the same for a flower
		ImplementedFuncionalities.addFlowerToFlorist(ImplementedFuncionalities.myFlorists.get(0), "rosa", 2, "rojo");
		//And for two trees
		ImplementedFuncionalities.addTreeToFlorist(ImplementedFuncionalities.myFlorists.get(0), "naranjo", 2.21, 7.65);
		ImplementedFuncionalities.addTreeToFlorist(ImplementedFuncionalities.myFlorists.get(0), "roble", 4.22, 32.32);
		//I print what we have in the florist
		System.out.println(
		ImplementedFuncionalities.printStock(ImplementedFuncionalities.myFlorists.get(0)));
		

	}
	
	//This method puts a new florist in our repository by name parameter
	static void createFloristAction(String floristName) {
		myFlorists.add(new Florist(floristName));
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








