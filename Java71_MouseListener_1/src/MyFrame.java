import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{

	JLabel label;
	ImageIcon smile;
	ImageIcon nervous;
	ImageIcon pain;
	ImageIcon toung;
	
	MyFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());	
		
		label = new JLabel();
		label.addMouseListener(this);
		
		smile = new ImageIcon("happy.png");
		nervous = new ImageIcon("aw.png");
		pain = new ImageIcon("dead.png");
		toung = new ImageIcon("tongue.png");
		label.setIcon(smile);

		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		//System.out.println("You clicked the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setIcon(pain);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		label.setIcon(toung);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		label.setIcon(nervous);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setIcon(smile);}

}