public class HospitalManager {
	
	private Patient startList;
	
	//Constructor method
	public HospitalManager() {
		startList = null;
	}
	
	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		System.out.println("Please select an option from the menu below:");
		System.out.println("");
		boolean finish = false;
		while(!finish) {
			System.out.println("1 - Add a new group of patients to the list. Finish by typing 0.");
			System.out.println("2 - Delete a patient from the list.");
			System.out.println("3 - Print all patients in the list.");
			System.out.println("4 - QUIT");
			System.out.print("> ");
			String input = System.console().readLine();
			int choice = Integer.parseInt(input);
			System.out.println(""); //blank lines purely for aesthetic purposes.
			switch(choice) {
				case 1:
					hm.addPatient();
					boolean done = false;
					while(!done) {
						System.out.println("");
						System.out.println("Do you want to input another patient?");
						System.out.println("1 - Yes");
						System.out.println("Any other key - No");
						System.out.print(">");
						String num = System.console().readLine();
						if(num.equals("1")) {
							hm.addPatient();
						} else {
							done = true;
						}
					}
					break;
				case 2:
					hm.deletePatient();
					break;
				case 3:
					hm.printList();
					break;
				case 4:
					System.out.println("Exiting...");
					finish = true;
					break;
				default:
					System.out.println("This is not a valid input!");
					break;
			}
		}	
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
	
	//Method for printing whole patient list.
	public void printList() {
		Patient current = startList;
		if(current == null) {
			System.out.println("There are no patients in the current list!");
		}
		while(current != null) {
			System.out.println("Name: " + current.getName());
			System.out.println("Age: " + current.getAge());
			System.out.println("Illness: " + current.getIllness());
			System.out.println("");
			current = current.getNext();
		}
	}
	
	//Method for deleting a patient from the list.
	public int deletePatient() {
		if(startList == null) {
			System.out.println("There are no patients in the current list.");
			return 1;
		}
		System.out.print("Please insert name of patient to be deleted: ");
		String name = System.console().readLine();
		Patient index = startList;
		if(index.getName().equals(name)) {
			startList = index.getNext();
			return 0;
		} else {
			while(index.getNext() != null) {
				if(index.getNext().getName().equals(name)) {
					index.setNext(index.getNext().getNext());
					return 0;
				} else {
					index = index.getNext();
				} 
			}
		}
		System.out.println("There are no patients with that name in the current list.");
		return 1;
	}
}