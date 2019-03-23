
public class James {

	public static void main(String[] args) {
		James j = new James();
		vault v = new vault(1055);
		int a = j.findCode(v);
		System.out.println(a);
	}

	boolean flag = false;

	int findCode(vault b) {

		for (int i = 0; i < 1000000; i++) {

			if (b.secret == i) {
				System.out.println(b.secret);
				flag = true;
			

			}
		}
		if (flag == true) {
			return b.secret;
		} else {
			return -1;
		}

	}
}
