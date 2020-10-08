package floristShop.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
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
	ActionListener myListener;
	int selection; // 0--> none, 1-> add Tree, 2-> add Flower, 3-> add Decoration, 4-> show stock

	// Constructor
	public ManageFloristShopPanel(ActionListener listener) {
		this.myListener = listener;
		selection = 0;
		initComponents();
	}

	/**
	 * Method for create the view and components and data of it
	 */
	private void initComponents() {

		// Set a layout to the class
		// this.setLayout(new GridLayout(2,1));
		this.setLayout(new BorderLayout());
//    	//create a new panel
//        JPanel pane = new JPanel();                
//        GridBagLayout  mainLayout= new GridBagLayout();
//        GridBagConstraints constraints = new GridBagConstraints(); 
//        //set the layout to this panel created
//        pane.setLayout(mainLayout);
//        
//        
//        //Presentation label with florist shop name
//        //TODO recuperar nombre de la floristeria              
//        String provName= "Floristeria Prueba";
//        floristName = new JLabel ("GESTIONAR LA FLORISTERIA: \"" + provName+ "\"");
//		constraints.fill= GridBagConstraints.NONE;
//        constraints.gridx = 0;
//        constraints.gridy = 0;
//        constraints.gridwidth=GridBagConstraints.REMAINDER;
//        constraints.gridheight = 1;  
//        constraints.weighty = 1.0;
//        constraints.anchor= GridBagConstraints.CENTER;
//        constraints.insets =new Insets(10,10,20,10);
//        pane.add(floristName, constraints);
//        constraints.weighty = 0.0;
//        
//        //label set name
//		btAddTree = new JButton ("Añadir arboles");
//		btAddTree.setActionCommand("addTree");
//		btAddTree.addActionListener(this);
//        constraints.gridx = 0;
//        constraints.gridy = 1;
//        constraints.gridwidth = 1;
//        constraints.gridheight = 1;  
//        constraints.weightx = 0.0;
//        constraints.weighty = 0.0;
//        //constraints.anchor= GridBagConstraints.EAST;
//        constraints.insets =new Insets(0,20,10,10);
//        pane.add (btAddTree, constraints);
//        constraints.weightx = 0.0;
//        constraints.weighty = 0.0;
//        
//        btAddFlower = new JButton ("Añadir flores");
//        btAddFlower.setActionCommand("addFlower");
//        btAddFlower.addActionListener(this);
//        constraints.gridx = 1;
//        constraints.gridy = 1;
//        constraints.gridwidth = 1;
//        constraints.gridheight = 1;  
//        constraints.weightx = 0.0;
//        constraints.weighty = 0.0;
//        //constraints.anchor= GridBagConstraints.EAST;
//        constraints.insets =new Insets(0,20,10,10);
//        pane.add (btAddFlower, constraints);
//        constraints.weightx = 0.0;
//        constraints.weighty = 0.0;
//        
//        btAddDecoration = new JButton ("Añadir decoracion");
//        btAddDecoration.setActionCommand("addDecoration");
//        btAddDecoration.addActionListener(this);
//        constraints.gridx = 0;
//        constraints.gridy = 2;
//        constraints.gridwidth = 1;
//        constraints.gridheight = 1;  
//        constraints.weightx = 0.0;
//        constraints.weighty = 0.0;
//        //constraints.anchor= GridBagConstraints.EAST;
//        constraints.insets =new Insets(0,20,10,10);
//        pane.add (btAddDecoration, constraints);
//        constraints.weightx = 0.0;
//        constraints.weighty = 0.0;
//        
//        
//        btShowStock = new JButton ("Mostrar stock");
//        btShowStock.setActionCommand("showStock");
//        btShowStock.addActionListener(this);
//        constraints.gridx = 1;
//        constraints.gridy = 2;
//        constraints.gridwidth = 1;
//        constraints.gridheight = 1;  
//        constraints.weightx = 0.0;
//        constraints.weighty = 0.0;
//        //constraints.anchor= GridBagConstraints.EAST;
//        constraints.insets =new Insets(0,20,10,0);
//        pane.add (btShowStock, constraints);
//        constraints.weightx = 0.0;
//        constraints.weighty = 0.0;
//                
//        this.add(pane);

		// Presentation label with florist shop name
		// TODO recuperar nombre de la floristeria
		String provName = "Floristeria Prueba";
		floristName = new JLabel("GESTIONAR LA FLORISTERIA: \"" + provName + "\"");
		floristName.setHorizontalTextPosition(JLabel.CENTER);
		floristName.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(floristName, BorderLayout.NORTH);

//        //label set name
//        JPanel menu = new JPanel();
//        menu.setLayout(new GridLayout(0,2, 10,10));
//        menu.setAlignmentY(CENTER_ALIGNMENT);
//        
//		btAddTree = new JButton ("Añadir arboles");
//		btAddTree.setActionCommand("addTrees");
//		btAddTree.addActionListener(this);        
//		menu.add (btAddTree);
//        
//        btAddFlower = new JButton ("Añadir flores");
//        btAddFlower.setActionCommand("addFlowers");
//        btAddFlower.addActionListener(this);
//        menu.add (btAddFlower);
//        
//        btAddDecoration = new JButton ("Añadir decoracion");
//        btAddDecoration.setActionCommand("addDecorations");
//        btAddDecoration.addActionListener(this);
//        menu.add(btAddDecoration);
//        
//        
//        btShowStock = new JButton ("Ver stock");
//        btShowStock.setActionCommand("showStock");
//        btShowStock.addActionListener(this);
//        menu.add (btShowStock);
//        
//               
//        this.add(menu, BorderLayout.CENTER);
//
//        //menu.add(new JLabel());
//        
//        btBack = new JButton ("Atrás");
//        btBack.setActionCommand("back");
//        btBack.addActionListener(this);
//        this.add (btBack, BorderLayout.SOUTH);

		// label set name
		JPanel menu = new JPanel();
		menu.setLayout(new FlowLayout());
		//menu.setAlignmentY(CENTER_ALIGNMENT);

		btAddTree = new JButton("Añadir arboles");
		btAddTree.setActionCommand("addTrees");
		btAddTree.addActionListener(this);
		menu.add(btAddTree);

		btAddFlower = new JButton("Añadir flores");
		btAddFlower.setActionCommand("addFlowers");
		btAddFlower.addActionListener(this);
		menu.add(btAddFlower);

		btAddDecoration = new JButton("Añadir decoracion");
		btAddDecoration.setActionCommand("addDecorations");
		btAddDecoration.addActionListener(this);
		menu.add(btAddDecoration);

		btShowStock = new JButton("Ver stock");
		btShowStock.setActionCommand("showStock");
		btShowStock.addActionListener(this);
		menu.add(btShowStock);

		btBack = new JButton("Atrás");
		btBack.setActionCommand("back");
		btBack.addActionListener(this);
		menu.add(btBack);
		
		this.add(menu, BorderLayout.SOUTH);

		// create a new panel
		JPanel dataPanel = new JPanel();
		// 0--> none, 1-> add Tree, 2-> add Flower, 3-> add Decoration, 4-> show stock
		switch (selection) {
		case 1:
			TreePanel myTPanel = new TreePanel(this);
			menu.setAlignmentY(TOP_ALIGNMENT);
			menu.removeAll();
			menu.validate();
			menu.add(myTPanel);
			break;
		case 2:
			FlowerPanel myFPanel = new FlowerPanel(this);
			menu.removeAll();
			menu.validate();
			menu.add(myFPanel);
			break;
		case 3:
			DecorationPanel myDPanel = new DecorationPanel(this);
			menu.removeAll();
			menu.validate();
			menu.add(myDPanel);
			break;
		case 4:
			// Create JPanel
			JPanel showStockPanel = new JPanel();
			showStockPanel.setLayout(new GridLayout(2, 1));
			JLabel title = new JLabel("STOCK ACTUAL:");
			showStockPanel.add(title);

			// TODO recover data
			// Datos de prueva a borrar
			String[] data = { "Arbol[nombre: peral, altura: 15.2]", "Flor [nombre:calendula, color: amarillo]",
					"Decoracion[nombre: maceta, material: ceramica]" };
			JList myStock = new JList(data);
			showStockPanel.add(myStock);
			// Add panel to data panel
			dataPanel.add(showStockPanel);
			break;
		default:
			break;
		}
		// this.add(dataPanel, BorderLayout.CENTER);
		validate();
		repaint();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("He dado a un boton");
		// Recover action
		String action = e.getActionCommand();
		// and depending on it
		switch (action) {
		case "showStock":
			System.out.println("He dado a showStock");
			// TODO
			selection = 4;			
			initComponents();
			break;
		case "addTrees":
			selection = 1;					
			initComponents();
			break;
		case "addFlowers":
			// TODO
			break;
		case "addDecorations":
			// TODO
			break;
		default:
			break;
		}

	}

	private JPanel showStock() {
		// Create JPanel
		JPanel showStockPanel = new JPanel();
		showStockPanel.setLayout(new GridLayout(2, 1));
		JLabel title = new JLabel("STOCK ACTUAL:");
		showStockPanel.add(title);

		// TODO recover data
		// Datos de prueva a borrar
		String[] data = { "Arbol[nombre: peral, altura: 15.2]", "Flor [nombre:calendula, color: amarillo]",
				"Decoracion[nombre: maceta, material: ceramica]" };
		JList myStock = new JList(data);
		showStockPanel.add(myStock);

		return showStockPanel;

	}

}
