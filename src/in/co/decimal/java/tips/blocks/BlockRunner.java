package in.co.decimal.java.tips.blocks;

public class BlockRunner {

	public static void main(String[] args) {
		System.out.println("Main");
		{
			int i = 0;
			System.out.println("3>2");
			System.out.println("2<3");
		}
		// here we can try to access the i(integer) outside the block
		// so it gives an error.
		//		System.out.println(i);
	}
}
