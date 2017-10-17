package skeleton;

public abstract class AbstractTruckFactory {
	
	// TODO
	private static final AbstractTruckFactory TOYOTA_FLEET_FACTORY = null;
	
	//TODO
	private static final AbstractTruckFactory FORD_FLEET_FACTORY = null;
	
	static AbstractTruckFactory getFactoryInstance(Manufacturer manufacturer) {
		
		AbstractTruckFactory instance = null;
		switch(manufacturer) {
		case Toyota: 
			instance = TOYOTA_FLEET_FACTORY;
			break;
		case Ford:
			instance = FORD_FLEET_FACTORY;
			break;
		}
		return instance;
	}
	
	public abstract Truck createDoubleCab();
	public abstract Truck createClubCab();
}
