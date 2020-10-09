package floristShop.views;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class MainFrame extends JFrame implements ActionListener{
    //Atributtes
    //TODO Añadir modelo de datos myModel;
    ActionListener myListener;
    
    //Componentes
    MainPanel myPanel;
    //CreateFloristPanel myPanel;
    //ManageFloristShopPanel myPanel;
    
   
    //Constructor
    public MainFrame(Object myModel) {
        //TODO instanciar el modelo
    	//this.myModel= myModel;
        myListener= this;
        this.myPanel= new MainPanel(myListener);   
        //this.myPanel= new CreateFloristPanel(myListener);        
        //this.myPanel= new ManageFloristShopPanel(myListener);
        
        initComponents();

    }

    //Create elements
    private void initComponents() {
        this.setTitle("FlowerGest: management of Florist's Shops");        
        getContentPane().add(myPanel);
        this.setSize(600, 600);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	Container pane;
        //Recover action
        String action = e.getActionCommand();        
        //and depending on it...
        switch (action) {
            case "manageFlorist":            	            	
            	//ask for actual Container and erase
                pane = getContentPane();
                pane.removeAll();
                //create new and validate
                ManageFloristShopPanel myMFPanel= new ManageFloristShopPanel(myListener);  
                pane.add(myMFPanel);
                validate();
                repaint();
                break;
            case "createFlorist":            	
            	//ask for actual Container and erase
                pane = getContentPane();
                pane.removeAll();
                //create new and validate
                CreateFloristPanel myFPanel= new CreateFloristPanel(myListener);   
                pane.add(myFPanel);
                validate();
                repaint();
                break; 
            case "addNewFloristShop": //from Create Florist Shop Panel
                //TODO        	
                break;                 
            case "backFromCreate"://from Create Florist Shop Panel
                pane = getContentPane();
                pane.removeAll();  
                pane.add(myPanel);
                validate();
                repaint();
                break;                
            case "backFromManage"://from Manage Florist Shop Panel
                pane = getContentPane();
                pane.removeAll();  
                pane.add(myPanel);
                validate();  
                repaint();
                break;
            default: 
                break;
        }
     
        
    }
    
    
}