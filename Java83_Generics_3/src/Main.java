import java.util.ArrayList;

public class Main {

   public static void main(String args[]) {
	  
		MyGenericClass <Integer,Integer> myint= new MyGenericClass<>(1,9);
		MyGenericClass <Double,Double> mydouble= new MyGenericClass<>(3.14,1.01);
		MyGenericClass <Character,Character> mychar= new MyGenericClass<>('@','$');
		MyGenericClass <String,Character> mystring= new MyGenericClass<>("fuck",'!');

      System.out.println(myint.getValue());
		System.out.println(mydouble.getValue());
		System.out.println(mychar.getValue());
		System.out.println(mystring.getValue());
   

   } 
}