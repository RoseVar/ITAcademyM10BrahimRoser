package floristShop.app;

import floristShop.views.MainFrame;

public class FloristShopApp {

	public static void main(String[] args) {
		
	    //TODO declarar e instanciar el modelo: myModel
	    //MainFrame myFrame= new MainFrame(null); //TODO pasarle el modelo de datos
	    //myFrame.setVisible(true); 
	    
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
        //myModel
        MainFrame myFrame = new MainFrame(null);
        //Put it in the center of screen
        myFrame.setLocationRelativeTo(null);
        //set visible the main frame
        myFrame.setVisible(true);              

	}

}
