package floristShop.views;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import florist.Florist;
import funcionalidades.ImplementedFuncionalities;

/**
 * @author Roser
 */

public class MainFrame extends JFrame implements ActionListener {
    //Atributtes
    ActionListener myListener;
    int selectedShop;

	// Componentes
	MainPanel myPanel;
	CreateFloristPanel myFPanel;

	// Constructor
	public MainFrame() {
		//instanciate attributes
		myListener = this;
		selectedShop=0;
		this.myPanel = new MainPanel(myListener);
		//create elements
		initComponents();

	}
	


	/**
	 * Method for creating components
	 */
	private void initComponents() {
		this.setTitle("FlowerGest: management of Florist's Shops");
		getContentPane().add(myPanel);
		this.setSize(600, 600);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Container pane;
		// Recover action
		String action = e.getActionCommand();
		// and depending on it...
		switch (action) {
			case "openFlorist":
				//recover the index of the shop the user has selected
				int shopSelected= myPanel.getSelectedShop();
				//ask for actual Container and erase
				pane = getContentPane();
				pane.removeAll();			
				// create new panel and validate
				ManageFloristShopPanel myMFPanel = new ManageFloristShopPanel(myListener,shopSelected);
				pane.add(myMFPanel);
				validate();
				repaint();
				break;
			case "createFlorist":
				// ask for actual Container and erase
				pane = getContentPane();
				pane.removeAll();
				// create new and validate
				myFPanel = new CreateFloristPanel(myListener);
				pane.add(myFPanel);
				validate();
				repaint();
				break;
			case "addNewFloristShop": // from Create Florist Shop Panel
				//if this method recover a florist
				Florist floToAdd= myFPanel.createProvisionalFlorist();
				//if has recovered one florist, add to list of florists of model
				if (floToAdd!=null) {
					if (ImplementedFuncionalities.createFloristAction(floToAdd.getName())) { //if goes ok, inform user
						myFPanel.setOKLabel();
					}
				}
				break;
			case "backFromCreate":// from Create Florist Shop Panel
				pane = getContentPane();
				pane.removeAll();
				//re-create main panel so it recover the new florist created
				this.myPanel = new MainPanel(myListener);	
				pane.add(myPanel);
				validate();
				repaint();
				break;
			case "backFromManage":// from Manage Florist Shop Panel
				pane = getContentPane();
				pane.removeAll();
				pane.add(myPanel);
				validate();
				repaint();
				break;
			default:
				break;
		}

	}

}