package floristShop.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ManageFloristShopPanel extends JPanel implements ActionListener {
	// Atributes
	private JLabel floristName;
	private JButton btAddTree;
	private JButton btAddFlower;
	private JButton btAddDecoration;
	private JButton btShowStock;
	private JButton btBack;
	JPanel dataPanel;
	ActionListener myGeneralListener;
	int selection; // 0--> none, 1-> add Tree, 2-> add Flower, 3-> add Decoration, 4-> show stock

	// Constructor
	public ManageFloristShopPanel(ActionListener listener) {
		this.myGeneralListener = listener;
		selection = 0;
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
		// TODO recuperar nombre de la floristeria
		String provName = "Floristeria Prueba";
		floristName = new JLabel("GESTIONAR LA FLORISTERIA: \"" + provName + "\"");
		floristName.setHorizontalTextPosition(JLabel.CENTER);
		floristName.setHorizontalAlignment(SwingConstants.CENTER);
		titlePanel.add(floristName);
		this.add(titlePanel, BorderLayout.NORTH);

		// label set name
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
		btBack.addActionListener(myGeneralListener); // manage listener of MainFrame
		menu.add(btBack);

		this.add(menu, BorderLayout.SOUTH);

		// create a new panel
		dataPanel = new JPanel();

		// case 0--> none, 1-> add Tree, 2-> add Flower, 3-> add Decoration, 4-> show
		// stock
		switch (selection) {
		case 1:
			TreePanel myTPanel = new TreePanel();
			dataPanel = myTPanel;
			break;
		case 2:
			FlowerPanel myFPanel = new FlowerPanel();
			dataPanel = myFPanel;
			break;
		case 3:
			DecorationPanel myDPanel = new DecorationPanel();
			dataPanel = myDPanel;
			break;
		case 4:
			// Create JPanel
			StockPanel mySPanel = new StockPanel();
			dataPanel = mySPanel;
			break;
		default:
			break;
		}
		this.add(dataPanel, BorderLayout.CENTER);
		validate();
		repaint();

	}

	// selection: 0--> none, 1-> add Tree, 2-> add Flower, 3-> add Decoration, 4->
	// show stock
	@Override
	public void actionPerformed(ActionEvent e) {
		// Recover action
		String action = e.getActionCommand();
		// and depending on it
		switch (action) {
		case "showTreePanel":// from this panel
			selection = 1;
			this.removeAll();
			initComponents();
			break;
		case "showFlowerPanel": // from this panel
			selection = 2;
			this.removeAll();
			initComponents();
			break;
		case "showDecoPanel":// from this panel
			selection = 3;
			this.removeAll();
			initComponents();
			break;
		case "showStockPanel":// from this panel
			selection = 4;
			this.removeAll();
			initComponents();
			break;
		default:
			selection = 0;
			this.remove(dataPanel);
			break;
		}

	}

}
