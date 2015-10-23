public class HospitalManager {
	
	private Patient startList;
	
	public HospitalManager() {
		startList = null;
	}
	
	//Main for testing.
	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		for(int i = 0; i < 5; i++) {
			hm.addPatient();
			System.out.println("");
		}
		hm.printList();
		hm.deletePatient();
		hm.deletePatient();
		hm.printList();
		for(int i = 0; i < 1; i++) {
			hm.addPatient();
			System.out.println("");
		}
		hm.deletePatient();
		hm.printList();
	}
	
	//Method for receiving user input and creating a new patient from these details.
	public Patient addPatientDetails() {
		System.out.print("Name of new patient: ");
		String name = System.console().readLine();
		System.out.print("Age: ");
		String s = System.console().readLine();
		int age = Integer.parseInt(s);
		System.out.print("Illness: ");
		String illness = System.console().readLine();
		Patient newPatient = new Patient(name, age, illness);
		return newPatient;
	}
	
	//Method for printing out patient details.
	public void printPatient(Patient patient) {
		System.out.println("Name: " + patient.getName());
		System.out.println("Age: " + patient.getAge());
		System.out.println("Illness: " + patient.getIllness());
		System.out.println("");
	} 
	
	//Method for adding a paient to the list.
	public void addPatient() {
		Patient newPatient = addPatientDetails();
		if(startList == null) {
			startList = newPatient;
			return;
		}
		Patient index = startList;
		while(index.getNext() != null) {
			index = index.getNext();
		}
		index.setNext(newPatient);
		newPatient.setPrev(index);
	}
	
	//Method for priting out whole list forwards and backwards.
	public void printList() {
		if(startList == null) {
			System.out.println("There are no patients in this list!");
		} else {
			Patient current = startList;
			while(current.getNext() != null) {
				printPatient(current);
				current = current.getNext();
				if(current.getNext() == null) {
					printPatient(current);
				} //if statement required to print last patient on the list.
			}
			while(current != startList) {
				printPatient(current);
				current = current.getPrev();
			}
			printPatient(startList);
		}
	}
	
	//Method for deleting elements from list.
	public int deletePatient() {
		if(startList == null) {
			System.out.println("There are no patients in the list.");
			return 1;
		}
		System.out.print("Please insert name of patient to be deleted: ");
		String name = System.console().readLine();
		Patient current = startList;
		if(current.getName().equals(name)) {
			startList = current.getNext();
			current.getNext().setPrev(startList);
			return 0;
		}
		while(current.getNext() != null) {
			//if the next patient in the list is the one to be deleted.
			//AND it is not the last patient in the list.
			if(current.getNext().getName().equals(name) && current.getNext().getNext() != null) {
				current.setNext(current.getNext().getNext());
				current.getNext().setPrev(current);
				return 0;
			//if the next patient in the list is the one to be deleted.
			//AND it is the last patient in the list.
			} else if(current.getNext().getName().equals(name) && current.getNext().getNext() == null) {
				current.getNext().setPrev(current.getNext().getNext());
				current.setNext(current.getNext().getNext());
				return 0;
			} else {
				current = current.getNext();
			} 
		}
		System.out.println("There are no patients with that name in the current list.");
		return 1;
	}	
}