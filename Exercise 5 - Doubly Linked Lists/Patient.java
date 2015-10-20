public class Patient {
	
	//Fields
	private String name;
	private int age;
	private String illness;
	private Patient next;
	private Patient prev;
	
	//Constructor method
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.next = null;
		this.prev = null;
	}
}