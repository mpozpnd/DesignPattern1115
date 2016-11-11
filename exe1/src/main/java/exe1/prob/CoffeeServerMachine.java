package exe1.prob;

public abstract class CoffeeServerMachine extends CoffeeServer{
	int OS=-1;
	static int WIN10=0, OSX =1, UBUNTU=2, CentOS=3, Gentoo=4;
	String[] OSName = {"Win10","OSX","ubuntu","centOS","Gentoo"};
	public void uname(){
		System.out.println(OSName[OS]);
	}
	public CoffeeServerMachine(int OS){
		this.OS = OS;
	}
}
