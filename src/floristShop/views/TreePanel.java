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

public class TreePanel  extends JPanel {
    //Atributes 
    private JButton btSaveTree;
    private JButton btBack;
    private JLabel floristName;
    private JLabel nameTree;
    private JLabel sizeTree;    
    private JTextField fieldName;
    private JTextField fieldSize;   
    ActionListener myListener;    
    
    //Constructor
    public TreePanel (ActionListener listener) {   
        this.myListener= listener;
        initComponents();
    }
    
    

    /**
     * Method for create the view and components and data of it
     */
    private void initComponents() {   
    	
    	//Set a layout to the class
    	//this.setLayout(new BorderLayout());
    	this.setLayout(new GridLayout(0,1));

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
        nameTree = new JLabel ("Indica el nombre del arbol:");
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;  
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        constraints.anchor= GridBagConstraints.EAST;
        constraints.insets =new Insets(0,20,10,10);
        pane.add (nameTree, constraints);
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

        //label set size
        sizeTree = new JLabel ("Indica la altura del arbol:");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;  
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        constraints.anchor= GridBagConstraints.EAST;
        constraints.insets =new Insets(0,20,10,10);
        pane.add (sizeTree, constraints);
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        
        //Text field to set size
        fieldSize= new JTextField(40);
        constraints.gridx = 2; 
        constraints.gridy = 2; 
        constraints.gridwidth = 2; 
        constraints.gridheight = 1; 
        constraints.weightx = 2.0;
        constraints.anchor= GridBagConstraints.WEST;
        constraints.fill= GridBagConstraints.HORIZONTAL;
        constraints.insets =new Insets(0,20,10,10);
        pane.add (fieldSize, constraints);       
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        
        //Button save tree
		btSaveTree = new JButton ("Añadir arbol al stock");
		btSaveTree.setActionCommand("addTree");
		btSaveTree.addActionListener(myListener);
		constraints.fill= GridBagConstraints.NONE;
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        constraints.gridheight = 1;  
        constraints.weighty = 1.0;
        constraints.anchor= GridBagConstraints.CENTER;
        constraints.insets =new Insets(10,10,20,10);
        pane.add(btSaveTree, constraints);        
       
        this.add(pane);
        
//        btBack = new JButton ("Atrás");
//        btBack.setActionCommand("back");
//        btBack.addActionListener(myListener);
//
//        this.add(btBack, BorderLayout.SOUTH);
         		  
         		  
    		   
    }
    

}
