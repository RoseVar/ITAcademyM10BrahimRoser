package florist;

import java.util.*;

import articles.*;

/**
 * @author Bhahim
 */

public class Florist {
	
	//Atributos
	
	//I create a repository of the items: trees, flowers, decors and one to join them all
	private ArrayList<Tree> trees ;
	private ArrayList<Flower> flowers;
	private ArrayList<Decor> decors;
	private String name;
	
	//Constructor
	
	public Florist(String name) {
		trees = new ArrayList<Tree>();
		flowers = new ArrayList<Flower>();
		decors = new ArrayList<Decor>();
		this.name = name;
		
	}
	
	
	//Getters and setters
	
	//For name
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//getter for trees
	public ArrayList<Tree> getTrees(){
		return this.trees;
	}
	//getter for flowers
	public ArrayList<Flower> getFlowers(){
		return this.flowers;
	}
	//Getter for decors
	public ArrayList<Decor> getDecors(){
		return this.decors;
	}
	
	//addtree, addflowe, adddecor, show stock
	public void addTree(Tree tree) {//This adds a new tree to our trees repository
		this.trees.add(tree);
	}
	public void addFlower(Flower flower) {//This adds a new flower to our flowers repository
		this.flowers.add(flower);
	}
	public void addDecor(Decor decor) {//This adds a new decor to our decors repository
		this.decors.add(decor);
	}
	
	public String toString() {//This method gives a String of all the items in the stock
		String stock = "FLORES: "+ " \n";//We say that we are going to print flowers
		for (Flower flor: this.flowers) {//We loop over our flower repository
			stock += flor.giveDiscription() + " \n";//We give the discription of every single flower
		}
		//We do the same for trees, and dec,ors
		stock += "ÁRBOLES:" + " \n";
		for (Tree tree: this.trees) {
			stock += tree.giveDiscription()+ " \n";
		}
		stock += "ARTÍCULOS DE DECORACIÓN: "+ " \n";
		for (Decor decor: this.decors) {
			stock += decor.giveDiscription()+ " \n";
		}
		return stock;//We give the result
	}
	
//	//This function shows what we have in our stock by printing the discription of the florist
//	public void showStock() {
//		System.out.println(this.toString());
//	}

}
