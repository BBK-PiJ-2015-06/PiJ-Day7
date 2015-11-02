public class ListUtilities {
	
	public static IntegerNode arrayToList(int[] array) {
		IntegerNode currentInt = new IntegerNode(array[0]);
		int listLength = array.length;
		for(int count = 1; count < listLength; count++) {
			IntegerNode nextInt = new IntegerNode(array[count]);
			currentInt.addInt(nextInt);
		}
		return currentInt;
	}
}