package aula05;

public class OperadorUnario {

	public static void main(String[] args) {
		int num = 1;
		System.out.println("Valor do num = " + num);
		
		num = num + 1;  // somando 1
		System.out.println("Valor do num = " + num);
		
		num += 1;  // somando 1
		System.out.println("Valor do num = " + num);

		num++;   // somando 1
		System.out.println("Valor do num = " + num);
		
		++num;    // somando 1
		System.out.println("Valor do num = " + num);
		
		num = num - 1;  // subtraindo 1
		System.out.println("Valor do num = " + num);
		
		num -= 1;  // subtraindo 1
		System.out.println("Valor do num = " + num);	

		num--;  // subtraindo 1
		System.out.println("Valor do num = " + num);
		
		--num;  // subtraindo 1
		System.out.println("Valor do num = " + num);		
	}

}

