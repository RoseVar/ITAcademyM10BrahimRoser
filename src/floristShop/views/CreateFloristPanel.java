package floristShop.views;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import florist.Florist;

/**
 * @author Roser
 */
public class CreateFloristPanel extends JPanel {
	// Attributes
	private JButton btSaveFlorist;
	private JButton btBack;
	private JLabel titlePage;
	private JLabel nameFloristShop;
	private JTextField fieldName;
	private JLabel infoLabel;
	ActionListener myListener;
	Florist provFlorist;

	// Constructor
	public CreateFloristPanel(ActionListener listener) {
		this.myListener = listener;
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
		titlePage = new JLabel("CREANDO UNA FLORISTERIA NUEVA");
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 20, 10);
		pane.add(titlePage, constraints);
		constraints.weighty = 0.0;

		// label set name
		nameFloristShop = new JLabel("Indica el nombre de tu floristería:");
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.insets = new Insets(0, 20, 10, 10);
		pane.add(nameFloristShop, constraints);
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

		// Button save new Florist shop
		btSaveFlorist = new JButton("Crear floristeria");
		btSaveFlorist.setActionCommand("addNewFloristShop");
		btSaveFlorist.addActionListener(myListener);
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 20, 10);
		pane.add(btSaveFlorist, constraints);

		// infoLabel
		infoLabel = new JLabel();
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 20, 10);
		pane.add(infoLabel, constraints);
		
		// Button back to main
		btBack = new JButton("Volver");
		btBack.setActionCommand("backFromCreate");
		btBack.addActionListener(myListener);
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 20, 10);
		pane.add(btBack, constraints);
		

		this.add(pane);

	}
	
	/**
	 * Method for ckecking that all fields are ok
	 * @return a Florist if fields are ok
	 * 			null otherwise
	 */
	public Florist createProvisionalFlorist() {
		Florist result= null;
		if (fieldName.getText().isEmpty() ||fieldName.getText()==null) {
			fieldName.setForeground(Color.RED);
			fieldName.setText("La floristeria ha de tener un nombre");
		} else {
			fieldName.setForeground(Color.BLACK);
			result= new Florist(fieldName.getText());
			infoLabel.setText("La floristeria "+ fieldName.getText() + " ha sido creada." );
		}
		return result;
	}
	
	/**
	 * Method to inform everything went ok
	 */
	public void setOKLabel() {
		infoLabel.setForeground(Color.BLACK);
		infoLabel.setText("La floristeria "+ fieldName.getText() + " ha sido creada." );
	}

}
