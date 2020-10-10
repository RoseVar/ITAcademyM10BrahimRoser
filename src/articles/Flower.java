package articles;

public class Flower extends Article {
	
	//Atributes
	private String color;
	
	
	//Constructors
	//A constructor with a name
	public Flower(String name, double price, String color) {
		super(name,price);
		this.color = color;
	}
	
	//A constructor to flowers without name
	public Flower(double price, String color) {
		super("",price);
		this.color = color;
	}
	
	
	//Methods
	
	//We need a getter for the flower (We don't need a setter as the flower doesn't change its color)
	public String getColor() {
		return this.color;
	}
	
	//We give a discription of the object
		public String giveDiscription(){
			String discription = "";
			if (this.getName().isEmpty()) {
				discription = "SinNombre";
			}else {
				discription = "Nombre del art�culo: " + this.getName();
			}
			discription += ", color:" + this.color + ", precio:" + this.getPrice() + "�";
			return discription;
		}
	

}
