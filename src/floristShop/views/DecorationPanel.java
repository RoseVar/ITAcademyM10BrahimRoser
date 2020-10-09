package floristShop.views;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DecorationPanel  extends JPanel implements ActionListener{
    //Atributes 
    private JButton btSaveDecorationr;
    private JLabel floristName;
    private JLabel nameDecoration;
    private JLabel materialDecoration;    
    private JTextField fieldName;
    private JTextField fieldMaterial;     
    
    //Constructor
    public DecorationPanel () {   
        initComponents();
    }
    
    

    /**
     * Method for create the view and components and data of it
     */
    private void initComponents() {   
    	
    	//Set a layout to the class
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
        floristName = new JLabel ("FORMULARIO PARA AÑADIR DECORACION:");
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
        nameDecoration = new JLabel ("Indica el nombre de la decoración:");
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;  
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        constraints.anchor= GridBagConstraints.EAST;
        constraints.insets =new Insets(0,20,10,10);
        pane.add (nameDecoration, constraints);
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

        //label set material
        materialDecoration = new JLabel ("Indica de qué material es:");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;  
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        constraints.anchor= GridBagConstraints.EAST;
        constraints.insets =new Insets(0,20,10,10);
        pane.add (materialDecoration, constraints);
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        
        //Text field to set material
        fieldMaterial= new JTextField(40);
        constraints.gridx = 2; 
        constraints.gridy = 2; 
        constraints.gridwidth = 2; 
        constraints.gridheight = 1; 
        constraints.weightx = 2.0;
        constraints.anchor= GridBagConstraints.WEST;
        constraints.fill= GridBagConstraints.HORIZONTAL;
        constraints.insets =new Insets(0,20,10,10);
        pane.add (fieldMaterial, constraints);       
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        
        //Button save decoration
		btSaveDecorationr = new JButton ("Añadir decoración al stock");
		btSaveDecorationr.setActionCommand("addDeco");
		btSaveDecorationr.addActionListener(this);
		constraints.fill= GridBagConstraints.NONE;
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        constraints.gridheight = 1;  
        constraints.weighty = 1.0;
        constraints.anchor= GridBagConstraints.CENTER;
        constraints.insets =new Insets(10,10,20,10);
        pane.add(btSaveDecorationr, constraints);
               
        this.add(pane);
        
    		   
    }



	@Override
	public void actionPerformed(ActionEvent e) {
		// Recover action
		String action = e.getActionCommand();
		// and depending on it
		switch (action) {
		case "addDeco": 
			// TODO guardar datos de decoracion nueva
			break;
		default:
			break;
		}

	}
    

}
