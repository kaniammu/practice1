
public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Tata","nexon",140000);
		c1.drive();
		c1.honk();
		System.out.println("manufacturer="+c1.manufacturer+",model="+c1.model+",price="+c1.price);
		Car c2 = new Car("Audi","q8",150000);
		c2.drive();
		c2.honk();
		System.out.println("manufacturer="+c2.manufacturer+",model="+c2.model+",price="+c2.price);
	}
}