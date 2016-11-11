package exe1.prob;

public class CoffeeServerMachineSiphon extends CoffeeServerMachine{
	public CoffeeServerMachineSiphon(int OS) {
		super(OS);
	}

	@Override
	void Serve() {
		System.out.println("Siphon Coffee maker...");
		System.out.println("☕️");
		System.out.println("----------------------");		
	}
}
