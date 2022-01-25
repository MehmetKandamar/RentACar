package rentACar;

public class CarOracleDao implements CarDao{

	@Override
	public void add(Car car) {
		System.out.println("Oracle'ye eklendi");
		
	}

	@Override
	public void update(Car car) {
		System.out.println("Oracle'ye g�ncellendi");
		
	}

	@Override
	public void delete(Car car) {
		System.out.println("Oracle'den silindi");
		
	}

}
