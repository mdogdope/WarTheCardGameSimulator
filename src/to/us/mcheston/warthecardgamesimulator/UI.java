package to.us.mcheston.warthecardgamesimulator;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/*
 * This Class will control the UI aspect.
 */
public class UI {
	private static JFrame window;
	
	
//	Program starting point that will make the window for the UI, and populate it with its standard layout.
	public static void main(String[] args) {
		
//		Sets the rules for the GridBagLayout to follow.
		GridBagConstraints mainConst = new GridBagConstraints();
		mainConst.fill = GridBagConstraints.BOTH;//Make GridBag fill parent both X and Y.
		
		
//		Setup for the window.
		window = new JFrame("War the Card Game");
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//kills the application when the 'X' is clicked.
		window.setLayout(new GridBagLayout());//Splits the frame into dynamic grid spaces.
		window.setSize(700, 450);
		window.setLocationRelativeTo(null);//centers window on launch.
		
		
/*
 * List of components to add to top bar
 * ====================================
 * Start (JButton)
 * Player count (JSpinner)
 * Deck count (JSpinner)
 * Line splitter (BoarderFactory)
 */
//		Make base components
		JButton startBtn = new JButton("START");
		startBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				Use TheGame class to start playing
			}
		});
		
		
		
		
//		Adding components to the UI.
		
		
		
		
		
		
		
		
		
		

		window.setVisible(true);//Makes the window visible.
		
	}
	
	
//	update method to show new elements added to the frame.
	public void updateUI() {
		window.revalidate();
	}
	
	
	
	
//	JFrame mainFrame = new JFrame("Testing");
//	mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//	mainFrame.setLayout(new GridBagLayout());
//	mainFrame.setSize(700, 450);
//	
//	GridBagConstraints c = new GridBagConstraints();
//	c.fill = GridBagConstraints.BOTH;
//	c.weightx = 1.0;
//	
//	/*
//	 * This panel will hold the input fields filled by user.
//	 * One input for player count, and another for number of decks.
//	 */
//	JPanel header = new JPanel();
//	header.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
//	
////	Addes the various input and labels.
//	
////	This formates the panel to be at the top and adds it to mainFrame
//	c.gridx = 0;
//	c.gridy = 0;
//	c.weighty = 0.1;
//	mainFrame.add(header, c);
//	
//	JPanel content = new JPanel();
//	content.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
//	c.gridx = 0;
//	c.gridy = 1;
//	c.weighty = 1.0;
//	mainFrame.add(content, c);
//	
//	JLabel lblPlayer = new JLabel("Players: ");
//	header.add(lblPlayer);
//	
//	JLabel lblPlayer2 = new JLabel("Players: ");
//	content.add(lblPlayer2);
//	
//	
//	mainFrame.setVisible(true);
}