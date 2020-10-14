package floristShop.views;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import articles.Decor;
import florist.Florist;
import funcionalidades.ImplementedFuncionalities;

/**
 * @author Roser
 */


public class DecorationPanel extends JPanel implements ActionListener {
	// Attributes
	//private ImplementedFuncionalities myModel;
	private int selectedShop;
	// components
	private JButton btSaveDecorationr;
	private JLabel floristName;
	private JLabel nameDecoration;
	private JLabel materialDecoration;
	private JLabel priceDecoration;
	private JLabel infoLabel;
	private JTextField fieldName;
	private JRadioButton plastic;
	private JRadioButton wood;
	private ButtonGroup chooseMaterial;
	private String decorName;
	private double decorPrice;
	private Decor.Materials decorMaterial;
//	private JTextField fieldMaterial;
	private JTextField fieldPrice;

	// Constructor
	public DecorationPanel( int selectedShop) {
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


		// Radio button to set material
		//fieldMaterial = new JTextField(40);
		plastic = new JRadioButton("plastic", true);
		wood = new JRadioButton("wood");
		chooseMaterial = new ButtonGroup();
		chooseMaterial.add(plastic);
		chooseMaterial.add(wood);
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.weightx = 2.0;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = new Insets(0, 20, 10, 10);
		JPanel chosenOptions = new JPanel();
		chosenOptions.add(plastic);
		chosenOptions.add(wood);
		pane.add(chosenOptions, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		// label set material
		materialDecoration = new JLabel("Indica de qué material es (escoja una opción):");
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
		if (action.equals("addDeco")) {
			//create a Decor article from the form fields
			boolean myDecoResult= decoDataCorrect();
			//if Decor is not null
			if (myDecoResult) {
				//Add to florist
				Florist myFlorist= ImplementedFuncionalities.getMyFlorists().get(selectedShop);
				ImplementedFuncionalities.addDecorToFlorist(myFlorist, decorName, decorPrice, decorMaterial);
				//if correct added
				setOKLabel();//inform user
			}

		}

	}

	/**
	 * Method for check if all fields are correct and if does generate a decoration
	 * 
	 * @return a decoration if all information is given null otherwise
	 */
	private boolean decoDataCorrect() {
		boolean result = false;
		decorName = fieldName.getText();
		
		boolean materialValid = false;
		if (plastic.isSelected()) {
			decorMaterial= Decor.Materials.plastic;
			materialValid=true;
		}else if (wood.isSelected()) {

			decorMaterial= Decor.Materials.wood;
			materialValid=true;
		}else {	
		}
		String priceString = fieldPrice.getText();
		// if all fields are full (not null, not "")
		if (decorName != null & !"".equals(decorName)  & priceString != null
				& !"".equals(priceString)) {
			// try to cast price to double
			try {
				decorPrice = Double.valueOf(priceString);
				// if we have arrived here is because everything is ok
				result = true;
				 if(!materialValid) {
					//if material is not one of the enums
					infoLabel.setForeground(Color.red);
					infoLabel.setText("El material tiene que wood o plastic");
					result=false;
				 }
				//if there is any problem in casting to double... result null	
			} catch (Exception e) {
				infoLabel.setForeground(Color.red);
				infoLabel.setText("Precio no es un número");
				//result = false;
			}

		} else {
			infoLabel.setForeground(Color.red);
			infoLabel.setText("Todos los campos son obligatorios");
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

