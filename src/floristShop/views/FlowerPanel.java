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

import articles.Flower;
import articles.Tree;
import florist.Florist;
import funcionalidades.ImplementedFuncionalities;

/**
 * @author Roser
 */

public class FlowerPanel extends JPanel implements ActionListener {
	// Atributes
	private int selectedShop;
	private Florist myFlorist;
	// components
	private JButton btSaveFlower;
	private JLabel floristName;
	private JLabel nameFlower;
	private JLabel colourFlower;
	private JLabel priceFlower;
	private JLabel infoLabel;
	private JTextField fieldName;
	private JTextField fieldColour;
	private JTextField fieldPrice;

	// Constructor
	public FlowerPanel(int selectedShop) {
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

		// Presentation label with florist shop name
		floristName = new JLabel("FORMULARI PARA AÑADIR FLORES:");
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
		nameFlower = new JLabel("Indica el nombre de la flor:");
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(nameFlower, constraints);
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

		// label set colour
		colourFlower = new JLabel("Indica color de la flor:");
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(colourFlower, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		// Text field to set colour
		fieldColour = new JTextField(40);
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.weightx = 2.0;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(fieldColour, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		// label set price
		priceFlower = new JLabel("Indica precio de la flor:");
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(priceFlower, constraints);
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

		// Button save flower
		btSaveFlower = new JButton("Añadir flor al stock");
		btSaveFlower.setActionCommand("addFlower");
		btSaveFlower.addActionListener(this);
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 20, 10);
		pane.add(btSaveFlower, constraints);

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
			case "addFlower":
				//create a Flower article from the form fields
				Flower myFlower = flowerDataCorrect();
				//if Flower is not null
				if (myFlower != null) {
					//Add to florist
					ImplementedFuncionalities.addFlowerToFlorist(myFlorist, myFlower.getName(), 
							myFlower.getPrice(), myFlower.getColor());
					//check if added, if it is, inform the user
					for (Flower f: ImplementedFuncionalities.getFloristByIndex(selectedShop).getFlowers()) {
						if (myFlower.getName().equals(f.getName()) & myFlower.getColor().equals(f.getColor()) & 
								myFlower.getPrice()==f.getPrice()) {
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
	 * Method for check if all fields are correct and if does generate a flower
	 * 
	 * @return a flower if all information is given null otherwise
	 */
	private Flower flowerDataCorrect() {
		Flower result = null;
		String name = fieldName.getText();
		String colour = fieldColour.getText();
		String priceString = fieldPrice.getText();
		// if all fields are full (not null, not "")
		if (name != null & !"".equals(name) & colour != null & !"".equals(colour) & priceString != null
				& !"".equals(priceString)) {
			// try to cast price to double
			try {
				Double price = Double.valueOf(priceString);
				// if we have arrived here is because everything is ok
				result = new Flower(name, price, colour);
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
		infoLabel.setText("Flor \"" + fieldName.getText() + "\" añadida correctamente al stock");
	}

}
