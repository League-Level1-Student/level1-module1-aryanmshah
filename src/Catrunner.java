
public class Catrunner {
public static void main(String[] args) {
	Cat p= new Cat("gato");
	p.meow();
	p.printName();
	for (int i = 0; i < 9; i++) {
		p.kill();
	}
}
}
