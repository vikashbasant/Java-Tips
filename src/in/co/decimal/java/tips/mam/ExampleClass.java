package in.co.decimal.java.tips.mam;

public class ExampleClass {

	public void publicMethod() {
	}

	protected void protectedMethod() {
	}

	private void privateMethod() {
	}

	void defaultMethod() {
	}

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		// here we can access all the method:
		exampleClass.publicMethod();
		exampleClass.protectedMethod();
		exampleClass.privateMethod();
		exampleClass.defaultMethod();
	}
}
