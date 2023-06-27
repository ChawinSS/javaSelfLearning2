//----------------------- Generic Method -----------------------
public class Main {



   public static void main(String args[]) {
	  
      Integer[] intArray = {1, 2, 3, 4, 5};
      Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
      Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
      String[] stringArray = {"B","Y","E"};
      
      System.out.print("\nInteger Array: ");
      displayArray(intArray);
      System.out.print("First Index Array: ");
      System.out.println(firstIndex(intArray));

      System.out.print("\nDouble Array: ");
      displayArray(doubleArray);
      System.out.print("First Index Array: ");
      System.out.println(firstIndex(doubleArray));

      System.out.print("\nCharacter Array: ");
      displayArray(charArray);
      System.out.print("First Index Array: ");
      System.out.println(firstIndex(charArray));
      
      System.out.print("\nString Array: ");
      displayArray(stringArray);
      System.out.print("First Index Array: ");
      System.out.println(firstIndex(charArray));
      System.out.println();
      
   }
   
   // Generic method
   public static <Thing> void displayArray(Thing[] array) {

      for(Thing x : array) {
         System.out.print(x+" ");
      }
      System.out.println();
   }
  
   // Generic method with generic return type 
   public static <Thing> Thing firstIndex(Thing[] array) {

		return array[0];
   }
}


