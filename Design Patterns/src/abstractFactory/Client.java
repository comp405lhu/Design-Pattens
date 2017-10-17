package abstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory = AbstractFactory.getFactoryInstance(Architecture.INTEL);
		CentralProcessingUnit cpu = factory.createCPU();
		DRAMController mmu = factory.createMMU();
	}

}
