public class IntegerNode {
    private int n; 
    private IntegerNode next;

    public IntegerNode(int n) {
	  this.n = n;
	  this.next = null;
    }

    public int getNumber() {
	  return n;
    }

    public IntegerNode getNext() {
	  return next;
    }

    public void setNext(IntegerNode n) {
	  this.next = n;
    }
	
	public void printList() {
		do {
			System.out.println(this.n);
			this.n = this.getNext().n;
		} while(this.getNext() != null);
	}
	
	public void addInt(IntegerNode x) {
		if(this.getNext() == null) {
			this.setNext(x);
		} else {
			this.getNext().addInt(x);
		}
	}
}