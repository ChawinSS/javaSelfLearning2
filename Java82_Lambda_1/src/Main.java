//******************************* Example 2 **************************************
public class Main {

	public static void main(String[] args) {
		String name="Chawin";
		char sysbol='!';

		MyInterface  myinterface = (x,y)-> {
			System.out.println("\nHellow world");
			System.out.println("nice day "+x+y);
		};

		MyInterface  myinterface2 = (x,y)-> {
			System.out.println("\nfuck"+y);
		};
		myinterface.message(name,sysbol);
		myinterface2.message(name,sysbol);
	}
}
//************************************************************************************