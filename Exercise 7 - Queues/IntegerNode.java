public class IntegerNode {
	
	private int number;
	private IntegerNode nextNumber;
	
	public IntegerNode(int number) {
		this.number = number;
		this.nextNumber = null;
	}
	
	public IntegerNode() {
		this.nextNumber = null;
	}
	
	public void insert(IntegerNode newIntegerNode) {
		System.out.println("Inserting request " + newIntegerNode.number + "...");
		newIntegerNode.nextNumber = this.nextNumber;
		this.nextNumber = newIntegerNode;
	}
	
	public void retrieve() {
		if(this.size() == 0) {
			System.out.println("Queue empty!");
		} else {
			if(this.nextNumber.nextNumber == null) {
				System.out.print("Retrieving request " + this.nextNumber.number + "...");
				this.nextNumber = null;
				System.out.println ("done");
			} else {
				this.nextNumber.retrieve();
			}
		}
	}
	
	public int size() {
		int result = 0;
		IntegerNode currentNode = this;
		while(currentNode.nextNumber != null) {
			result++;
			currentNode = currentNode.nextNumber;
		}
		return result;
	}
	
}