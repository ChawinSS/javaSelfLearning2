import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
MyFrame(){

  this.setTitle("Jthis title goes here");
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setResizable(true);
   this.setSize(420,420);
   this.setVisible(true);

   ImageIcon image = new ImageIcon("logo.png");
   this.setIconImage(image.getImage());
   this.getContentPane().setBackground(new Color(249,155,125));
}
}