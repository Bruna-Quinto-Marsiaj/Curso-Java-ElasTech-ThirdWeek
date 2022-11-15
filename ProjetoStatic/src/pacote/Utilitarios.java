package pacote;

public class Utilitarios {
	
	public static final double PI = 3.14; //variável tbm pode ser estática
	
	public static int soma(int x, int y) { // quando eu faço métodos estáticos eu não preciso dar new na classe, estanciar
		return x + y;
	}
	
	public static int potencia(int x, int y) {
		if ( y == 0) {
			return 1;
		}
		else {
			int pot=1;
			for (int cont=1; cont<=y; cont++) {
				pot = pot * x;
			}
			return pot;
		}
	}

}
