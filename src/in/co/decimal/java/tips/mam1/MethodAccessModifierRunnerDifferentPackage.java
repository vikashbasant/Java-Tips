package in.co.decimal.java.tips.mam1;

import in.co.decimal.java.tips.mam.ExampleClass;

public class MethodAccessModifierRunnerDifferentPackage {
	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
		// here privateMethod,protectedMethod, defaultMethod is not visible:
		//		exampleClass.privateMethod();
		//		exampleClass.protectedMethod();
		//		exampleClass.defaultMethod();
	}
}
