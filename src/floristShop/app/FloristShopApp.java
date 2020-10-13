package floristShop.app;


import java.util.ArrayList;
import java.util.List;

import articles.Decor;
import articles.Flower;
import articles.Tree;
import florist.Florist;

import floristShop.views.MainFrame;

/**
 * @author Roser
 */
public class FloristShopApp {

	public static void main(String[] args) {				    

		    FloristShopApp myFloristManager = new FloristShopApp();
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                //call our method to start
	            	myFloristManager.run();
	            }
	        });
		}
	        
	                

	    /**
	     * Method to star running our application.
	     */
	    private void run() {
	        //Load data in static model and main frame
	    	loadTestData();
		    MainFrame myFrame= new MainFrame();

	        //Put it in the center of screen
	        myFrame.setLocationRelativeTo(null);
	        //set visible the main frame
	        myFrame.setVisible(true);              

		}
	    
		/**
		 * Method for creating test data
		 * so we can check the usability of our app
		 */
		private void loadTestData() {
			List<Florist> myFlorists= new ArrayList<Florist>();
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
			
			ImplementedFuncionalities.setMyFlorists(myFlorists);
		}

	}
