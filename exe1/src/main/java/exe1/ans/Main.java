package exe1.ans;

public class Main {
	public static void main(String[] args){
		CoffeeServer cs1 = new CoffeeServer(new DripServeImpl());
		cs1.Serve();
		
		CoffeeServer cs2 = new CoffeeServer(new SiphonServeImpl());
		cs2.Serve();
		
		CoffeeServerMachine cs3 = new CoffeeServerMachine(new DripServeImpl(),CoffeeServerMachine.OSX);
		cs3.Serve();
		cs3.uname();
		
		CoffeeServerMachine cs4 = new CoffeeServerMachine(new SiphonServeImpl(),CoffeeServerMachine.WIN10);
		cs4.Serve();
		cs4.uname();
		
		CoffeeTeaServerMachine cs5 = new CoffeeTeaServerMachine(new DripServeImpl(),CoffeeServerMachine.CentOS);
		cs5.Serve();
		cs5.serveTea();
		cs5.uname();
		
		CoffeeTeaServerMachine cs6 = new CoffeeTeaServerMachine(new SiphonServeImpl(),CoffeeServerMachine.UBUNTU);
		cs6.Serve();
		cs6.serveTea();
		cs6.uname();
	}
}
