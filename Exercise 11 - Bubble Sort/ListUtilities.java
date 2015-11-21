public class ListUtilities {
	
	public static LinkedList bubbleSort(LinkedList originalList) {
		int[] array = toArrayList(originalList);
		int[] arrayTemp = toArrayList(originalList);
		boolean finished = false;
		while (!finished) {
			for(int i = 0; i < arrayTemp.length - 1; i++) {
				if(arrayTemp[i] > arrayTemp[i+1]) {
					int store = arrayTemp[i+1];
					arrayTemp[i+1] = arrayTemp[i];
					arrayTemp[i] = store;
				}
			}
			finished = true;
			for(int j = 0; j < arrayTemp.length; j++) {
				if(arrayTemp[j] != array[j]) {
					finished = false;
				}
			}
			for(int k = 0; k < array.length; k++) {
				array[k] = arrayTemp[k];
			}
		}
		LinkedList sortedList = toLinkedList(array);
		return sortedList;
	}
	
	public static int[] toArrayList(LinkedList linkedList) {
		int[] arrayList = new int[linkedList.size()];
		Node current = linkedList.getStart();
		for(int i = 0; i < arrayList.length; i++) {
			arrayList[i] = current.getValue();
			current = current.getNext();
		}
		return arrayList;
	}
	
	public static LinkedList toLinkedList(int[] arrayList) {
		LinkedList linkedList = new LinkedList();
		for(int i = 0; i < arrayList.length; i++) {
			linkedList.add(new Node(arrayList[i]));
		}
		return linkedList;
	}
}