package florist;

import java.util.*;

import articles.*;


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
		String stock = "Flores: "+ " \n";
		for (Flower flor: this.flowers) {
			stock += flor.toStringf() + " \n";
		}
		stock += "�rboles" + " \n";
		for (Tree tree: this.trees) {
			stock += tree.toStringf()+ " \n";
		}
		stock += "Art�culos de decoracion: "+ " \n";
		for (Decor decor: this.decors) {
			stock += decor.toString()+ " \n";
		}
		return stock;//We give the result
	}
	
	public void showStock() {
		System.out.println(this.toString());
	}

}
