package articles;

public class Tree extends Article {
	
	//Atributos
	
	private double height;
	
	//Constructor
	
	public Tree(String name, double price, double height) {
		
		super(name, price);//We call the superclass to assign to the parent attributes 
		this.height = height;//We give the value height to our object
	}
	
	//I also create a constructor en case the customer don't want to give a name to the tree
	
	public Tree (double price, double height) {
		super(price);
		this.height = height;
	}
	
	//Getter y Setter for height
	
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//Método toString
	public String toString(){
		String discription;
		if (this.getName().isEmpty()) {
			discription = "";
		}else {
			discription = "Nombre del artículo: " + this.getName();
		}
		discription += ", altura: " + this.height + " precio: " + this.getPrice();
		return discription;
	}
	

}
