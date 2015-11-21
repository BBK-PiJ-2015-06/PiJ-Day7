public class SortedList {
	
	private IntegerNode listStart;
	
	public SortedList() {
		listStart = new IntegerNode();
	}
	
	public void add(IntegerNode newNode) {
		System.out.println("Adding " + newNode.getValue() + "...");
		if(listStart.getNext() == null) {
			listStart.setNext(newNode);
		} else {
			IntegerNode current = listStart;
			while(current.getNext().getValue() < newNode.getValue()) {
				current = current.getNext();
				if(current.getNext() == null) {
					current.setNext(newNode);
					return;
				}
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);
		}
	}
	
	public void print() {
		if(listStart.getNext() == null) {
			System.out.println("List is empty");
		} else {
			IntegerNode current = listStart.getNext();
			do {
				System.out.println(current.getValue());
				current = current.getNext();
			} while (current != null);
		}
	}
}