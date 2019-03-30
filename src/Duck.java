import javax.swing.JOptionPane;

public class Duck {
	public static void main(String[] args) {

		Duck duck1 = new Duck("Pizza", 5);
		Duck duck2 = new Duck("pasta", 6);

	}

	int numberOfFriends;
	String favoriteFood;
	

	void quak() {
JOptionPane.showInputDialog("re you fat?");
	}

	void waddle() {

	}

	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
}
