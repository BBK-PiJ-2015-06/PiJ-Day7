public class TestSortedList {
	
	public static void main(String[] args) {
		SortedList myList = new SortedList();
		
		IntegerNode n8 = new IntegerNode(8);
		myList.add(n8);
		
		myList.print();
		
		IntegerNode n2 = new IntegerNode(2);
		myList.add(n2);
		
		myList.print();
		
		IntegerNode n10 = new IntegerNode(10);
		myList.add(n10);
		
		myList.print();
		
		IntegerNode n30 = new IntegerNode(30);
		myList.add(n30);
		
		myList.print();
		
		IntegerNode n9 = new IntegerNode(9);
		myList.add(n9);
		
		myList.print();
		
		IntegerNode n16 = new IntegerNode(16);
		myList.add(n16);
		
		myList.print();
		
		IntegerNode n25 = new IntegerNode(25);
		myList.add(n25);
		
		myList.print();
	}
}