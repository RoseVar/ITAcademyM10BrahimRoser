package floristShop.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MainFrame extends JFrame implements ActionListener{
    //Atrtibutos
    //Añadir modelo de datos myModel;
    ActionListener myListener;
    
    //Componentes
    //MainPanel myPanel;
    //pruebas:
    //TreePanel myPanel;
    //CreateFloristPanel myPanel;
    ManageFloristShopPanel myPanel;
    //FlowerPanel myPanel;
    
    //Constructor
    public MainFrame(Object myModel) {
        //this.myModel= myModel;
        myListener= this;
        //this.myPanel= new MainPanel(myListener);   
        //this.myPanel= new TreePanel(myListener);
        //this.myPanel= new CreateFloristPanel(myListener);        
        this.myPanel= new ManageFloristShopPanel(myListener);
        //this.myPanel= new FlowerPanel(myListener);
                
        initComponents();

    }

    //Crear elementos
    private void initComponents() {
        this.setTitle("FlowerGest: management of Florist's Shops");        
        getContentPane().add(myPanel);
        this.setSize(600, 600);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Recover action
        String action = e.getActionCommand();
        //and depending on it...
        switch (action) {
            case "seeFlorist":
                //TODO
                break;
            case "addFlorist":
                //TODO        	
                break;  
            case "addTree":
                //TODO        	
                break;  
            case "createFloristShop":
                //TODO        	
                break;      
            default: 
                break;
        }
     
        
    }
    
    
}