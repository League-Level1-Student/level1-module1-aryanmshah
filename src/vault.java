
public class vault {

	int secret;

	public vault(int secret) {
		this.secret = secret;

	}

	public static void main(String[] args) {

		vault Vault = new vault(1055);
		boolean ans = Vault.trycode(051005);
		System.out.println(ans);
	}

	boolean trycode(int num) {
		if (secret == num) {
			return true;
		} else {
			return false;
		}

	}
}
