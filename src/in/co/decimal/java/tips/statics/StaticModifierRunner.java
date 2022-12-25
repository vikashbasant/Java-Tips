package in.co.decimal.java.tips.statics;

class Player {
	private String name;
	private static int count;

	public Player() {
		// default constructor:
	}

	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	// static method:
	public static int getCount() {
		return count;
	}

}
public class StaticModifierRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldo");

		Player player2 = new Player("Federer");

		// here we can access the static method using className:
		System.out.println(Player.getCount());
		System.out.println(Player.getCount());
	}
}
