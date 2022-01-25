package rentACar;

public class DbLog implements CarLog{

	@Override
	public void add(Car car) {
		System.out.println("Database'ye loglandı!");
		
	}


}
