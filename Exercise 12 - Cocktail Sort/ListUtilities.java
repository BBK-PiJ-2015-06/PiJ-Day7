public class ListUtilities {
	
	public static LinkedList bubbleSort(LinkedList originalList) {
		int[] array = toArrayList(originalList);
		int[] arrayTemp = toArrayList(originalList);
		boolean finished = false;
		while (!finished) {
			forwardPass(arrayTemp);
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
	
	public static LinkedList cocktailSort(LinkedList originalList) {
		int[] array = toArrayList(originalList);
		int[] arrayTemp = toArrayList(originalList);
		boolean finished = false;
		while (!finished) {
			forwardPass(arrayTemp);
			reversePass(arrayTemp);
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
	
	public static int[] forwardPass(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] > array[i+1]) {
				int store = array[i+1];
				array[i+1] = array[i];
				array[i] = store;
			}
		}
		return array;
	}
	
	public static int[] reversePass(int[] array) {
		for(int i = (array.length - 1); i > 0; i--) {
			if(array[i] < array[i-1]) {
				int store = array[i-1];
				array[i-1] = array[i];
				array[i] = store;
			}
		}
		return array;
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