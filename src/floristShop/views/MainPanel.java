package floristShop.views;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import florist.Florist;
import funcionalidades.ImplementedFuncionalities;

/**
 * @author Roser
 */

public class MainPanel extends JPanel{
	// Atributes
	int selectedShop;
	private JButton btCreateFlorist;
	private JButton btOpenFlorist;
	private JLabel textCreateFlorist;
	private JLabel textShowFlorist;
	private JList<String> myFlorisList;
	ActionListener myListener;
	ListSelectionListener myListListener;

	// Constructor
	public MainPanel(ActionListener listener) {
		this.myListener = listener;
		selectedShop=0;
		initComponents();		
	}	
	
	//getter of selected item (it changes depending on the selected item of the Jlist)
	public int getSelectedShop() {
		return selectedShop;
	}
	

	/**
	 * Method for create the view and components and data of it
	 */
	private void initComponents() {

		this.setLayout(new GridLayout(0, 1));

		// create a new panel
		JPanel pane = new JPanel();
		GridBagLayout mainLayout = new GridBagLayout();
		// set the layout to this panel created
		pane.setLayout(mainLayout);

		// Components for create florist shop
		
		//Label
		GridBagConstraints constraints = new GridBagConstraints();
		textCreateFlorist = new JLabel("Crea una floristeria nueva:");
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(40, 40, 30, 10);
		pane.add(textCreateFlorist, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		//create button
		btCreateFlorist = new JButton("Crear");
		btCreateFlorist.setActionCommand("createFlorist");
		btCreateFlorist.addActionListener(myListener);
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 1.0;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.fill = GridBagConstraints.NONE;
		constraints.insets = new Insets(40, 40, 30, 10);
		pane.add(btCreateFlorist, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		
		//Label
		textShowFlorist = new JLabel("Gestiona una floristeria existente:");
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.insets = new Insets(40, 40, 30, 10);
		pane.add(textShowFlorist, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		//open button
		btOpenFlorist = new JButton("Abrir la seleccionada");
		btOpenFlorist.setActionCommand("openFlorist");
		btOpenFlorist.addActionListener(myListener);
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.fill = GridBagConstraints.NONE;
		constraints.insets = new Insets(40, 40, 30, 10);
		pane.add(btOpenFlorist, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		//recover data of all florist
		List<Florist> allFlorist= ImplementedFuncionalities.getMyFlorists();
		String[] dataToShow = new String[allFlorist.size()];		
		for (int i=0;i<allFlorist.size();i++) {
			dataToShow[i]= allFlorist.get(i).getName();
		};
		//List of all florist
		myFlorisList = new JList<String>(dataToShow); 
		myFlorisList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		myFlorisList.setLayoutOrientation(JList.VERTICAL);
		myFlorisList.setSelectedIndex(selectedShop);
		myFlorisList.addListSelectionListener(new ListSelectionListener() {			
			@Override
			public void valueChanged(ListSelectionEvent e) {					
				if (e.getValueIsAdjusting() == false) {
					//save the position of the item selected (same position in list of florist)	
	                selectedShop= myFlorisList.getSelectedIndex();
	            }
			}
			
		});
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.weightx = 1.0;
		constraints.weighty = 0.50;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.insets = new Insets(0, 40, 40, 40);
		pane.add(myFlorisList, constraints);
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;

		//add all to panel
		this.add(pane);

	}
	

}
