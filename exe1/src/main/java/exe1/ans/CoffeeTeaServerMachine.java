package exe1.ans;

public class CoffeeTeaServerMachine extends CoffeeServerMachine{
	void serveTea(){
 		System.out.println("🍵️");
		System.out.println("----------------------");
	};
	public CoffeeTeaServerMachine(ServeImpl impl, int OS){
		super(impl, OS);
	}
}
