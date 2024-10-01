package nome1.calcolatore;

public class Calcolatrice {
	
	private int somma(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Calcolatrice c = new Calcolatrice();
		int result = c.somma(5, 7);
		
		System.out.println("Faccio la somma di 5 e 7");
		System.out.println("La somma è "+ result);
	}
}
