package rentACar;

public class CarManager implements CarService{
	
private CarDao carDao;
	
	public CarManager(CarDao carDao) {
		super();
		this.carDao = carDao;
	}
	
private CarLog carLog;
	
	public CarManager(CarLog carLog) {
		super();
		this.carLog = carLog;
	}


	@Override
	public void add(Car car) {
		this.carDao.add(car);
		this.carLog.add(car);
		
	}

	@Override
	public void update(Car car) {
	this.carDao.update(car);
		
	}

	@Override
	public void delete(Car car) {
		this.carDao.delete(car);
		
	}
	

}
