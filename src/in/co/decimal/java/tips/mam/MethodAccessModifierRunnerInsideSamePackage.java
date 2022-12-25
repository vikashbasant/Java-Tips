package in.co.decimal.java.tips.mam;

public class MethodAccessModifierRunnerInsideSamePackage {
	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
		// here privateMethod is not visible:
//		exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.defaultMethod();
	}
}
