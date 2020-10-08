package floristShop.views;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowerPanel  extends JPanel {
    //Atributes 
    private JButton btSaveFlower;
    private JButton btBack;
    private JLabel floristName;
    private JLabel nameFlower;
    private JLabel colourFlower;    
    private JTextField fieldName;
    private JTextField fieldColour;   
    ActionListener myListener;    
    
    //Constructor
    public FlowerPanel (ActionListener listener) {   
        this.myListener= listener;
        initComponents();
    }
    
    

    /**
     * Method for create the view and components and data of it
     */
    private void initComponents() {   
    	
    	//Set a layout to the class
    	this.setLayout(new BorderLayout());

    	//create a new panel
        JPanel pane = new JPanel();                
        GridBagLayout  mainLayout= new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints(); 
        //set the layout to this panel created
        pane.setLayout(mainLayout);
        
        
        
        //Presentation label with florist shop name
        //TODO recuperar nombre de la floristeria              
        String provName= "Floristeria Prueba";
        floristName = new JLabel ("AÑADIR ARBOL A LA FLORISTERIA: \"" + provName+ "\"");
		constraints.fill= GridBagConstraints.NONE;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        constraints.gridheight = 1;  
        constraints.weighty = 1.0;
        constraints.anchor= GridBagConstraints.CENTER;
        constraints.insets =new Insets(10,10,20,10);
        pane.add(floristName, constraints);
        constraints.weighty = 0.0;
        
        //label set name
        nameFlower = new JLabel ("Indica el nombre de la flor:");
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;  
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        constraints.anchor= GridBagConstraints.EAST;
        constraints.insets =new Insets(0,20,10,10);
        pane.add (nameFlower, constraints);
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        
        //text Field to set name        
		fieldName= new JTextField(40);
        constraints.gridx = 2; 
        constraints.gridy = 1; 
        constraints.gridwidth = 2; 
        constraints.gridheight = 1; 
        constraints.weightx = 2.0;
        constraints.anchor= GridBagConstraints.WEST;
        constraints.fill= GridBagConstraints.HORIZONTAL;
        constraints.insets =new Insets(0,20,10,10);
        pane.add (fieldName, constraints);       
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;

        //label set colour
        colourFlower = new JLabel ("Indica color de la flor:");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;  
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        constraints.anchor= GridBagConstraints.EAST;
        constraints.insets =new Insets(0,20,10,10);
        pane.add (colourFlower, constraints);
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        
        //Text field to set colour
        fieldColour= new JTextField(40);
        constraints.gridx = 2; 
        constraints.gridy = 2; 
        constraints.gridwidth = 2; 
        constraints.gridheight = 1; 
        constraints.weightx = 2.0;
        constraints.anchor= GridBagConstraints.WEST;
        constraints.fill= GridBagConstraints.HORIZONTAL;
        constraints.insets =new Insets(0,20,10,10);
        pane.add (fieldColour, constraints);       
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        
        //Button save flower
		btSaveFlower = new JButton ("Añadir flor al stock");
		btSaveFlower.setActionCommand("addFlower");
		btSaveFlower.addActionListener(myListener);
		constraints.fill= GridBagConstraints.NONE;
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        constraints.gridheight = 1;  
        constraints.weighty = 1.0;
        constraints.anchor= GridBagConstraints.CENTER;
        constraints.insets =new Insets(10,10,20,10);
        pane.add(btSaveFlower, constraints);       
        
        this.add(pane);
         		  
        btBack = new JButton ("Atrás");
        btBack.setActionCommand("back");
        btBack.addActionListener(myListener);

        this.add(btBack, BorderLayout.SOUTH);
    		   
    }
    

}
