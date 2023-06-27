public class Main {

 public static void main(String[] args) {
  
  // method chaining =  a common syntax for invoking multiple method calls in OOP
  //      condense code into less lines
  
  String name = "      What";
  
  
  //name = name.concat(" code   ");
  //name = name.toUpperCase();
  //name = name.trim();
  
  name = name.concat("sup").concat("..dude").toUpperCase().trim();
  
  System.out.println(name);
   
 }
}