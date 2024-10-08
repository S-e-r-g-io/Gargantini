package nome1.calcolatore;

public class Calcolatrice {
	
	private int somma(int a, int b) {
		return a+b;
	}
	private int differenza(int a, int b) {
		return a-b;
	}
	private float divisione(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		Calcolatrice c = new Calcolatrice();
		int result = c.somma(5, 7);
		int result2 = c.differenza(5, 7);
		float result3 = c.divisione(5, 7);

		
		System.out.println("Faccio la somma di 5 e 7");
		System.out.println("La somma è "+ result);
		System.out.println("La diff è "+ result2);
		System.out.println("La div è "+ result3);


		// file modificato 
		
	}
}
