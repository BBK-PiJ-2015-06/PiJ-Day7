public class Marks {
	
	private int count;
	private int countDistinction;
	private int countPass;
	private int countFail;
	private int countInvalid;
	
	public Marks() {
		this.count = 0;
		this.countDistinction = 0;
		this.countPass = 0;
		this.countFail = 0;
		this.countInvalid = 0;
	}
	
	public void countMarks() {
		System.out.println("Please enter the marks for this class. Finish by typing -1.");
		int mark;
		do {
			System.out.print("> ");
			String s = System.console().readLine();
			mark = Integer.parseInt(s);
			if (mark > 100 || mark < -1) {
				this.countInvalid++;
			} else if (mark >= 70) {
				this.countDistinction++;
			} else if (mark >= 50) {
				this.countPass++;
			} else if (mark >= 0) {
				this.countFail++;
			}
		} while (mark != -1);
		this.count = countDistinction + countPass + countFail + countInvalid;
		System.out.println("");
		System.out.println("Distinctions:        " + this.countDistinction);
		System.out.println("Passes:              " + this.countPass);
		System.out.println("Fails:               " + this.countFail);
		System.out.println("Invalid entries:     " + this.countInvalid);
		System.out.println("Total marks entered: " + this.count);
	}
}