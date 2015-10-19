public class Patient {
	
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	
	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public void printElement() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Illness: " + this.illness);
		System.out.println(" ");
	}
	
	public void printList() {
		this.printElement();
		if(this.nextPatient != null) {
			nextPatient.printList();
		}
	}
	
	public void deletePatient(String name) {
		if (this.nextPatient == null) {
			System.out.println("Patient to remove not found.");
		} else if (this.nextPatient.name.equals(name)) {
			this.nextPatient = nextPatient.nextPatient;
		} else {
			this.nextPatient.deletePatient(name);
		}
	}
}