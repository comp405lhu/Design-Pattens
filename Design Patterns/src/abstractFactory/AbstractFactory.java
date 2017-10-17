/**
 * 
 */
package abstractFactory;

/**
 * @author kpillai
 *
 */
public abstract class AbstractFactory {
	
	private static final AMDArchitecture AMD_CONFIG = new AMDArchitecture();
	private static final IntelArchitecture INTEL_CONFIG = new IntelArchitecture();
	
	static AbstractFactory getFactoryInstance(Architecture arch) {
		AbstractFactory instance = null;
		switch(arch) {
		case INTEL: 
			instance = INTEL_CONFIG;
			break;
		case AMD:
			instance = AMD_CONFIG;
			break;
		}
		return instance;
	}
	
	
	
	public abstract CentralProcessingUnit createCPU();
	public abstract DRAMController createMMU();
}
