public class IntegerNode {
	
	private int number;
	private IntegerNode nextNode;
	
	public IntegerNode(int number) {
		this.number = number;
		this.nextNode = null;
	}
	
	public IntegerNode() {
		this.nextNode = null;
	}
	
	public void push(IntegerNode newIntegerNode) {
		System.out.println("Pushing " + newIntegerNode.number + "...");
		newIntegerNode.nextNode = this.nextNode;
		this.nextNode = newIntegerNode;
	}
	
	public void pop() {
		if(this.empty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.print("Popping...");
			int value = this.nextNode.number;
			this.nextNode = this.nextNode.nextNode;
			System.out.println(" it's a " + value);
		}
	}
	
	public boolean empty() {
		if(this.nextNode == null) {
			return true;
		} else {
			return false;
		}
	}
	
}