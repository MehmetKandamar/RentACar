package rentACar;

public class SourceLog implements CarLog{

	@Override
	public void add(Car car) {
		System.out.println("Dosya'ya loglandı!");
		
	}


}
