package articles;

/**
 * @author Bhahim
 */
public abstract class Article {
	
	//Constructor
	
	//Constructor si quiere darle un nombre al artículo
	public Article(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	
	//Constructor si no va a dar un nombre al artículo
	
	public Article(double price) {
		this.name = null;
		this.price = price;
	}
	
	
	
	
	//Attributos
	
	private String name;
	private double price;
	
	//Getters 
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	
	//An abstract class that all subclasses must implement
	public abstract String giveDiscription() ;
	
	

}
