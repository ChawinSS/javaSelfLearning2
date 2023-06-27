import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //JOptionPane = pop up a standard dialog box that prompts users for a value 
		  //    or informs them of something.

		  ImageIcon icon = new ImageIcon("muscles-5.png");
		  String[] responses = {"No","5 times!","2 times!"};
		  int answer = JOptionPane.showOptionDialog(
		    null,
		    "Go big or go home! :D", 
		    "Gogogo", 
		    JOptionPane.DEFAULT_OPTION, 
		    0, 
		    icon, 
		    responses, 
		    responses[0]);
		  System.out.println(answer);
		  
	}

}
