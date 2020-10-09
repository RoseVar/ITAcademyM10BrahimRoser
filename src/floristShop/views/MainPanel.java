package floristShop.views;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

public class MainPanel  extends JPanel {
    //Atributes 
    private JButton btCreateFlorist;
    private JLabel textCreateFlorist;
    private JLabel textShowFlorist;    
    private JList myFlorisList;    
    ActionListener myListener;
    ListSelectionListener myListListener;
    
    //Constructor
    public MainPanel (ActionListener listener) {   
        this.myListener= listener;
        initComponents();
    }
    
    

    /**
     * Method for create the view and components and data of it
     */
    private void initComponents() {   
    	
    	this.setLayout(new GridLayout(0,1));
    	BorderLayout backLayout= new BorderLayout();
    	
    	//create a new panel
        JPanel pane = new JPanel();                
        GridBagLayout  mainLayout= new GridBagLayout();
        //set the layout to this panel created
        pane.setLayout(mainLayout);
        
        //Components for create florist shop
        GridBagConstraints constraints = new GridBagConstraints();
        textCreateFlorist= new JLabel("Crea una floristeria nueva:");
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;  
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        constraints.anchor= GridBagConstraints.EAST;
        constraints.insets =new Insets(40,40,30,10);
        pane.add (textCreateFlorist, constraints);
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;                
        
		btCreateFlorist = new JButton ("Crear");
		btCreateFlorist.setActionCommand("createFlorist");
		btCreateFlorist.addActionListener(myListener);
        constraints.gridx = 2; 
        constraints.gridy = 0; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1; 
        constraints.weightx = 1.0;
        constraints.anchor= GridBagConstraints.WEST;
        constraints.fill= GridBagConstraints.NONE;
        constraints.insets =new Insets(40,40,30,10);
        pane.add (btCreateFlorist, constraints);       
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;

        //Components for select a florist shop
        textShowFlorist= new JLabel("Gestiona una floristeria existente:");
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;  
        constraints.weightx = 0.0;
        constraints.anchor= GridBagConstraints.WEST;
        constraints.fill= GridBagConstraints.HORIZONTAL;
        constraints.insets =new Insets(0,40,10,10);
        pane.add (textShowFlorist, constraints);
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        
        String[] dataTest= {"1-Floristeria Pepa", "2-Floristeria Paco"}; //TODO borrar a la larga
        myFlorisList = new JList (dataTest); //TODO falta meter datos buenos como parámetro
        myFlorisList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        myFlorisList.setLayoutOrientation(JList.VERTICAL);
        myFlorisList.setVisibleRowCount(-1);
        //TODO falta añadir el listener
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;  
        constraints.weightx = 0.0;
        constraints.weighty = 0.50;
        constraints.anchor= GridBagConstraints.WEST;
        constraints.fill= GridBagConstraints.BOTH;
        constraints.insets =new Insets(0,40,40,40);
        pane.add (myFlorisList, constraints);
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        
        this.add(pane);   		   
    		   
    }
    

}
