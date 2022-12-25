package in.co.decimal.java.tips.finals;

final class FinalClass {

}

// We can't extends the final classes:
//class SomeClass extends FinalClass{
//	
//}

class SomeClass {
	final public void doSomething() {
	}
}

class ExtendingClass extends SomeClass {
	// can't override the final method from SomeClass
	//	public void doSomething() {}
}

class FinalArguments {
	public void doSomethingElse(final int i) {
		//		The final local variable i cannot be assigned. It must be blank and not using a compound assignment
		//		i = 6;
	}
}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		final int i = 5;
		//		The final local variable i cannot be assigned. It must be blank and not using a compound assignment
		//		i = 7;
	}
}
