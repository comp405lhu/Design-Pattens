package skeleton;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

	private static final Scanner keyboard = new Scanner(System.in);

	private static ArrayList<Truck> fleet = new ArrayList<>();

	public static void main(String[] args) {
		
		System.out.println("*** ACME Truck Leasing ***");

		System.out.println("What manufactuer would you like?");
		Manufacturer[] vals = Manufacturer.values();
		for (int i = 0; i < vals.length; i++) {
			System.out.println((i+1) +". " + vals[i]);
		}
		int resp = 0;
		while (resp < 1 ||  resp > vals.length+1){
			System.out.print("Enter choice ["+1+":"+(vals.length)+"] : ");
			resp = keyboard.nextInt();
		}
		Manufacturer manufacturer = vals[resp-1];

		AbstractTruckFactory factory = null;

		if (resp == 1) {
			factory = AbstractTruckFactory.getFactoryInstance(Manufacturer.Toyota);
			manufacturer = Manufacturer.Toyota;
		} else {
			factory = AbstractTruckFactory.getFactoryInstance(Manufacturer.Ford);
			manufacturer = Manufacturer.Ford;
		}

		if (factory == null){
			System.out.println("Concrete classes not implemented!");
			System.exit(0);
		}
		System.out.print("Enter number of Double Cabs desired: ");
		int dcabs = keyboard.nextInt();

		System.out.print("Enter number of Club Cabs desired: ");
		int ccabs = keyboard.nextInt();

		for (int i = 0; i < dcabs; i++) {
			fleet.add(factory.createDoubleCab());
		}
		for (int i = 0; i < ccabs; i++) {
			fleet.add(factory.createClubCab());

		}

		System.out.println("Your fleet has " + fleet.size() + " " + manufacturer + " trucks: ");
		for (Truck t : fleet) {
			System.out.println(t);
		}
	}

}
