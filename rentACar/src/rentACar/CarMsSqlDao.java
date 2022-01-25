package rentACar;

public class CarMsSqlDao implements CarDao{

	@Override
	public void add(Car car) {
		System.out.println("MySql'e eklendi");
		
	}

	@Override
	public void update(Car car) {
		System.out.println("MySql'e güncellendi");
		
	}

	@Override
	public void delete(Car car) {
		System.out.println("MySql'den silindi");
		
	}

}
