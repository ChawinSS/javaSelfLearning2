import java.io.Serializable;

public class User implements Serializable{
 
	// private static final long serialVersionUID = 123;
	
	String name;
	transient String password;
	
	public void hello() {
		System.out.println("Welcome "+name);
	}
}
