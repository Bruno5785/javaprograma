package aula25;

public class ThreadSoma implements Runnable {
	
	private String id;
	private static int cont = 0;
	
	public ThreadSoma(String id) {
		this.id
 = id;	}

	@Override
	public void run() {
		for (int i=0 ; i<100000 ; i++) {
			incrementa();
			System.out.println(id + ": " + cont);
		}
		
	}
	
	private void incrementa() {
		int temp = cont;
		for (int i=0 ; i<10 ; i++) {
			System.out.println("");
		}
		
		cont = temp + 1;
	}
		
	
	
}
