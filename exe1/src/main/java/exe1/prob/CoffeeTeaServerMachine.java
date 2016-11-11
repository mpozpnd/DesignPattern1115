package exe1.prob;

public abstract class CoffeeTeaServerMachine extends CoffeeServerMachine{
	public CoffeeTeaServerMachine(int OS){
		super(OS);
	}
	void serveTea() {
		System.out.println("🍵️");
		System.out.println("----------------------");
	}
}
