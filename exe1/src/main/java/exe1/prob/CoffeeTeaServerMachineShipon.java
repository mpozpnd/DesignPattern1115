package exe1.prob;

public class CoffeeTeaServerMachineShipon extends CoffeeTeaServerMachine{

	public CoffeeTeaServerMachineShipon(int OS) {
		super(OS);
	}

	@Override
	void serveTea() {
		System.out.println("🍵️");
		System.out.println("----------------------");
	}

	@Override
	void Serve() {
		System.out.println("Siphon Coffee maker...");
		System.out.println("☕️");
		System.out.println("----------------------");		
	}
}
