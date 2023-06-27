public class Main {

   public static void main(String args[]) {
	  
		MyIntegerClass myint= new 	MyIntegerClass(1);
		MyDoubleClass mydouble= new MyDoubleClass(3.14);
		MyCharacterClass mychar= new MyCharacterClass('@');
		MyStringClass mystring= new MyStringClass("fuck");

		System.out.println(myint.getValue());
		System.out.println(mydouble.getValue());
		System.out.println(mychar.getValue());
		System.out.println(mystring.getValue());
   } 
}