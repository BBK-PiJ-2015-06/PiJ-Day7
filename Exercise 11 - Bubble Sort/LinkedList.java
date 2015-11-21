public class LinkedList {
	
	private Node start;
	
	public LinkedList() {
		this.start = null;
	}
	
	public void add(Node newNode) {
		if(this.start == null) {
			start = newNode;
		} else {
			Node current = start;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
	}
	
	public void printList() {
		if(this.start == null) {
			System.out.println("Empty List");
		} else {
			Node current = start;
			do {
				System.out.println(current.getValue());
				current = current.getNext();
			} while(current != null);
		}
	}
	
	public int size() {
		int result = 0;
		if(this.start == null) {
			return result; 
		} else {
			Node current = start;
			do {
				result++;
				current = current.getNext();
			} while(current != null);
			return result;
		}
	}
	
	public Node getStart() {
		return start;
	}
}