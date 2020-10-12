package floristShop.app;

import florist.shops.Shops;
import floristShop.views.MainFrame;
import funcionalidades.ImplementedFuncionalities;

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
	        //Instantiate model and main frame
	    	ImplementedFuncionalities myShops= new ImplementedFuncionalities();
		    MainFrame myFrame= new MainFrame(myShops);
	        //Put it in the center of screen
	        myFrame.setLocationRelativeTo(null);
	        //set visible the main frame
	        myFrame.setVisible(true);              

		}

	}
