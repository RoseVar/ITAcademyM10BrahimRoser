package florist;

import java.util.*;

import articles.*;


public class Florist {
	
	//Atributos
	
	//I create a repository of the items: trees, flowers, decors and one to join them all
	private ArrayList<Tree> trees = new ArrayList<Tree>();
	private ArrayList<Flower> flowers = new ArrayList<Flower>();
	private ArrayList<Decor> decors = new ArrayList<Decor>();
	private ArrayList<ArrayList <Article>> articles = new ArrayList<ArrayList <Article>>();
	private String name;
	
	//Constructor
	
	public Florist(String name) {
		/*
		this.articles.addAll(this.flowers);
		this.articles.addAll(this.trees);
		this.articles.addAll(this.decors);
		*I can't join all the lists of trees, flowers and decors in a unique articles arraylist
		*/
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
		String stock = "";
		for (ArrayList<Article> itemsLists: articles) {
			stock +=  itemsLists.getClass() + ":\n";//We show class name and add a space
			for (Article item: itemsLists ) {
				//We give the description of every item with spaces in between and giving the index
				stock += (itemsLists.indexOf(item)+1)+item.toString() + "\n "; 
			}
			stock += "\n";
		}
		return stock;//We give the result
	}
	
	public void showStock() {
		System.out.println(this.toString());
	}

}
