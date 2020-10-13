package floristShop.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import florist.Florist;
import funcionalidades.ImplementedFuncionalities;

/**
 * @author Roser
 */

public class ManageFloristShopPanel extends JPanel implements ActionListener {
	// Atributes
	private int selectedShop;
	private Florist myFlorist;
	private JLabel floristName;
	private JButton btAddTree;
	private JButton btAddFlower;
	private JButton btAddDecoration;
	private JButton btShowStock;
	private JButton btBack;
	JPanel dataPanel;
	ActionListener myGeneralListener;
	int menuSelection; // 0--> none, 1-> add Tree, 2-> add Flower, 3-> add Decoration, 4-> show stock

	// Constructor
	public ManageFloristShopPanel(ActionListener listener,  int selectedShop) {
		this.myGeneralListener = listener;
		this.selectedShop = selectedShop;
		menuSelection = 0;
		// recover the shop to manage from the list
		myFlorist = ImplementedFuncionalities.getFloristByIndex(this.selectedShop);		
		initComponents();
	}

	/**
	 * Method for create the view and components and data of it
	 */
	private void initComponents() {

		// Set a layout to the class
		this.setLayout(new BorderLayout());

		// Presentation label with florist shop name
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout());
		String provName = myFlorist.getName();
		floristName = new JLabel("GESTIONAR LA FLORISTERIA: \"" + provName + "\"");
		floristName.setHorizontalTextPosition(JLabel.CENTER);
		floristName.setHorizontalAlignment(SwingConstants.CENTER);
		titlePanel.add(floristName);
		this.add(titlePanel, BorderLayout.NORTH);

		// Panel menu with all buttons of menu
		JPanel menu = new JPanel();
		menu.setLayout(new FlowLayout());
		
		btAddTree = new JButton("Añadir arboles");
		btAddTree.setActionCommand("showTreePanel");
		btAddTree.addActionListener(this);
		menu.add(btAddTree);

		btAddFlower = new JButton("Añadir flores");
		btAddFlower.setActionCommand("showFlowerPanel");
		btAddFlower.addActionListener(this);
		menu.add(btAddFlower);

		btAddDecoration = new JButton("Añadir decoracion");
		btAddDecoration.setActionCommand("showDecoPanel");
		btAddDecoration.addActionListener(this);
		menu.add(btAddDecoration);

		btShowStock = new JButton("Ver stock");
		btShowStock.setActionCommand("showStockPanel");
		btShowStock.addActionListener(this);
		menu.add(btShowStock);

		btBack = new JButton("Atrás");
		btBack.setActionCommand("backFromManage");
		btBack.addActionListener(myGeneralListener); // listener of MainFrame
		menu.add(btBack);

		this.add(menu, BorderLayout.SOUTH);

		// create a new panel
		dataPanel = new JPanel();

		// Depending on menuSelection value the panel will be have one or another panel
		// in the center of the layout
		// case 0--> none, 1-> add Tree panel, 2-> add Flower panel, 
		//3-> add Decoration panel, 4-> show stock panel
		switch (menuSelection) {
			case 1:
				TreePanel myTPanel = new TreePanel(selectedShop);
				dataPanel = myTPanel;
				break;
			case 2:
				FlowerPanel myFPanel = new FlowerPanel(selectedShop);
				dataPanel = myFPanel;
				break;
			case 3:
				DecorationPanel myDPanel = new DecorationPanel(selectedShop);
				dataPanel = myDPanel;
				break;
			case 4:
				// Create JPanel
				StockPanel mySPanel = new StockPanel(selectedShop);
				dataPanel = mySPanel;
				break;
			default:
				break;
		}
		this.add(dataPanel, BorderLayout.CENTER);
		//force to paint the panel
		validate();
		repaint();

	}

	/**
	 * Method for set the actionListener actions performed:  
	 * it will set the menuSelection value depending on whitch button of the menu has 
	 * clicked the user (the action related to the button), and then ask for repaint central panel 
	 * so it will show the panel of the selected choice.
	 * menuSelection: 0--> none, 1-> add Tree, 2-> add Flower, 3-> add Decoration, 4-> show stock
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		// Recover action
		String action = e.getActionCommand();
		// and depending on it
		switch (action) {
			case "showTreePanel":
				menuSelection = 1;
				this.removeAll();
				initComponents();
				break;
			case "showFlowerPanel": 
				menuSelection = 2;
				this.removeAll();
				initComponents();
				break;
			case "showDecoPanel":
				menuSelection = 3;
				this.removeAll();
				initComponents();
				break;
			case "showStockPanel":
				menuSelection = 4;
				this.removeAll();
				initComponents();
				break;
			default:
				menuSelection = 0;
				this.remove(dataPanel);
				break;
		}

	}

}
