package rentACar;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car(1, "Audi");
		
		CarManager manager = new CarManager(new CarMsSqlDao());
		manager.add(car);

	}

}
