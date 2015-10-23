public class Patient {
	
	private String name;
	private int age;
	private String illness;
	private Patient next;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.next = null;
	} 
	
	public Patient getNext() {
		return this.next;
	}
	
	public void setNext(Patient patient) {
		this.next = patient;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getIllness() {
		return this.illness;
	}
	
}