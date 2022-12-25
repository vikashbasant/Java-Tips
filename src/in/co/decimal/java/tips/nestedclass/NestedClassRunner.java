package in.co.decimal.java.tips.nestedclass;

class DefaultClass {

}

public class NestedClassRunner {

	int i;

	class InnerClass {
		public void method() {
			i = 5;
		}
	}

	static class StaticNestedClass {
		public void method() {
			// inside the static method we can't access the non static varaible.
			//			i = 5;
		}
	}

	public static void main(String[] args) {

//		No enclosing instance of type NestedClassRunner is accessible. 
		//		Must qualify the allocation with an enclosing instance of type NestedClassRunner 
		//		(e.g. x.new A() where x is an instance of NestedClassRunner).

//		InnerClass innerClass = new InnerClass();

//		only this way we can create an object of InnerClass:
		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();

		StaticNestedClass staticNestedClass = new StaticNestedClass();
	}
}
