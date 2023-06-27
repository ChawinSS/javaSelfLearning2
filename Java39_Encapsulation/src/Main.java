public class Main{
    public static void main(String[] args){
		Cars car= new Cars("Chevrolt","Camaro",2021);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
    
		car.setYear(2022);

		System.out.println(car.getYear());
	}
}