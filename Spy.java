public class Spy {
	
	private static int spyCount = -1;
	private int spyID;
	
	public Spy(int id) {
		this.spyID = id;
		spyCount++;
		System.out.println("Spy ID: " + spyID);
		System.out.println("Total number of spies so far: " + spyCount);
	}
	
	public void die() {
		System.out.println("Spy " + this.spyID + " has been detected and eliminated.");
		spyCount--;
		System.out.println("Total number of spies remaining: " + spyCount);
	}
	
	public static void main(String[] args) {
		Spy spyNetwork = new Spy(0);
		spyNetwork.launch();
	}
	
	private void launch() {
		Spy spy1 = new Spy(1);
		Spy spy2 = new Spy(2);
		Spy spy3 = new Spy(3);
		Spy spy4 = new Spy(4);
		Spy spy5 = new Spy(5);
		Spy spy6 = new Spy(6);
		Spy spy7 = new Spy(7);
		Spy spy8 = new Spy(8);
		
		spy6.die();
		spy3.die();
	}
}