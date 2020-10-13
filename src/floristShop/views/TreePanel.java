package floristShop.views;

import java.awt.Color;
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

import articles.Tree;
import florist.Florist;
import funcionalidades.ImplementedFuncionalities;

/**
 * @author Roser
 */

public class TreePanel extends JPanel implements ActionListener {
	// Atributes
	private int selectedShop;
	private Florist myFlorist;
	//components
	private JButton btSaveTree;
	private JLabel titleLabel;
	private JLabel nameTree;
	private JLabel sizeTree;
	private JLabel priceTree;
	private JLabel infoLabel;
	private JTextField fieldName;
	private JTextField fieldSize;
	private JTextField fieldPrice;

	// Constructor
	public TreePanel(int selectedShop) {
		this.selectedShop= selectedShop;
		myFlorist = ImplementedFuncionalities.getFloristByIndex(this.selectedShop);	
		initComponents();
	}

	/**
	 * Method for create the view and components and data of it
	 */
	private void initComponents() {

		// Set a layout to the class
		this.setLayout(new GridLayout(0, 1));

		// create a new panel
		JPanel pane = new JPanel();
		GridBagLayout mainLayout = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		// set the layout to this panel created
		pane.setLayout(mainLayout);

		// Presentation label
		titleLabel = new JLabel("FORMULARIO AÑADIR ARBOLES:");
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 20, 10);
		pane.add(titleLabel, constraints);
		constraints.weighty = 0.0;

		// label set name
		nameTree = new JLabel("Indica el nombre del arbol:");
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(nameTree, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		// text Field to set name
		fieldName = new JTextField(40);
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.weightx = 2.0;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(fieldName, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		// label set size
		sizeTree = new JLabel("Indica la altura del arbol:");
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(sizeTree, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		// Text field to set size
		fieldSize = new JTextField(40);
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.weightx = 2.0;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(fieldSize, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		
		// label set price
		priceTree = new JLabel("Indica el precio del arbol:");
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(priceTree, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		// Text field to set price
		fieldPrice = new JTextField(40);
		constraints.gridx = 2;
		constraints.gridy = 3;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.weightx = 2.0;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(fieldPrice, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		// Button save tree
		btSaveTree = new JButton("Añadir arbol al stock");
		btSaveTree.setActionCommand("addTree");
		btSaveTree.addActionListener(this);
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 20, 10);
		pane.add(btSaveTree, constraints);
		
		// info label
		infoLabel = new JLabel();
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 20, 10);
		pane.add(infoLabel, constraints);

		this.add(pane);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Recover action
		String action = e.getActionCommand();
		// and depending on it
		switch (action) {
		case "addTree":	
			//create a Deco article from the form fields
			Tree myTree= treeDataCorrect();
			//if Tree is not null
			if (myTree!=null) {
				//Add to florist
				Florist flo1= ImplementedFuncionalities.getFloristByIndex(selectedShop) ;
				ImplementedFuncionalities.addTreeToFlorist(flo1, myTree.getName(), 
						myTree.getHeight(), myTree.getPrice());
				//check if added, if it is, inform the user 
				for (Tree t: ImplementedFuncionalities.getFloristByIndex(selectedShop).getTrees()) {
					if (myTree.getName().equals(t.getName()) & myTree.getHeight()==t.getHeight() & 
									myTree.getPrice()==t.getPrice()) {
						setOKLabel();
						return;
					}
				}
			}
			break;
		default:
			break;
		}

	}

	/**
	 * Method for check if all fields are correct and if does
	 * generate a tree
	 * @return a tree if all information is given
	 * 		null otherwise
	 */
	private Tree treeDataCorrect() {
		Tree result= null;
		String name=fieldName.getText();
		String sizeString= fieldSize.getText();
		String priceString= fieldPrice.getText();
		//if all fields are full (not null, not "")
		if (name!=null & !"".equals(name) & sizeString!=null & !"".equals(sizeString) 
				& priceString!=null & !"".equals(priceString) ) {
			//try to cast size and price to double
			try {
				Double size = Double.valueOf(sizeString);
				Double price= Double.valueOf(priceString);
				//if we have arrived here is because everything is ok
				result= new Tree (name, price, size);
			//if there is any problem in casting to double... result null	
			} catch (Exception e){
				infoLabel.setForeground(Color.red);
				infoLabel.setText("Precio o altura no es un número");
				result= null;
			}
						
		} else {
			infoLabel.setForeground(Color.red);
			infoLabel.setText("Todos los campos son obligatorios");
			result= null;
		}			
		return result;
	}
	
	/**
	 * Method to inform everything went ok
	 */
	public void setOKLabel() {
		infoLabel.setForeground(Color.BLACK);
		infoLabel.setText("Arbol \""+fieldName.getText()+"\" añadido correctamente al stock");
	}

}
