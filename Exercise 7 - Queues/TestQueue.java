public class TestQueue {
	
	private IntegerNode myQueue;
	
	public TestQueue() {
		myQueue = new IntegerNode();
	}
	
	public static void main(String[] args) {
		TestQueue launcher = new TestQueue();
		launcher.launch();
	}
	
	private void launch() {
		System.out.println("There are " + myQueue.size() + " requests in the queue.");
		IntegerNode request5 = new IntegerNode(5);
		myQueue.insert(request5);
		IntegerNode request8 = new IntegerNode(8);
		myQueue.insert(request8);
		IntegerNode request12 = new IntegerNode(12);
		myQueue.insert(request12);
		System.out.println("There are " + myQueue.size() + " requests in the queue.");
		myQueue.retrieve();
		IntegerNode request13 = new IntegerNode(13);
		myQueue.insert(request13);
		System.out.println("There are " + myQueue.size() + " requests in the queue.");
		myQueue.retrieve();
		myQueue.retrieve();
		System.out.println("There are " + myQueue.size() + " requests in the queue.");
		myQueue.retrieve();
		System.out.println("There are " + myQueue.size() + " requests in the queue.");
		myQueue.retrieve();
	}
}