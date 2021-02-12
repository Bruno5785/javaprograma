package aula25;

public class TelaThread {

	public static void main(String[] args) {

		ThreadSoma s1 = new ThreadSoma("S1");
		ThreadSoma s2 = new ThreadSoma("S2");
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t1.start();
		t2.start();
	}

}
