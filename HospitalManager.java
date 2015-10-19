public class HospitalManager {
	private Patient patientListStart = null;
	
	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		hm.launch();
	}
	
	private void launch() {
		Patient firstPatient = new Patient("Amy", 25, "broken arm");
		patientListStart = firstPatient;
		boolean finished = false;
		while (!finished) {
			System.out.println("Please enter name of next patient.");
			System.out.println("Finish by typing 0.");
			System.out.print("> ");
			String name = System.console().readLine();
			if (name.equals("0")) {
				finished = true;
				break;
			} else {
				System.out.println("Please enter age of this patient.");
				System.out.print("> ");
				String s = System.console().readLine();
				int age = Integer.parseInt(s);
				System.out.println("Please enter illness of this patient.");
				System.out.print("> ");
				String illness = System.console().readLine();
				Patient nextPatient = new Patient(name, age, illness);
				patientListStart.addPatient(nextPatient);
			}
		}
		System.out.println(" ");
		patientListStart.printList();
		System.out.print("Please type the name of the patient you want to remove: ");
		String s = System.console().readLine();
		patientListStart.deletePatient(s);
		System.out.println(" ");
		patientListStart.printList();
	}
}