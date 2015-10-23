public class HospitalManager {

	private Patient startList;
	
	public HospitalManager() {
		startList = null;
	}
	
	public static void main(String [] args) {
		HospitalManager hm = new HospitalManager();
		
		//Part 1
		for(int i = 0; i < 5; i++) {
			System.out.print("Please provide name of patient: ");
			String name = System.console().readLine();
			System.out.print("Age: ");
			int age = Integer.parseInt(System.console().readLine());
			System.out.print("Illness: ");
			String illness = System.console().readLine();
			System.out.println("");
			Patient newPatient = new Patient(name, age, illness);
			hm.addPatient(newPatient);
		}
		
		//Part2
		hm.printList();
		
		//Part3
		hm.deletePatient();
		hm.deletePatient();
		
		//Part4
		hm.printList();
		
		//Part5
		System.out.print("Please provide name of patient: ");
		String name = System.console().readLine();
		System.out.print("Age: ");
		int age = Integer.parseInt(System.console().readLine());
		System.out.print("Illness: ");
		String illness = System.console().readLine();
		System.out.println("");
		Patient newPatient = new Patient(name, age, illness);
		hm.addPatient(newPatient);
		hm.deletePatient();
		
		//Part6
		hm.printList();
	}
	
	//Method for adding a patient to the list.
	private void addPatient(Patient patient) {
		if(startList == null) {
			startList = patient;
			patient.setNext(startList);
		} else {
			Patient index = startList;
			while(index.getNext() != startList) {
				index = index.getNext();
			}
			index.setNext(patient);
			patient.setNext(startList);
		}
	}
	
	//Method for printing the list.
	private void printList() {
		if(startList == null) {
			System.out.println("There are no patients in the list!");
			return;
		}
		Patient current = startList;
		do {
			System.out.println("Name:    " + current.getName());
			System.out.println("Age:     " + current.getAge());
			System.out.println("Illness: " + current.getIllness());
			System.out.println("");
			current = current.getNext();
		} while(current != startList);
	}
	
	//Method for deleting a patient.
	private int deletePatient() {
		if(startList == null) {
			System.out.println("There are no patients in the list!");
			return 1;
		}
		System.out.print("Name of patient to be deleted: ");
		String name = System.console().readLine();
		Patient current = startList;
		while(current.getNext() != startList) {
			if(current.getNext().getName().equals(name)) {
				current.setNext(current.getNext().getNext());
				return 0;
			} else {
				current = current.getNext();
				if(current.getNext() == startList && current.getNext().getName().equals(name)) {
					current.setNext(current.getNext().getNext());
					startList = current.getNext();
					return 0;
				}
			}
		}
		System.out.println("There is no patient that matches this name.");
		return 1;
	}
}