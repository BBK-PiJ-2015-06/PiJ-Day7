public class TestStack {
	
	private IntegerNode myStack;
	
	public TestStack() {
		myStack = new IntegerNode();
	}
	
	public static void main(String[] args) {
		TestStack launcher = new TestStack();
		launcher.launch();
	}
	
	private void launch() {
		IntegerNode push5 = new IntegerNode(5);
		myStack.push(push5);
		
		IntegerNode push8 = new IntegerNode(8);
		myStack.push(push8);
		
		IntegerNode push12 = new IntegerNode(12);
		myStack.push(push12);
		
		myStack.pop();
		
		IntegerNode push13 = new IntegerNode(13);
		myStack.push(push13);
		
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
	}
	
}