import sign.signlink;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.*;
import javax.swing.*;



public class Jframe extends client implements ActionListener {

    private static JMenuItem menuItem;
	public static JFrame frame;
	public static JPanel gamePanel;

	public Jframe(String args[]) {
		super();
		try {
			sign.signlink.startpriv(InetAddress.getByName(server));
			initUI();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void initUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			JPopupMenu.setDefaultLightWeightPopupEnabled(false);
			frame = new JFrame("fullscreen client by hot chicks p.s fred cant use it and is fat");
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gamePanel = new JPanel();

			gamePanel.setLayout(new BorderLayout());
			gamePanel.add(this);
						
			JMenu fileMenu = new JMenu("hot chicks");

			String[] mainButtons = new String[] { "fred", "hot chicks", "and big tits"};

			for (String name : mainButtons) {
				JMenuItem menuItem = new JMenuItem(name);
				if (name.equalsIgnoreCase("-")) {
					fileMenu.addSeparator();
				} else {
					menuItem.addActionListener(this);
					fileMenu.add(menuItem);
				}
			}

			JMenuBar menuBar = new JMenuBar();
			JMenuBar jmenubar = new JMenuBar();
            Dimension dimension1 = new Dimension(765+16, 503+59);
			frame.setMinimumSize(dimension1);
			frame.add(jmenubar);
			menuBar.add(fileMenu);
			frame.getContentPane().add(menuBar, BorderLayout.NORTH);
			frame.getContentPane().add(gamePanel, BorderLayout.CENTER);
			frame.pack();

			frame.setLocationRelativeTo(null);
			frame.setVisible(true); // can see the client
			frame.setResizable(true); // resizeable frame
			init();
		} catch (Exception e) {
				e.printStackTrace();
		}
}
	public URL getCodeBase() {
		try {
			return new URL("http://" + server + "/cache");
		} catch (Exception e) {
			return super.getCodeBase();
		}
	}

	public URL getDocumentBase() {
		return getCodeBase();
	}

	public void loadError(String s) {
		System.out.println("loadError: " + s);
	}

	public String getParameter(String key) {
			return "";
	}

	private static void openUpWebSite(String url) {
		Desktop d = Desktop.getDesktop();
		try {
			d.browse(new URI(url)); 	
		} catch (Exception e) {
		}
	}

	public void actionPerformed(ActionEvent evt) {
		String cmd = evt.getActionCommand();
		try {
			if (cmd != null) {
				if (cmd.equalsIgnoreCase("exit")) {
					System.exit(0);
				}
				if (cmd.equalsIgnoreCase("fred")) {
					openUpWebSite("http://www.pornhub.com");
				}
				if (cmd.equalsIgnoreCase("and big tits")) {
					openUpWebSite("http://www.pornhub.com/category/big+tits");
				}	
			}
		} catch (Exception e) {
		}
	}
}