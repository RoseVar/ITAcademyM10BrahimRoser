package floristShop.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import florist.Florist;
import funcionalidades.ImplementedFuncionalities;


/**
 * @author Roser
 */

public class StockPanel extends JPanel {
	// Atributes
	private int selectedShop;
	private Florist myFlorist;
	//components
	private JLabel titleAction;
	private JTextArea stockView;

	// Constructor
	public StockPanel(int selectedShop) {
		this.selectedShop= selectedShop;
		myFlorist = ImplementedFuncionalities.getFloristByIndex(this.selectedShop);	
		initComponents();
	}

	/**
	 * Method for create the view and components and data of it
	 */
	private void initComponents() {

		// Set a layout to the class
		this.setLayout(new BorderLayout());

		// create a new panel for title
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		titleAction = new JLabel("ESTE ES EL STOCK ACTUAL:");
		titlePanel.add(titleAction);
		this.add(titlePanel, BorderLayout.NORTH);

		// create a new panel for view stock
		//recover data 
		String data= myFlorist.toString();
		//set data to the JTextArea
		stockView = new JTextArea(data);
		stockView.setEditable(false);

		JScrollPane scrollPane = new JScrollPane(stockView);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setAlignmentX(LEFT_ALIGNMENT);
		this.add(scrollPane, BorderLayout.CENTER);

	}

}
