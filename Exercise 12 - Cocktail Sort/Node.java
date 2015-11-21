public class Node {
	
	private int number;
	private Node nextNode;
	
	public Node(int number) {
		this.number = number;
		this.nextNode = null;
	}
	
	public int getValue() {
		return number;
	}
	
	public Node getNext() {
		return nextNode;
	}
	
	public void setNext(Node nextNode) {
		this.nextNode = nextNode;
	}
	
}