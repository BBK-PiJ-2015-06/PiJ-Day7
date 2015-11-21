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
	
	public int getValue() {
		return number;
	}
	
	public IntegerNode getNext() {
		return nextNode;
	}
	
	public void setNext(IntegerNode node) {
		this.nextNode = node;
	}
}