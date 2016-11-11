package exe1.ans;

public class CoffeeServer {
	ServeImpl impl;
	public CoffeeServer(ServeImpl impl){
		this.impl = impl;
	}
	
	void Serve(){
		impl.rawServe();
		System.out.println("----------------------");
	}
}
