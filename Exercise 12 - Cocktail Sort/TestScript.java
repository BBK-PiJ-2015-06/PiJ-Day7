public class TestScript {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Node(1));
		list.add(new Node(11));
		list.add(new Node(12));
		list.add(new Node(101));
		list.add(new Node(50));
		list.add(new Node(8));
		list.add(new Node(1));
		list.add(new Node(2));
		list.add(new Node(97));
		list.add(new Node(60));
		list.add(new Node(45));
		list.add(new Node(33));
		list.add(new Node(21));
		list.add(new Node(69));
		list.add(new Node(78));
		list.add(new Node(77));
		list.add(new Node(109));
		list.add(new Node(98));
		list.add(new Node(82));
		list.add(new Node(22));
		list.add(new Node(15));
		list.add(new Node(9));
		list.add(new Node(16));
		list.add(new Node(30));
		list.add(new Node(45));
		list.add(new Node(100));
		list.add(new Node(200));
		list.add(new Node(53));
		list.add(new Node(100));
		list.add(new Node(200));
		list.add(new Node(53));
		list.add(new Node(1));
		list.add(new Node(11));
		list.add(new Node(12));
		list.add(new Node(101));
		list.add(new Node(50));
		list.add(new Node(8));
		list.add(new Node(1));
		list.add(new Node(2));
		list.add(new Node(97));
		list.add(new Node(60));
		list.add(new Node(45));
		list.add(new Node(33));
		list.add(new Node(21));
		list.add(new Node(69));
		list.add(new Node(78));
		list.add(new Node(77));
		list.add(new Node(109));
		list.add(new Node(98));
		list.add(new Node(82));
		list.add(new Node(22));
		list.add(new Node(15));
		list.add(new Node(9));
		list.add(new Node(16));
		list.add(new Node(30));
		list.add(new Node(45));
		list.add(new Node(100));
		list.add(new Node(200));
		list.add(new Node(53));
		list.add(new Node(100));
		list.add(new Node(200));
		list.add(new Node(53));
		
		double start = System.currentTimeMillis();
		LinkedList sortedList2 = ListUtilities.cocktailSort(list);
		double finish = System.currentTimeMillis();
		sortedList2.printList();
		System.out.println("Time taken: " + (finish - start) + " milliseconds");
		
		start = System.currentTimeMillis();
		LinkedList sortedList = ListUtilities.bubbleSort(list);
		finish = System.currentTimeMillis();
		sortedList.printList();
		System.out.println("Time taken: " + (finish - start) + " milliseconds");
	}
	
}