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

import articles.Decor;
import florist.shops.Shops;
import funcionalidades.ImplementedFuncionalities;

/**
 * @author Roser
 */

public class DecorationPanel extends JPanel implements ActionListener {
	// Attributes
	private ImplementedFuncionalities myModel;
	private int selectedShop;
	// components
	private JButton btSaveDecorationr;
	private JLabel floristName;
	private JLabel nameDecoration;
	private JLabel materialDecoration;
	private JLabel priceDecoration;
	private JLabel infoLabel;
	private JTextField fieldName;
	private JTextField fieldMaterial;
	private JTextField fieldPrice;

	// Constructor
	public DecorationPanel(ImplementedFuncionalities myModel, int selectedShop) {
		this.myModel = myModel;
		this.selectedShop = selectedShop;
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
		floristName = new JLabel("FORMULARIO PARA AÑADIR DECORACION:");
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 20, 10);
		pane.add(floristName, constraints);
		constraints.weighty = 0.0;

		// label set name
		nameDecoration = new JLabel("Indica el nombre de la decoración:");
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(nameDecoration, constraints);
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

		// label set material
		materialDecoration = new JLabel("Indica de qué material es (plastic/wood):");
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(materialDecoration, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		// Text field to set material
		fieldMaterial = new JTextField(40);
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.weightx = 2.0;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(fieldMaterial, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		// label set price
		priceDecoration = new JLabel("Indica de qué precio tiene:");
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(priceDecoration, constraints);
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

		// Button save decoration
		btSaveDecorationr = new JButton("Añadir decoración al stock");
		btSaveDecorationr.setActionCommand("addDeco");
		btSaveDecorationr.addActionListener(this);
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 20, 10);
		pane.add(btSaveDecorationr, constraints);

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
			case "addDeco":
				//create a Decor article from the form fields
				Decor myDeco= decoDataCorrect();
				//if Decor is not null
				if (myDeco!=null) {
					//Add to florist
					this.myModel.getMyFlorists().get(this.selectedShop).addDecor(myDeco);
					//if correct added
					if (this.myModel.getMyFlorists().get(this.selectedShop).getDecors().contains(myDeco)) {
						setOKLabel();//inform user
					};
				}
				break;
			default:
				break;
		}

	}

	/**
	 * Method for check if all fields are correct and if does generate a decoration
	 * 
	 * @return a decoration if all information is given null otherwise
	 */
	private Decor decoDataCorrect() {
		Decor result = null;
		String name = fieldName.getText();
		String provMaterial = fieldMaterial.getText();
		String priceString = fieldPrice.getText();
		Decor.Materials material=null;
		// if all fields are full (not null, not "")
		if (name != null & !"".equals(name) & provMaterial != null & !"".equals(provMaterial) & priceString != null
				& !"".equals(priceString)) {
			// try to cast price to double
			try {
				Double price = Double.valueOf(priceString);
				Boolean materialValid= false;
				if (Decor.Materials.plastic.name().equalsIgnoreCase(provMaterial)) {
					material= Decor.Materials.plastic;
					materialValid=true;		
				} else if (Decor.Materials.wood.name().equalsIgnoreCase(provMaterial)) {
					material= Decor.Materials.wood;
					materialValid=true;	
				} 
				if (materialValid) {
					// if we have arrived here is because everything is ok
					result = new Decor(name, price, material);
				} else {
					//if material is not one of the enums
					infoLabel.setForeground(Color.red);
					infoLabel.setText("El material tiene que wood o plastic");
					result=null;
				}
				//if there is any problem in casting to double... result null	
			} catch (Exception e) {
				infoLabel.setForeground(Color.red);
				infoLabel.setText("Precio no es un número");
				result = null;
			}

		} else {
			infoLabel.setForeground(Color.red);
			infoLabel.setText("Todos los campos son obligatorios");
			result = null;
		}
		return result;
	}

	/**
	 * Method to inform everything went ok
	 */
	public void setOKLabel() {
		infoLabel.setForeground(Color.BLACK);
		infoLabel.setText("Decoración \"" + fieldName.getText() + "\" añadida correctamente al stock");
	}

}