package articles;

/**
 * @author Bhahim
 */

public class Decor extends Article{
	
	//Attributes of this class
	private Materials material;
	
	public enum Materials{//We create a choice of materials a decor can be made of
		plastic,
		wood;
	}
	
	//Constructors
	
	//A constructor that needs the name of the Article
	public Decor(String name, double price, Materials material) {
		super(name, price);
		this.material = material;
	}
	
	
	//A constructor that doesn't need the Article's name
	public Decor(double price, Materials material) {
		super(price);
		this.material = material;
	}
	
	
	//A getter for material attribute
	public Materials getMaterial() {
		return this.material;
	}
	
	//We print a discritpion of the characteristics of the decor
	public String giveDiscription(){
		String discription;
		if (this.getName().isEmpty()) {
			discription = "";
		}else {
			discription = "Nombre del artículo: " + this.getName();
		}
		discription += ", material:" + this.material + ", precio:" + this.getPrice()+ "€";
		return discription;
	}
	

}
